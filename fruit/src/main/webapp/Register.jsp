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
				src="https://t4.ftcdn.net/jpg/02/76/36/15/240_F_276361585_YNFVjup29t0HTY1FFRjPVLOrOx0x4PlS.jpg"
				alt="" width="150" height="70" class="d-inline-block align text-top">
			</a> <a href="index.html">Home</a>
		</div>
	</nav>
	<h5 style="color: blue;">${message}</h5>
	<h5 style="color: Yellow;">${message}<br>
		<c:forEach items="${errors}" var="e">${e.message}</c:forEach></h5>


	<h1>Welcome to Fruit Application</h1>
	<form action="save" method="post">
		<div class="form-group">
			<label for="exampleInputPassword1">Fruit Name</label> <input
				type="text" class="form-control" id="exampleInputPassword1"
				name="name" />
		</div>
		<br> Fruit Color <select class="custom-select" name="color">
			<option value="s">Select</option>
			<c:forEach items="${color}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select> <br>
		<div class="form-group">
			<label for="exampleInputPassword1">Fruit price</label> <input
				type="number" class="form-control" id="exampleInputPassword1"
				name="price" />
		</div>

		<br>
		<div class="form-check">
			Food Tasty<br> <input class="form-check-input" type="radio"
				name="tasty" id="exampleRadios1" value="true" checked>Yes <label
				class="form-check-label" for="exampleRadios1"> </label>
		</div>
		<br>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="tasty"
				id="exampleRadios1" value="false" checked> <label
				class="form-check-label" for="exampleRadios1"> No </label>
		</div>
		<button type="submit" class="btn btn-primary">Save</button>
	</form>

</body>
</html>