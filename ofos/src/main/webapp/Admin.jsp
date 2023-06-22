<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style >

body{
background-image:url("34da4c4e-82c3-47d7-953d-121945eada1e00-giveitup-unhealthyfood.jpg");
background-repeat:no-repeat;
background-attachment:fixed;
background-size:cover;
}
</style>

</head>
<body >
<div style = "text-align:center;color:white;border-color:black;font-size:20px" >
<h2 >Admin Login</h2>
<form action="admin" method = "post">
		Admin <input type ="text" name = "aid"> <br><br>
		Password <input type ="password" name = "pass"> <br><br>
		
		<input type="submit" name="submit" value="login">
	</form>

</div>
</body>
</html>