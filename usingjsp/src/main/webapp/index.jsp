<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send Details of Favourite Person</h1>
<form action="person" method="post">
<pre>
First Name<input type="text" name="fname"/>
Last Name<input type="text" name="lname"/>
Gender : Male<input type="radio" name="gender" value="male"/>
Female <input type="radio" name="gender" value="female"/>
Reason <textarea rows="10" cols="30" name="reason"></textarea>
Address <textarea rows="10" cols="30" name="address"></textarea>
<input type="submit" name="sumbit"/>
<a href="display.jsp">click here</a> 
</pre>
</form>

</body>
</html>