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
				" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="hosp">register</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<h1>Search By Hospital Name</h1>
	<h4 style="color: red">${mesage}</h4>
	<form action="searchbyname" method="get">
		Search by name<input type="text" name="name" /> <input type="submit"
			value="search">
	</form>
	<div>
	
		<table  class="table">
		<thead class="thead-dark">
		
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				<th>Fees</th>
				<th>Specialist</th>
				<th>Clean</th>
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

			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>