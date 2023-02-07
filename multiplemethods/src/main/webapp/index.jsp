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
	<form action="mail" method="get">
		<h4>Email :${email}</h4>
		<input type="submit" value="click here" />
	</form>

	<form action="mobile" method="get">
		<h4>Mobile number :${phone}</h4>
		<input type="submit" value="send" />
	</form>
	<form action="adhar" method="get">
		<h4>Aadhar number :${aadhar}</h4>
		<input type="submit" value="click here" />
	</form>

	<form action="age" method="get">
		<h4>Age :${aage}</h4>
		<input type="submit" value="click here" />
	</form>
	<form action="dob" method="get">
		<h4>Date of birth :${dob}</h4>
		<input type="submit" value="click here" />
	</form>

	<form action="sal" method="get">
		<h4>DesiredSal :${salary}</h4>
		<input type="submit" value="click here" />
	</form>
	<form action="best" method="get">
		<h4>Best Friends list:${bestfrnd}</h4>
		<input type="submit" value="click here" />
		<c:forEach items="${bestfrnd}" var="ref">
			<u1>
			<li>${ref}</li>
			</u1>
		</c:forEach>
	</form>
	<form action="places" method="get">
		<h4>Most visited places</h4>
		<input type="submit" value="click here" />
		<c:forEach items="${visitedplaces}" var="ref">

			<u1>
			<li>${ref}</li>
			</u1>
		</c:forEach>
	</form>

	<form action="skill" method="get">
		<h4>Skill Sets</h4>
		<input type="submit" value="click here" />
		<c:forEach items="${skillset}" var="ref">

			<u1>
			<li>${ref}</li>
			</u1>
		</c:forEach>
	</form>
	<form action="eduction" method="get">
		<h4>Eduction :{eductiondetl}</h4>
		<input type="submit" value="click here" /> ${eductiondetl.id}
		${eductiondetl.name} ${eductiondetl.phoneNo} ${eductiondetl.address}
		${eductiondetl.fees} ${eductiondetl.bright} ${eductiondetl.addarNo}
		${eductiondetl.branch} ${eductiondetl.totalStds}
		${eductiondetl.totalClasses}

	</form>

	<form action="family" method="get">
		<h4>Family :{family}</h4>
		<input type="submit" value="click here" /> ${family.familyName}
		${family.totalmembers} ${family.headName} ${family.wifeName}
		${family.fatherName} ${family.sonName} ${family.dougtherName}
		${family.property} ${family.propertyPrice} ${family.grandMotherName}


	</form>

	<form action="phone" method="get">
		<h4>Mobile inf:</h4>
		<input type="submit" value="click here" /> ${mobile.name}
		${mobile.price} ${mobile.warranty} ${mobile.ram} ${mobile.country}

	</form>
	<form action="beverage" method="get">
		<h4>Beverage inf:</h4>
		<input type="submit" value="click here" /> ${coffee.name}
		${coffee.price}${coffee.type}${coffee.healthy}${coffee.brand}${coffee.madeOf}${coffee.sugar}${coffee.quntity}
	</form>
	<form action="chats" method="get">
		<h4>Chats inf:</h4>
		<input type="submit" value="click here" /> ${chat.name} ${chat.price}
		${chat.quntity} ${chat.oil} ${chat.healthy} ${chat.taste}
		${chat.total} ${chat.shopName} ${chat.location} ${chat.shopclean}
		${chat.md}
	</form>
</body>
</html>