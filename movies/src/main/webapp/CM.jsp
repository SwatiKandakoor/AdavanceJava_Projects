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
			</a> <a href="index.jsp">Home</a>


		</div>
	</nav>
	<h1>Welcome to cm Info</h1>
	<form action="cm" method="post">
		<pre>
	CM name <input type="text" name="name" />
	Party <select name="party">
	<option>Select</option>
	<option>BJP</option>
	<option>Congress</option>
	<option>JDS</option>
	<option>AAP</option>
	<option>KJP</option>
	</select> 
	
	State <select name="state">
	<option>Select</option>
	<option>KR</option>
	<option>UP</option>
	<option>TS</option>
	<option>AP</option>
	</select> 
	
	TEnure <select name="tenure">
	<option>Select</option>
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	</select>
	
	PortFolio<textarea rows="4" cols="60" name="portfolio"></textarea>
	
	<input type="submit" value="save" class="btn btn-primary" />
	</pre>
	</form>
</body>
</html>