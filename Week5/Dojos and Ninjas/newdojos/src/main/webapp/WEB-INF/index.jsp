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
<title>HOME: Dojos and Ninjas</title>
</head>
<body>
	<h1>Create Dojo</h1>
	<form:form method="POST" action="/new/dojo" modelAttribute="newdojo">
		<p>
			<form:label path="name">Name:</form:label>
			<form:errors path="name" />
			<form:input path="name" />
			<button>Create Dojo</button>
		</p>
	</form:form>
</body>
</html>