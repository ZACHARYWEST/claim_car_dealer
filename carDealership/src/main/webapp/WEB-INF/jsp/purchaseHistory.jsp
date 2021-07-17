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
	    <h1 class="cover-heading">Purchase History</h1>
	      <nav class="nav nav-masthead justify-content-center">
	        <a class="nav-link" href="pendingsales"><i class="far fa-clock"></i> View Pending Sales</a>
	        <a class="nav-link" href="customerDB"><i class="fas fa-users"></i> Customer Database</a>
	        <a class="nav-link" href="adminconsole"><i class="fas fa-undo-alt"></i> Return to Console</a>
	      </nav>

	<div class="row align-items-center">
		<table class="table table-hover" border="2" style="width:950px" align="center" bgcolor="white">
			<thead>
				<tr>
					<th style="width:100px">Stock #</th>
					<th style="width:100px">Purchase Date</th>
					<th style="wisth:250px">Vehicle</th>
					<th style="width:150px">Buyer's Name</th>
					<th style="width:100px">Purchase Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cars}" var="car">
					<tr>
						<td style="width:100px"><c:out value="${car.stock}"/></td>
						<td style="width:100px"><c:out value="${car.purchaseDate}"></c:out>
						<td style="width:250px"><c:out value="${car.year} ${car.make} ${car.model}"/></td>
						<td style="width:150px"><c:out value="${car.buyer}"/></td>
						<td style="width:100px"><c:out value="${car.price}"/></td>
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