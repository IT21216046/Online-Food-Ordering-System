<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<c:forEach var="cus" items="${cusDetails}">
		
		<c:set var = "id" value ="${cus.id}"/>
		<c:set var = "name" value ="${cus.name}"/>
		<c:set var = "address" value ="${cus.address}"/>
		<c:set var = "phone" value ="${cus.phone}"/>
		<c:set var = "username" value ="${cus.username}"/>
		<c:set var = "password" value ="${cus.password}"/>
	
	${cus.id}
	${cus.name}
	${cus.address}
	${cus.phone}
	${cus.username}
	${cus.password}
	
	

	</c:forEach>
	
	<c:url value ="updateCustomer.jsp" var="cusupdate">
	<c:param name="id" value ="${id}"/>
	<c:param name="name" value ="${name}"/>
	<c:param name="address" value ="${address}"/>
	<c:param name="phone" value ="${phone}"/>
	<c:param name="userrname" value ="${username}"/>
	<c:param name="password" value ="${password}"/>
	</c:url>
	<a href="${cusupdate}">
	<input type="button" name = "update" value="update profile"></a>
	<br>
	
	
	<c:url value ="deleteCustomer.jsp" var="cusdelete">
	<c:param name="id" value ="${id}"/>
	<c:param name="name" value ="${name}"/>
	<c:param name="address" value ="${address}"/>
	<c:param name="phone" value ="${phone}"/>
	<c:param name="userrname" value ="${username}"/>
	<c:param name="password" value ="${password}"/>
	</c:url>
	<a href="${cusdelete}">
	<input type="button" name = "delete" value="delete profile"></a>

</body>
</html>