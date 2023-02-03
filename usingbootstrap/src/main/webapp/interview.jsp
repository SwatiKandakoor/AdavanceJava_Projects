<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#" >
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"  width="70" height="40" class="d-inline-block align-text-top">
        </a>
        <a href="index.jsp">Home</a>
        </div>
        </nav>
<form action="ready" method="post">
<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text"  name="name"class="form-control"
				id="exampleFormControlInput1" placeholder="enter name">
		</div>
		<div>
			<select class="form-select" name="type" aria-label="Default select example">
				<option selected>Company names</option>
				<option value="1">X-workz</option>
				<option value="2">Wipro</option>
				<option value="3">TCS</option>
			</select>
			</div>
			<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Role</label>
			<input type="text"  name="role"class="form-control"
				id="exampleFormControlInput1" placeholder="role">
		</div>
		
		<input type="submit" name="sumbit"/>
			
		
</form>
</body>
</html>