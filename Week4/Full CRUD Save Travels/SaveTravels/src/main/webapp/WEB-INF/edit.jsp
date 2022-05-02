<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    
<meta charset="UTF-8">
<h1>Edit Travels</h1>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Expense Details</h1>
	<h2>Add an Expense:</h2>
	<form:form action="/update/${editExpense.id}" method="put" modelAttribute="editExpense">
	  <input type="hidden" name="method" value="put">
		<p>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
			<form:errors path="name" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:textarea path="description" />
			<form:errors path="description" />
		</p>
		<p>
			<form:label path="amount">Amount</form:label>
			<form:input path="amount" />
			<form:errors path="amount" />
		</p>
		<p>
			<form:label path="vendor">Vendor</form:label>
			<form:input path="vendor" />
			<form:errors path="vendor" />
		</p>
		<button>Update Expense</button>
	</form:form>
</body>
</html>

