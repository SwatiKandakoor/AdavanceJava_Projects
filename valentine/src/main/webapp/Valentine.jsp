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
		</div>
		<a href="index.jsp">Home</a>
	</nav>
	<h1>Welcome to Valentine data saving....</h1>
	
	
	<form action="valentine" method="post">
	<pre>
	Name <input type="text" name="name" /> <br>
	Valentine Name <input type="text" name="valentineName"><br>
	 Meeting Place <select name="place">
		<option value="">SELECT</option>
		<c:forEach items="${places}" var="p">
			<option value="${p}">${p}</option>
		</c:forEach>
	</select> <br>
	Gift <select name="gift">
		<option value="">SELECT</option>
		<c:forEach items="${gifts}" var="g">
			<option value="${g}">${g}</option>
		</c:forEach>
	</select><br>
	<input type="submit" name="send" />
	</pre>
	</form>
</body>
</html>