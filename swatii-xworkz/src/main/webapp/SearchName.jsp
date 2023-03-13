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
				src="https://seeklogo.com/images/M/medical-hospital-logo-463FA27180-seeklogo.com.png"
				" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="hosp">Register</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<h1>Search By Hospital Name</h1>
	<h4 style="color: red">${mesage}</h4>
	<form action="searchbyname" method="get">
		Search by name<input type="text" name="name" /> <input type="submit"
			value="search">
	</form>
	<div>

		<table class="table table-bordered">
			<thead class="thead-dark">

				<tr class="table-dark">
					<br>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Location</th>
					<th scope="col">Fees</th>
					<th scope="col">Specialist</th>
					<th scope="col">Clean</th>
					<th scope="col">Update</th>
					<th scope="col">Delete</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="h">
					<tr>
						<td>${h.id}</td>
						<td>${h.name}</td>
						<td>${h.location}</td>
						<td>${h.fees}</td>
						<td>${h.specialist}</td>
						<td>${h.clean}</td>
						<td><a href="update?id=${h.id}">Edit</a></td>
						<td><a href="delete?id=${h.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>