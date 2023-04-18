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
				" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="save">Register</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<h1>Search By Fruit Name</h1>
	<h4 style="color: red">${mesage}</h4>
	<form action="searchbyname" method="get">
		Search by name<input type="text" name="name" /> <input type="submit"
			value="search">
	</form>
	<div>
	
		<table  class="table">
		<thead >
		
			<tr>
				<th scope="col" >Id</th>
				<th scope="col">Name</th>
				<th scope="col">Color</th>
				<th scope="col">Price</th>
				<th scope="col">Tasty</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}" var="f">
			<tr>
				<td>${f.id}</td>
				<td>${f.name}</td>
				<td>${f.color}</td>
				<td>${f.price}</td>
				<td>${f.tasty}</td>
                <td><a href="update?id=${f.id}">Edit</a></td>
                <td><a href="delete?id=${f.id}">Delete</a></td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>