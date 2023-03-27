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
				alt="" width="150" height="55" class="d-inline-block align text-top">

				<a href="index.jsp">Home</a>
		</div>
	</nav>
	Hospital Id:
	<input type="text" id="id" />
	<button onclick="loadDto()">Click</button>
	<span id="id2"></span>
	<span id="name2"></span>
	<span id="displayDto2">t</span>
	
	<script>
	
	function loadDto(){
		console.log('running loadDto');
		var xhttp=new XMLHttpRequest();
		
		
		var id=document.getElementById("id").value;
		xhttp.open("GET", "http://localhost:8080/swatii-xworkz/dto/"+id,true);
		xhttp.send();
		
		xhttp.onload=function(){
			console.log(this);
			document.getElementById("displayDto2").innerHTML='test';
			var json=JSON.parse(this.responseText);
			console.log(json);
			document.getElementById("id2").innerHTML=json.id;
			document.getElementById("name2").innerHTML=json.name;

		}
	}
	</script>

</body>
</html>