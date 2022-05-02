<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Expense</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount</th>
				<th scope="col">Action</th>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${allExpenses}">
				<tr>
					<td><a href="expenseDetails/{expense.id}">${expense.name}</a></td>
					<td>${expense.vendor}</td>
					<td>${expense.description}</td>
					<td>${expense.amount}</td>
					<th><a href="/edit/${expense.id}">Edit</a> <form:form
							action="/delete/${expense.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<button>Delete</button>
						</form:form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h1>Expense Details</h1>
	<h2>Add an Expense:</h2>
	<form:form action="/create" method="post" modelAttribute="newExpense">
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
		<button>Submit</button>
	</form:form>
</body>
</html>

