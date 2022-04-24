<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- CSS only -->
    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Your Fortune</title>
</head>
<body>
	<h1>Here is your Omikuji!</h1>
	<div>
		<form action="/processForm" method="post">
			<div>	
				<label>Pick a Number:</label>
				<input type="number" name="picknumber">
			</div>
			
			<div>	
				<label>Place:</label>
				<input type="text" name="place">
			</div>
			
			<div>	
				<label>Name:</label>
				<input type="text" name="name">
			</div>
			
			<div>	
				<label>Thing to Do:</label>
				<input type="text" name="thingtodo">
			</div>
			
			<div>	
				<label>Living Thing:</label>
				<input type="text" name="livingthing">
			</div>
			
			<div>	
				<label>Pay it Forward:</label>
				<textarea row="5" cols="50" name="payitfwd"></textarea>
			</div>
			
			<div>
				<label>Send and show a friend</label>
				<hr><input type="submit" value="Submit">
			</div>

		</form>
	</div>
</body>
</html>