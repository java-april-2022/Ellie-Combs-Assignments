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
<title>ADD: New Ninjas</title>
</head>
<body>
	<h1>Create Ninja</h1>
	<form:form method="POST" action="/new/ninja" modelAttribute="newNinja">
		<p>
			<form:label path="dojo">Dojo</form:label>
			<form:errors path="dojo" />
			<form:select path="dojo">
			<c:forEach items="${allDojos}" var="dojo">
				<option value="${dojo.id}">${dojo.name}</option>
			</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="firstName">First Name:</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName"/>
		</p>
		<p>
		<p>
			<form:label path="lastName">Last Name:</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName"/>
		</p>
		<p>
			<form:label path="age">Age:</form:label>
			<form:errors path="age" />
			<form:input path="age"/>
		</p>
		<button>Create Ninja</button>
	</form:form>
</body>
</html>