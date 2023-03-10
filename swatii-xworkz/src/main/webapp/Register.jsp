<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home</a> <a href="search.jsp">Search</a>
		</div>
	</nav>
	<h5 style="color: green;">${message}</h5>
	<h5 style="color: red;">
		${message} <br>
		<c:forEach items="${errors}" var="e">
	 ${e.message} <br>
		</c:forEach>
	</h5>
	<h3>Register the Hospital Application</h3>
	<form action="hosp" method="post">
		<div class="form-group">
			<label for="exampleInputPassword1">Hospital Name</label> <input
				type="text" class="form-control" id="exampleInputPassword1"
				name="name" />
		</div>
		<br> <label for="exampleInputPassword1">Location</label> <input
			type="text" class="form-control" id="exampleInputPassword1"
			name="location" />
		</div>
		<br> <label for="exampleInputPassword1">Fees</label> <input
			type="text" class="form-control" id="exampleInputPassword1"
			name="fees" />
		</div>
		<br> Specialist<select class="custom-select" name="specialist">
			<option value="s">SELECT</option>
			<c:forEach items="${specialist}" var="p">
				<option value="${p}">${p}</option>
			</c:forEach>
		</select> <br>

		<div class="form-check">
			Clean<br> <input class="form-check-input" type="radio"
				name="clean" id="exampleRadios1" value="true" checked>Yes <label
				class="form-check-label" for="exampleRadios1"> </label>
		</div>
		<br>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="clean"
				id="exampleRadios1" value="false" checked>No <label
				class="form-check-label" for="exampleRadios1"> </label>
		</div>
		<button type="submit" class="btn btn-primary">Save</button>

	</form>
</body>
</html>