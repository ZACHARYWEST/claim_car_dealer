<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<script src="https://kit.fontawesome.com/82602e5377.js" crossorigin="anonymous"></script>
<link href="<c:url value="/static/css/style.css" />" rel="stylesheet">
  
<style>
	
	* {box-sizing:border-box;}
	
	Body {
		margin:0
		font-family: Arial, Helvetica, sans-serif;
	}
	
	.header {
		overflow:hidden;
		background-image: url("/static/images/hero-bg.jpg");
		padding: 20px 10px;
	}
	
	.header a {
	  float: left;
	  color: black;
	  text-align: center;
	  padding: 12px;
	  text-decoration: none;
	  font-size: 18px; 
	  line-height: 25px;
	  border-radius: 4px;
	}
	
	.header a.logo {
		image:
	  font-size: 25px;
	  font-weight: bold;
	}
	
	.header a:hover {
	  background-color: #ddd;
	  color: black;
	}
	
	.header a.active {
	  background-color: dodgerblue;
	  color: white;
	}
	
	.header-right {
	  float: right;
	}
	
	@media screen and (max-width: 500px) {
	  .header a {
	    float: none;
	    display: block;
	    text-align: left;
	  }
	  
	  .header-right {
	    float: none;
	  }
	}

</style>
  
  <header>
  
  	<div class="header">
	  <a href="index" class="logo"><img alt="logo" src="/static/images/header/logo.jpg"></a>
	  <div class="header-right">
        <a class="nav-link" href="index"><img alt="" src="/static/images/header/home.jpg"></a>
        <a class="nav-link" href="listings"><img alt="" src="/static/images/header/listings.jpg"></a>
        <a class="nav-link" href="contact"><img alt="" src="/static/images/header/contact.jpg"></a>
		<c:choose>
			<c:when test="${not empty username}">
				<a href="adminconsole"><img alt="" src="/static/images/header/console.jpg"></a>
				<a href="/logout" onclick="return confirm('Log out?')"><img alt="" src="/static/images/header/logout.jpg"></a>
			</c:when>
			<c:otherwise>
				<a href="adminlogin"><img alt="" src="/static/images/header/admin_login.jpg"></a>
			</c:otherwise>
		</c:choose>  
	  </div>
	</div>
  
 </header>  
  
<!--   http://bootstrapessentials.com/fulldocs/components/navbar/navbar-submenu/ -->
  

 