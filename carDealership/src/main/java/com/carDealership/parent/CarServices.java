package com.carDealership.parent;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Primary
public class CarServices {
	
	private List<Cars> carListings = new LinkedList<>();
	private List<Buyer> customers = new LinkedList<>();
	private List<Cars> purchaseHistory = new LinkedList<>();
	private List<Admin> adminDB = new LinkedList<>();
	private List<Buyer> pending = new LinkedList<>();
	
	
	public void saveListing(Cars car) {
		carListings.add(car);	
	}
	
	public void removeListing(Cars car){
		carListings.remove(car);
	}
	
	public void updatePending(Buyer buyer) {
		pending.add(buyer);
	}
	
	public void removePending(Buyer buyer) {
		pending.remove(buyer);
	}
	
	public void addCustomer(Buyer buyer) {
		customers.add(buyer);
	}
	
	public void updateHistory(Cars car) {
		purchaseHistory.add(car);
	}
	
	public void addAdmin(Admin addman) {
		adminDB.add(addman);
	}
	
	 {
		Cars defCar1 = new Cars();
		defCar1.setDateOnLot(java.time.LocalDate.of(2021, 06, 29));
		defCar1.setDescription("Good condition. Red paint. Has all paperwork of maintenance. Brand new LED headlights.");
		defCar1.setMake("Nissan");
		defCar1.setMiles(50000);
		defCar1.setModel("Rogue");
		defCar1.setPrice(15000);
		defCar1.setUsed("USED");
		defCar1.setYear(2019);
		defCar1.setStock();
		defCar1.setPicture("/static/images/IMG_20190705_113433761.jpg");
		carListings.add(defCar1);
		
		Cars defcar2 = new Cars();
		defcar2.setDateOnLot(java.time.LocalDate.of(2021, 04, 11));
		defcar2.setDescription("White, 4-door, 4x4.");
		defcar2.setMake("Ram");
		defcar2.setModel("1500");
		defcar2.setMiles(10);
		defcar2.setPrice(44000);
		defcar2.setUsed("NEW");
		defcar2.setYear(2021);
		defcar2.setStock();
		defcar2.setPicture("/static/images/2021_ram_ram_1500_pickup_angularfront.jpg");
		carListings.add(defcar2);
		
		Cars defcar3 = new Cars();
		defcar3.setDateOnLot(java.time.LocalDate.of(2020, 12, 05));
		defcar3.setDescription("It's a freaking Tesla, dude.");
		defcar3.setMake("Tesla");
		defcar3.setModel("Model S");
		defcar3.setMiles(10);
		defcar3.setPrice(80000);
		defcar3.setUsed("NEW");
		defcar3.setYear(2021);
		defcar3.setStock();
		defcar3.setPicture("/static/images/2018_Tesla_Model_S_75D.jpg");
		carListings.add(defcar3);
		
		Cars defcar4 = new Cars();
		defcar4.setDateOnLot(java.time.LocalDate.of(2021, 03, 03));
		defcar4.setDescription("Convertible. Black paint. 2-Door. New radio, headlights, wheels, and upholstery.");
		defcar4.setMake("Dodge");
		defcar4.setModel("600");
		defcar4.setMiles(65000);
		defcar4.setPrice(9099);
		defcar4.setUsed("USED");
		defcar4.setYear(1986);
		defcar4.setStock();
		defcar4.setPicture("/static/images/dodge600.jpg");
		carListings.add(defcar4);
		
		Cars defcar5 = new Cars();
		defcar5.setDateOnLot(java.time.LocalDate.of(2016, 02, 29));
		defcar5.setDescription("Smells like steak and seats 35. Some fire damage.");
		defcar5.setMake("Simpsons");
		defcar5.setModel("Canyonero");
		defcar5.setMiles(950000);
		defcar5.setPrice(55000);
		defcar5.setUsed("USED");
		defcar5.setYear(1999);
		defcar5.setStock();
		defcar5.setPicture("/static/images/canyonero.jpg");
		carListings.add(defcar5);
		
		Cars defcar6 = new Cars();
		defcar6.setDateOnLot(java.time.LocalDate.of(2021, 6, 19));
		defcar6.setDescription("Can time travel when reaching speeds of 88mph. Requires 1.21 Gigawatts of power. Also, it flies.");
		defcar6.setMake("DMC");
		defcar6.setModel("DeLorean");
		defcar6.setMiles(880000);
		defcar6.setPrice(88000);
		defcar6.setUsed("USED");
		defcar6.setYear(1985);
		defcar6.setStock();
		defcar6.setPicture("/static/images/delorean.jpeg");
		carListings.add(defcar6);
		
		Cars defcar7 = new Cars();
		defcar7.setDateOnLot(java.time.LocalDate.of(2020, 07, 06));
		defcar7.setDescription("Brand new A/C. Runs good, but pulls to the left a little.");
		defcar7.setMake("Nissan");
		defcar7.setModel("Sentra");
		defcar7.setMiles(777777);
		defcar7.setPrice(10999);
		defcar7.setUsed("USED");
		defcar7.setYear(2011);
		defcar7.setStock();
		defcar7.setPicture("/static/images/sentra.jpg");
		carListings.add(defcar7);
		
		Cars defcar8 = new Cars();
		defcar8.setDateOnLot(java.time.LocalDate.of(2021, 05, 25));
		defcar8.setDescription("Great for off roading.");
		defcar8.setMake("Toyota");
		defcar8.setModel("4-Runner");
		defcar8.setMiles(999999);
		defcar8.setPrice(2500);
		defcar8.setUsed("USED");
		defcar8.setYear(1999);
		defcar8.setStock();
		defcar8.setPicture("/static/images/1999_toyota_4runner_15465632930787aa3094DSC_0104.jpg");
		carListings.add(defcar8);
		
		Cars defcar9 = new Cars();
		defcar9.setDateOnLot(java.time.LocalDate.of(2021, 07, 02));
		defcar9.setDescription("It's a car, really. Don't think about it too much.");
		defcar9.setMake("ZacKar");
		defcar9.setModel("OMG Special");
		defcar9.setMiles(999999);
		defcar9.setPrice(1000000);
		defcar9.setUsed("NEW");
		defcar9.setYear(2021);
		defcar9.setStock();
		defcar9.setPicture("/static/images/specialcar.png");
		carListings.add(defcar9);
		
		Cars defcar10 = new Cars();
		defcar10.setDateOnLot(java.time.LocalDate.of(2021, 07, 02));
		defcar10.setDescription("1924 Moon 6-50 touring car. Looks great! Not sure how well it runs though.");
		defcar10.setMake("Moon Motor");
		defcar10.setModel("6-50");
		defcar10.setMiles(20000);
		defcar10.setPrice(22999);
		defcar10.setUsed("USED");
		defcar10.setYear(1924);
		defcar10.setStock();
		defcar10.setPicture("/static/images/mooncar.jpg");
		carListings.add(defcar10);
		
		Admin defad1 = new Admin();
		defad1.setUsername("username");
		defad1.setPassword("password");
		addAdmin(defad1);
		
		Cars hist1 = new Cars();
		hist1.setDateOnLot(java.time.LocalDate.of(2019, 10, 31));
		hist1.setDescription("purchased car");
		hist1.setMake("Car");
		hist1.setModel("One");
		hist1.setMiles(123456);
		hist1.setPrice(20000);
		hist1.setUsed("USED");
		hist1.setYear(2016);
		hist1.setStock();
		hist1.setBuyer("John Doe");
		hist1.setPurchaseDate(java.time.LocalDate.of(2020, 2, 15));
		hist1.setSold(true);
		purchaseHistory.add(hist1);
		
		Cars hist2 = new Cars();
		hist2.setDateOnLot(java.time.LocalDate.of(2019, 6, 22));
		hist2.setDescription("purchased car");
		hist2.setMake("Car");
		hist2.setModel("Two");
		hist2.setMiles(123456);
		hist2.setPrice(30000);
		hist2.setUsed("USED");
		hist2.setYear(2017);
		hist2.setStock();
		hist2.setBuyer("Billy Badass");
		hist2.setPurchaseDate(java.time.LocalDate.of(2019, 8, 11));
		hist2.setSold(true);
		purchaseHistory.add(hist2);
		
		Cars hist3 = new Cars();
		hist3.setDateOnLot(java.time.LocalDate.of(2020, 11, 25));
		hist3.setDescription("purchased car");
		hist3.setMake("Car");
		hist3.setModel("Three");
		hist3.setMiles(123456);
		hist3.setPrice(30000);
		hist3.setUsed("USED");
		hist3.setYear(2018);
		hist3.setStock();
		hist3.setBuyer("Some Guy");
		hist3.setPurchaseDate(java.time.LocalDate.of(2021, 1, 10));
		hist3.setSold(true);
		purchaseHistory.add(hist3);
		
		Buyer buy1 = new Buyer();
		buy1.setName("John Doe");
		buy1.setEmail("johndoe@email.com");
		buy1.setStreet("123 street");
		buy1.setCity("City Town");
		buy1.setState("Kentucky");
		buy1.setZip("12345");
		customers.add(buy1);
		
		Buyer buy2 = new Buyer();
		buy2.setName("Billy Badass");
		buy2.setEmail("bbadass@email.com");
		buy2.setStreet("321 2nd street");
		buy2.setCity("Townsville");
		buy2.setState("Missouri");
		buy2.setZip("23467");
		customers.add(buy2);
		
		Buyer buy3 = new Buyer();
		buy3.setName("Some Guy");
		buy3.setEmail("guys@email.com");
		buy3.setStreet("123 Big Rd.");
		buy3.setCity("Metropolis");
		buy3.setState("Indiana");
		buy3.setZip("83823");
		customers.add(buy3);
		
	}
	 
