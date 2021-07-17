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
	<main>
	    <h1 class="cover-heading">Car Listings</h1>
	      <nav class="nav nav-masthead justify-content-center">
	        <c:choose>
	        	<c:when test="${not empty username}">
	        		<a class="nav-link" href="purchaseHistory"><i class="fas fa-clipboard-list"></i> View Sold Vehicles</a>
	        		<a class="nav-link" href="create"><i class="fas fa-car"></i> Create New Listing</a>
	        	</c:when>
	        </c:choose>
	      </nav>
	
	<div class="row align-items-center">
		<table class="table table-hover" border="2" style="width:550px" align="center" bgcolor="white">
			<thead>
				<tr>
					<th style="width:100px">Stock #</th>
					<th style="width:100px">Price</th>
					<th style="wisth:250px">Vehicle</th>
					<th style="width:50px">View</th>
					<th style="width:50px">Buy</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${results}" var="item">
					<tr>
						<td style="width:100px"><c:out value="${item.stock}"/></td>
						<td style="width:100px"><c:out value="${item.price}"/></td>
						<td style="width:250px"><c:out value="${item.year} ${item.make} ${item.model}"/></td>
						<td style="width:50px"><a href="viewlisting-${item.stock}" class="text-info"><i class="fas fa-eye"></i></a>
						<td Style="width:50px"><a href="buyCar-${item.stock}"><i class="fas fa-dollar-sign"></i></a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	</main>
	<jsp:include page="/WEB-INF/jsp/components/footer.jsp"/>
</div>
	
</body>

</html>