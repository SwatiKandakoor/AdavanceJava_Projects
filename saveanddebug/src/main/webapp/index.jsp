<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="70" height="40" class="d-inline-block align-text-top">
			</a>

		</div>
	</nav>
	<h1>Save details of Bakery...</h1>
  
	<form action="bakery" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bakery
				Name:</label> <input type="text" name="name" class="form-control"
				id="exampleFormControlInput1" placeholder="enter bakery name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Owner
				Name</label> <input type="text" name="ownerName" class="form-control"
				id="exampleFormControlInput1" placeholder="enter owner name">
		</div>


		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Wife
				Name</label> <input type="text" name="wifeName" class="form-control"
				id="exampleFormControlInput1" placeholder="enter wife name">
		</div>

		<div class="form-check">
			Marride :yes<input  type="radio"name="married" value="true">
				no<input  type="radio"name="married" value="false">
		</div>

		<div class="form-check">
		<label for="floatingTextarea">Famous For</label>
			<textarea type="text" class="form-control" placeholder="Famous for"
				id="floatingTextarea" rows="3" cols="5" name="famousFor"></textarea>
			

		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Since</label>
			<input type="text" name="since" class="form-control"
				id="exampleFormControlInput1" placeholder="enter since "/>
		</div>
		<input type="submit" class="btn btn-primary" value="Send"/>
	</form>
</body>
</html>
