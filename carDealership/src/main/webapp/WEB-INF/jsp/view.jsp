<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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



	
  <main role="main" class="inner cover">
    <h1 class="cover-heading" align="center">View Vehicle</h1>
	<a href="buyCar-${viewcar.stock}"><i class="fas fa-dollar-sign"></i> Purchase Vehicle  </a>
	<c:choose>
		<c:when test="${not empty username}">
			<a href="goToRenew-${viewcar.stock}"><i class="fas fa-redo"></i> Renew Listing  </a>
		</c:when>
	</c:choose>
	<a href="listings"><i class="fas fa-list-ol"></i> Return to List  </a>
  
	<div class="card">
	  <img src="${viewcar.picture}" alt="Avatar" style="width:600px">
	  <div class="container">
	    <h4><b>${viewcar.year} ${viewcar.make} ${viewcar.model}</b></h4>
	    <c:choose>
	    	<c:when test="${bid == true}">
	    		<b class="line">$${viewcar.price}</b><b>- - $${newprice}</b><p>${viewcar.used}</p>
	    	</c:when>
	    	<c:otherwise>
	    		<b>$${viewcar.price}</b><p>${viewcar.used}</p>
	    	</c:otherwise> 
	    </c:choose>
	    <p>Listing Date: ${viewcar.dateOnLot}</p><br>
	    <b>Description:</b>
	    <p>${viewcar.description}</p><br><br>
	    <p>Stock # ${viewcar.stock}</p>
	  </div>
	</div> 

  </main>

	<jsp:include page="/WEB-INF/jsp/components/footer.jsp"/>

</div>


</body>

</html>