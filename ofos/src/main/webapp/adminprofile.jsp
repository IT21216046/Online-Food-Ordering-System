<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Profile</title>
<style >

body{
background-image:url("34da4c4e-82c3-47d7-953d-121945eada1e00-giveitup-unhealthyfood.jpg");
background-repeat:no-repeat;
background-attachment:fixed;
background-size:cover;
}
</style>

</head>
<body>
<div style = "text-align:center;color:white;border-color:black;font-size:20px" >
	<h2>
	Admin Profile</h2>
	<c:forEach var="ad" items="${adminDetails}">
		
		
	
	Admin ID : ${ad.id} <br><br>
	Admin Name : ${ad.adminname}<br>


	
	

	</c:forEach>
	<br>
	<form action="item" method ="post">
	<input type="submit" name = "submit" value="edit items"></form>
	</div>

</body>
</html>