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
    <h1 class="cover-heading">Purchase submitted. Thank you, ${buyer.name}.</h1>
    <p class="lead">Your purchase is being reviewed. When a Sales Representative approves it, you will recieve a final reciept at the email address, ${buyer.email}</p>
    <a class="nav-link" href="index">Click here to return to the front page.</a>
  </main>

	<jsp:include page="/WEB-INF/jsp/components/footer.jsp"/>
</div>


</body>

</html>>