<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>



<html lang="en">


<head>

<meta charset="UTF-8">



<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Form With Html & Css</title>


<link href="resources/register.css" rel="stylesheet">

	<!-- <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet' type='text/css'>
	 -->
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>

	<div>
	
	<form action="Register" method="post">

	<div class='login'>
	  <h2>Register</h2>
	  
	
	  <input name='nom' placeholder='nom' type='text' required>
	  <input name='prenom' placeholder='prenom' type='text' required>

	  <input name='email' placeholder='E-Mail Address' type='text' required>
	  <input id='pw' name='password' placeholder='Password' type='password' required>
	  <input type="password" type="password" name="pass" id="pass" placeholder="Repeat your password"/>

	  <input class='animated' type='submit' value='register'>
	  
	  <a class='forgot' href='login'>Already have an account?</a>
	</div>
	</form>


	</div>

</body>


</html>









