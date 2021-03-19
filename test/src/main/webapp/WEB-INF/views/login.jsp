<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
      <link href="resources/login.css" rel="stylesheet">

</head>
<body>

	<!--    <nav id="navbar" class="navbar">
            <ul>
                <li><a class="nav-link scrollto active" href="home">Home</a></li>
                <li><a class="nav-link scrollto" href="reservation">Register</a></li>
                <li><a class="nav-link scrollto" href="login">Login</a></li>
                <li> <a href="#">Login to Journal</a></li>


            </ul>
            <i class="bi bi-list mobile-nav-toggle"></i>
        </nav> -->
        

	 <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
		
			<div class="sign-in-htm">
		<form action="Login" method="post">
 			
					<div class="group">
					<label for="user" class="label">Email</label>
					 
					<input id="user" type="email" class="input" placeholder="Entrer Email"  name="email">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password"  name="password" placeholder="Entrer password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button"  value="login">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
				
				
			</form>	
			</div>
			<div class="sign-up-htm">
					<div class="group">
					<label for="user" class="label">Nom</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="user" class="label">Prenom</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<input id="pass" type="text" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>