<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			</a> <a href="index.jsp">Home</a><

		</div>
	</nav>
	<h1>Welcome to Casino ....</h1>
	<form action="casi" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text" name="name" class="form-control"
				id="exampleFormControlInput1" placeholder="enter name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Cruise</label>
			<input type="text" name="cruise" class="form-control"
				id="exampleFormControlInput1" placeholder="enter cruise">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Entry
				Fee</label> <input type="number" name="entryfee" class="form-control"
				id="exampleFormControlInput1" placeholder=" enter entry fees">
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="freefood"
				id="flexRadioDefault1"> <label class="form-check-label"
				for="flexRadioDefault1"> free food </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="no freefood"
				id="flexRadioDefault2" checked> <label
				class="form-check-label" for="flexRadioDefault2"> no free
				food </label>
		</div>

		<input type="submit" class="btn btn-primary" value="Send">
		</div>
	</form>
	
	
	

</body>
</html>