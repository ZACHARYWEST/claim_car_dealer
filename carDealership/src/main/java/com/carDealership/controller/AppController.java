package com.carDealership.controller;

import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.carDealership.parent.Admin;
import com.carDealership.parent.Buyer;
import com.carDealership.parent.CarServices;
import com.carDealership.parent.Cars;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

	@Autowired
	CarServices carServices;

	@Autowired
	private HttpServletRequest request;

	@GetMapping({ "home", "index", "/" })
	public String index(Model model, HttpSession session) {
		return "/index";
	}

	@GetMapping("/create")
	public ModelAndView create(Model model, HttpSession session) {
		return new ModelAndView("create", "cars", new Cars());
	}

	@PostMapping("/createListing")
	public String handleCreate(Model model, @ModelAttribute("cars") Cars car, HttpSession session) {
		car.setDateOnLot(java.time.LocalDate.now());
		car.setStock();
		car.setPending(false);
		car.setSold(false);
		car.setPicture("/static/images/hvfdim5vvzikpof4ubac.jpg");
		carServices.saveListing(car);
		model.addAttribute("newCar", car);
		return "thank-you";
	}

	@GetMapping("listings")
	public String listings(Model model, HttpSession session) {
		model.addAttribute("cars", carServices.findAll());

		return ("listings");
	}

	@GetMapping("viewlisting-{stock}")
	public String viewlisting(Model model, @PathVariable String stock, RedirectAttributes redirect,
			HttpSession session) {

		model.addAttribute("viewcar", carServices.findByStock(stock));

		model.addAttribute("bid", bidPrice(stock));

		if (bidPrice(stock) == true) {
			double discount = carServices.findByStock(stock).getPrice() * .1;
			double newprice = carServices.findByStock(stock).getPrice() - discount;
			model.addAttribute("newprice", newprice);
		}

		return "view";
	}

	@PostMapping("/purchasevehicle-{stock}")
	public String handleBuyer(Model model, @ModelAttribute Buyer buyer, @ModelAttribute Cars car,
			@PathVariable String stock, HttpSession session) {
		carServices.findByStock(stock).setPending(true);

		if (bidPrice(stock) == true) {
			double discount = carServices.findByStock(stock).getPrice() * .1;
			double newprice = carServices.findByStock(stock).getPrice() - discount;
			carServices.findByStock(stock).setPrice(newprice);
		}

		buyer.setWanted(carServices.findByStock(stock));
		buyer.setCustomerNumber();
		carServices.addTheBuyerID(stock, buyer.getCustomerNumber());
		carServices.updatePending(buyer);
		model.addAttribute("buyer", buyer);
		return "receipt";
	}

	@GetMapping("buyCar-{stock}")
	public String buyCar(Model model, @PathVariable String stock, @ModelAttribute Buyer buyer, HttpSession session) {
		model.addAttribute("cart", carServices.findByStock(stock));

		model.addAttribute("bid", bidPrice(stock));

		if (bidPrice(stock) == true) {
			double discount = carServices.findByStock(stock).getPrice() * .1;
			double newprice = carServices.findByStock(stock).getPrice() - discount;
			model.addAttribute("newprice", newprice);
		}

		return "purchase";
	}

	private boolean bidPrice(String stock) {
		if (ChronoUnit.DAYS.between(carServices.findByStock(stock).getDateOnLot(), java.time.LocalDate.now()) > 120) {
			return true;
		}
		return false;
	}

	@GetMapping("goToRenew-{stock}")
	public String goRenew(Model model, @PathVariable String stock, HttpSession session) {
		model.addAttribute("car", carServices.findByStock(stock));
		return "renewing";
	}

	@PostMapping("/renew-{stock}")
	public String renewCar(Model model, @PathVariable String stock, HttpSession session) {
		carServices.findByStock(stock).setDateOnLot(java.time.LocalDate.now());
		model.addAttribute("renewed", "Your listing has been renewed.");
		return "thank-you";
	}

	@PostMapping("/authenticate")
	String authenticate(@ModelAttribute Admin admin, Model model, HttpSession session) {
		if (admin.getUsername() != null && admin.getPassword() != null) {
			Admin ass = carServices.findAdminByName(admin.getUsername());
			if (ass != null && ass.getPassword().equals(admin.getPassword())) {
				request.getSession().setAttribute("username", ass.getUsername());
				return "adminconsole";
			}
		} else {
			model.addAttribute("error", "Invalid Credentials");
			return "adminlogin";
		}
		model.addAttribute("error", "Invalid Credentials");
		return "adminlogin";

	}

	@GetMapping("/logout")
	String logout(@ModelAttribute Admin admin, Model model, HttpSession session, RedirectAttributes redirect) {
		request.getSession().removeAttribute("username");
		return "redirect:index";
	}

	@GetMapping("pendingsales")
	String pendingsales(@ModelAttribute Buyer buyer, Model model, HttpSession session) {
		model.addAttribute("pending", carServices.findPending());
		return "pendingsales";
	}

	@GetMapping("/approveSale-{stock}")
	public String approve(Model model, @PathVariable String stock) {
		Cars car = carServices.findByStock(stock);
		Buyer buyer1 = carServices.findPendingBuyer(car.getBuyersID());
		car.setPending(false);
		car.setSold(true);
		car.setPurchaseDate(java.time.LocalDate.now());
		car.setBuyer(buyer1.getName());
		carServices.updateHistory(car);
		carServices.removeListing(car);
		buyer1.setWanted(null);
		carServices.addCustomer(buyer1);
		carServices.removePending(buyer1);
		return "pendingsales";
	}

	@GetMapping("/denySale-{stock}")
	public String deny(Model model, @PathVariable String stock) {
		Cars car = carServices.findByStock(stock);
		Buyer buyer1 = carServices.findPendingBuyer(car.getBuyersID());
		carServices.removePending(buyer1);
		carServices.removeTheBuyerID(stock);
		car.setPending(false);
		return "pendingsales";
	}

	@GetMapping("adminlogin")
	public String login(Model model, @ModelAttribute Admin admin) {
		return "adminlogin";
	}

	@GetMapping("purchaseHistory")
	public String history(Model model, HttpSession session) {
		model.addAttribute("cars", carServices.giveSortedHistory());
		return "purchaseHistory";
	}

	@GetMapping("customerDB")
	public String customers(Model model, HttpSession session) {
		model.addAttribute("customers", carServices.findCustomers());
		return "customerDB";
	}

	@GetMapping("contact")
	public String contact(Model model, HttpSession session) {
		return "contact";
	}

	@GetMapping("adminconsole")
	public String console(Model model, HttpSession session) {
		return "adminconsole";
	}

	
	
	 @PostMapping("/searchEngine") 
	 public String searchEngine(@RequestParam String keyword, Model model, @RequestParam String status) {
	  List<Cars> sResult = carServices.findByMakeOrModel(keyword, status);
	  model.addAttribute("results", sResult);
	  return "results";
	  }
	 
	 
	@GetMapping("search")
	public String searchpage(Model model, HttpSession session) {	
		return "search";
	}



}
