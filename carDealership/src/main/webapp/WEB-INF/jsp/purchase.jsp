<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Car Dealership</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">
    <script src="https://kit.fontawesome.com/82602e5377.js" crossorigin="anonymous"></script>

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <style>
      
    </style>  
    <link href="<c:url value="/static/css/style.css" />" rel="stylesheet">
  </head>


<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">

	<jsp:include page="/WEB-INF/jsp/components/header.jsp"/>

	<c:choose>
		<c:when test="${cart.pending == false && cart.sold == false}">
			<main>
				<div class="card">
				  <img src="${cart.picture}" alt="Avatar" style="width:600px">
				  <div class="container">
				    <h4><b>${cart.year} ${cart.make} ${cart.model}</b></h4>
				    <c:choose>
				    	<c:when test="${bid == true}">
				    		<b class="line">$${cart.price}</b><b>- - $${newprice}</b><p>${cart.used}</p>
				    	</c:when>
				    	<c:otherwise>
				    		<b>$${cart.price}</b><p>${cart.used}</p>
				    	</c:otherwise> 
				    </c:choose>
				    <p>Listing Date: ${cart.dateOnLot}</p><br>
				    <b>Description:</b>
				    <p>${cart.description}</p><br><br>
				    <p>Stock # ${cart.stock}</p>
				  </div>
				</div> 
				
				<div class="card">
				<div align="center">
					<h4>Please enter info</h4>
				</div>
				 <div align="center">
				 	<form:form method="post" action="/purchasevehicle-${cart.stock}" modelAttribute="buyer">
				 		<form:input path="name" type="text" placeholder="Name..."/><br>
				 		<form:input path="email" type="email" placeholder="E-Mail Address"/><br>
				 		<form:input path="creditcard" type="password" placeholder="Credit Card Number"/><br>
				 		<form:input path="street" type="text" placeholder="Street Address"/><br>
				 		<form:input path="city" type="text" placeholder="City"/>
				 		<form:select path="state" id="inputState" class="form-control" style="width:210px;">
				     	<option selected>State</option>
								<option>AL</option><option>AK</option><option>AR</option><option>AZ</option><option>CA</option>
				                <option>CO</option><option>CT</option><option>DE</option><option>FL</option><option>GA</option>
				                <option>HI</option><option>ID</option><option>IL</option><option>IN</option><option>IA</option>
				                <option>KS</option><option>KY</option><option>LA</option><option>ME</option><option>MD</option>
				                <option>MA</option><option>MI</option><option>MN</option><option>MS</option><option>MO</option>
				                <option>MT</option><option>NE</option><option>NV</option><option>NH</option><option>NJ</option>
				                <option>NM</option><option>NC</option><option>ND</option><option>NY</option><option>OH</option>
				                <option>OK</option><option>OR</option><option>PA</option><option>RI</option><option>SC</option>
				                <option>SD</option><option>TN</option><option>TX</option><option>UT</option><option>VT</option>
				                <option>VA</option><option>WA</option><option>WV</option><option>WI</option><option>WY</option>
				     	</form:select>
				     	<form:input path="zip" type="text" placeholder="Zip Code"/><br>
				     	<button type="submit" value="submit" onclick="return confirm('Do you wish to purchase?')">PURCHASE</button>
					 	</form:form>
				</div>
				</div>
			</main>
		</c:when>
		<c:otherwise>
			<p>Vehicle with Stock # ${cart.stock} has alreading been sold or is pending sale. Please click <a class="nav-link" href="listings">here</a> to return to the listings page.</p>
		</c:otherwise>
	</c:choose>


	<jsp:include page="/WEB-INF/jsp/components/footer.jsp"/>

</div>


</body>

</html>