	 public List<Cars> findAll(){
		 return carListings;
	 }
	 
	 public List<Buyer> findPending(){
		 return pending;
	 }
	 
	 public Cars findByStock(String string) {
		 Cars car = carListings.stream().filter(a -> string.equals(a.getStock())).findAny().orElse(null);
		 return car;
	 }
	 
	 public Admin findAdminByName(String keyword){
		 Admin admin = adminDB.stream().filter(a -> keyword.equals(a.getUsername())).findAny().orElse(null);
		 return admin;
	 }
	 
	 public List<Cars> giveSortedHistory() {
		    Collections.sort(purchaseHistory, (x, y) -> x.getPurchaseDate().compareTo(y.getPurchaseDate()));
		    Collections.reverse(purchaseHistory);
		    return purchaseHistory;
	 }
	 
	 public List<Buyer> findCustomers(){
		 return customers;
	 }
	 
	 public Buyer findPendingBuyer(String id){
		 Buyer buyer = pending.stream().filter(a -> id.equals(a.getCustomerNumber())).findAny().orElse(null);
		 return buyer;
	 }
	 
	 public List<Cars> findByMakeOrModel(String keyword, String status) {
		List <Cars> search = new LinkedList<Cars>();
		if(status.equals("ANY")) {
			for(Cars c: carListings) {
				if(c.getMake().equalsIgnoreCase(keyword)
						||c.getModel().equalsIgnoreCase(keyword)) {
					search.add(c);
				}
			}
		} else
			if (status.equals("USED")) {
				for(Cars c: carListings) {
					if(c.getMake().equalsIgnoreCase(keyword) && c.getUsed().equals(status)) {
						search.add(c);
					}
					if(c.getModel().equalsIgnoreCase(keyword) && c.getUsed().equals(status)) {
						search.add(c);
					}
				}
			} else
				if (status.equals("NEW")) {
					for(Cars c: carListings) {
						if(c.getMake().equalsIgnoreCase(keyword) && c.getUsed().equals(status)) {
							search.add(c);
						}
						if(c.getModel().equalsIgnoreCase(keyword) && c.getUsed().equals(status)) {
							search.add(c);
						}
					}
				}
		return search;
	 }
	 
	 public void addTheBuyerID(String stock, String number) {
		 Cars car = findByStock(stock);
		 car.setBuyersID(number);
	 }
	 
	 public void removeTheBuyerID(String stock) {
		 Cars car = findByStock(stock);
		 car.setBuyersID(null);
	 }
	 
}
