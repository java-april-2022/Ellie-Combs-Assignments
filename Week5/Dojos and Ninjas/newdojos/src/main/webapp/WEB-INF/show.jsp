<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link href="https://unpkg.com/nes.css@latest/css/nes.min.css"
	rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>SHOW: New Dojos Details</title>
</head>
<body>
	<h1><c:out value="${findDojo.name}">Location Ninjas</c:out></h1>
	<Table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		<tr><c:forEach items="${findDojo.ninjas}" var="ninja">
			<td><c:out value="${ninja.firstName}"/></td>
			<td><c:out value="${ninja.lastName}"/></td>
			<td><c:out value="${ninja.age}"/></td>
			</c:forEach>
		</tr>
	</Table>
</body>
</html>