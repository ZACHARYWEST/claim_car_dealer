<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
     
    <div>
     <h2 class="under">Create a vehicle listing below</h2>
     <div>
     	<form:form method="post" action="/createListing" modelAttribute="cars">
     		<label>Vehicle</label><form:input path="make" type="text" placeholder="Make"/>
     		<form:input path="model" type="text" placeholder="Model"/><br><br>
     		<label>Year Built and Odometer</label><form:input path="year" type="number" min="1900" max="2022" placeholder="Year" style="width:75px"/>
     		<form:input path="miles" type="number" min="0" placeholder="Miles"/><br>
     		<form:radiobutton path="used" value="NEW"/><label>New</label><br><form:radiobutton path="used" value="USED"/><label>Used</label><br>
     		<label>Asking Price</label><form:input path="price" type="number" min="0" max="999999"/><br>
     		<p>Description</p><form:textarea path="description" type="text" placeholder="Type a short description here..."/><br>
     		<button type="submit">Submit</button>
     	</form:form>
     </div>
     
	</div>

  </main>

	<jsp:include page="/WEB-INF/jsp/components/footer.jsp"/>
</div>


</body>

</html>


