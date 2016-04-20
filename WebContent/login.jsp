<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="loginAction.action" method="POST">
	username:<input type="text" name="username"><s:fielderror name="username"></s:fielderror><br>
	age:<input type="text" name="age"><br>
	password:<input type="password" name="password"><br>
	book1:<input type="text" name="bookList[0]"><br>
	book2:<input type="text" name="bookList[1]"><br>
	<input type="submit" value="submit">
</form>

</body>
</html>