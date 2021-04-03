<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Datshbord</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<link rel="stylesheet" href="resources/reservationAdminPage.css">
	
	
<link rel="stylesheet" href="resources/datshboard.css">


<link
	href="	https://cdnjs.cloudflare.com/ajax/libs/material-design-iconic-font/2.2.0/css/material-design-iconic-font.min.css
	">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- Google Fonts -->
	<link
		href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400|Pacifico'
		rel='stylesheet' type='text/css'>

	<!-- Font Awesome -->
	<link rel="stylesheet"
		href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
</head>
<body>
	<header>

		<i class="fa fa-bars"></i>

		<div class="menu">

			<p>Menu</p>

			<ul>

				<li class="active"><a href="#"><i class="fa fa-line-chart"></i>Dashboard</a></li>

				<li ><a href="reservation"><i class="fa fa-folder-open"></i>New
						Reservation</a> </li>

				<li ><a href="historiqueAdmin"><i class="fa fa-folder-open"></i>Historique</a></li>
			<li class="active" ><a href="usersTable"><i class="fa fa-folder-open"></i>Users</a></li>
				
			<li  ><a href="profileAdmin"><i class="fa fa-wrench"></i>Profile</a></li>
				
				

			</ul>

			<p>My account</p>

			<ul>

				<li><a href="#"><i class="fa fa-user"></i> View Profile</a></li>



				<li><a href="logOut"><i class="fa fa-sign-out"></i> Log out</a></li>

			</ul>

		</div>

		<div class="account">

			<img
				src="https://image.freepik.com/vecteurs-libre/profil-avatar-homme-icone-ronde_24640-14049.jpg" />
			<p>
				My account<i class="fa fa-caret-down"></i>
			</p>

		</div>

		<div class="account-box">

			<h3><%= request.getSession().getAttribute("prenom") %></h3>

			<li><a href="profileAdmin"><i class="fa fa-user"></i> View Profile</a></li>


			<li><a href="logOut"><i class="fa fa-sign-out"></i> Log out</a></li>

		</div>

	</header>
		<aside>

		<h1>YouCode</h1>


		<ul>

    <li class="active"><a href="#"><i class="fa fa-line-chart"></i>Dashboard</a></li>

				<li ><a href="reservation"><i class="fa fa-folder-open"></i>New
						Reservation</a> </li>

				<li ><a href="historiqueAdmin"><i class="fa fa-folder-open"></i>Historique</a></li>
			<li class="active" ><a href="usersTable"><i class="fa fa-folder-open"></i>Users</a></li>
				
			<li  ><a href="profileAdmin"><i class="fa fa-wrench"></i>Profile</a></li>
				
				
		
			

		</ul>
		
		

	</aside>
		<div class="dashboard">
<div class="container">

	<table class="table bordered">
		<thead>
			<tr>

				<th>Last Name</th>
				<th>First Name</th>
				<th>Action</th>
				


			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="usersTable" items="${listUsers}">
<%-- 			<c:if test="${usersTable.roles.roleType.equals('apprenant')}">
 --%>				<tr>
			
					<td>${usersTable.apprenant.nom}
				  <td>${usersTable.apprenant.prenom}</td>

					<td>
						<form action="deleteUser" method="post">
							<input type="hidden" value="${usersTable.idUsers}"
								name="id" class="form-control" /> <input type="submit"
								value="Supprimer" class="btn btn-outline-danger" onclick="return confirm('Are you sure ou want to delete this User?');">
								
								
						</form> 
	
						
					</td>

				</tr>
<%-- 			                                    </c:if>
 --%>				
			</c:forEach>







		</tbody>
	</table>
	</div>
	
		<!-- Compiled and minified jQuery 2.1.3 -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>



	<script src="datsh.js">
		
	</script>
</body>


</html>