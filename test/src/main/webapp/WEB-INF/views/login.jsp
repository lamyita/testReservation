<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link href="resources/login.css" rel="stylesheet">

</head>
<body>

<div class="vid-container">
    <form action="Login" method="post">

      <div class="box">
        <h1>Login</h1>
                <input id="user"
                type="email" class="input" placeholder="Entrer Email"
                name="email" required>

        <input id="pass"
        type="password" name="password" placeholder="Entrer password"
        class="input" data-type="password" required>
        <input type="submit" class="button" value="login">

        <!-- <p>Not a member? <span>Sign Up</span></p> -->

        <a  href='register'><p>Not a member? <span>Sign Up</span></p></a>


      </div>
  </form>
</div>
				
</body>
</html>