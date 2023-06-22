<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 String id = request.getParameter("id");
String name = request.getParameter("name");
String address = request.getParameter("address");
String phone = request.getParameter("phone");
String username = request.getParameter("username");
String password = request.getParameter("password");

%>

<h1>Customer Account Delete</h1>

<form action = "delete" method = "post">
	Customer ID<input type = "text" name = "cusid" value ="<%=id%>" readonly><br><br>
	Name<input type = "text" name = "name" value ="<%=name%>"readonly><br><br>
	Address<input type = "text" name = "address" value ="<%=address%>"readonly><br><br>
	Phone Number<input type = "text" name = "phone" value ="<%=phone%>"readonly><br><br>
	User name<input type = "text" name = "username" value ="<%=username%>"readonly><br><br>
	Password<input type = "text" name = "password" value ="<%=password%>"readonly><br><br>

	<input type = "submit" name ="submit" value="delete">
</form>

</body>
</html>