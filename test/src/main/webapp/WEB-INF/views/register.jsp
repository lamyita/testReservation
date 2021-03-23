<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>



<html lang="en">


<head>

<meta charset="UTF-8">



<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Form With Html & Css</title>



<link rel="stylesheet" href="style.css">

<meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>

	<div>
	<form action="Register" method="post">
		


			<h4 class="text-warning text-center pt-5">Registration Page</h4>


			<label>nom</label>
			<input type="text" class="input" name="nom"
				placeholder="nom" />


			</label> prenom<label>
			 <input type="text" class="input" name="prenom"
				placeholder="prenom" />

			</label>email <label>
			 <input type="text" class="input" name="email"
				placeholder="EMAIL" />

			</label> <label> 
			<input type="password" class="input" name="password" placeholder="password" />


			</label>




		<input type="submit" class="button" value="register">




		</form>


	</div>

</body>


</html>









