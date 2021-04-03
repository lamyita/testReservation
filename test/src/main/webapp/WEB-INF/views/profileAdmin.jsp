<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Admin</title>
<link href="resources/profilUser.css" rel="stylesheet">
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
						Reservation</a>s</li>

				<li  ><a href="historiqueAdmin"><i class="fa fa-folder-open"></i>Historique</a></li>
            <li  ><a href="usersTable"><i class="fa fa-folder-open"></i>Users</a></li>
				
			<li class="active"><a href="profileAdmin"><i class="fa fa-wrench"></i>Profile</a></li>

					</ul>

					<p>My account</p>

					<ul>

						<li><a href="#"><i class="fa fa-user"></i> View Profile</a></li>



						<li><a href="logOut"><i class="fa fa-sign-out"></i> Log
								out</a></li>

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

					<h3><%=request.getSession().getAttribute("prenom")%></h3>

					<li><a href="profileUser"><i class="fa fa-user"></i> View
							Profile</a></li>


					<li><a href="logOut"><i class="fa fa-sign-out"></i> Log
							out</a></li>

				</div>

			</header>
			<aside>

				<h1>YouCode</h1>

				<ul>

						<li class="active"><a href="#"><i class="fa fa-line-chart"></i>Dashboard</a></li>

				<li ><a href="reservation"><i class="fa fa-folder-open"></i>New
						Reservation</a> </li>

				<li ><a href="historiqueAdmin"><i class="fa fa-folder-open"></i>Historique</a></li>
            <li  ><a href="usersTable"><i class="fa fa-folder-open"></i>Users</a></li>
				
			<li class="active"><a href="profileAdmin"><i class="fa fa-wrench"></i>Profile</a></li>


				</ul>

			</aside>
			


                <div id="card">
                    <div class="card-body">
                        <div class="d-flex flex-column align-items-center text-center">
                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png"
                                alt="User" class="rounded-circle" width="150">
                            <div class="mt-3">
                                <h4>Welcome <%= request.getSession().getAttribute("prenom") %></h4>


                            </div>
                        </div>
                    </div>
                </div>
                    <div id="card2" >
                    <div class="card mb-3">
                        <div class="card-body">
                            <div class="row">
                                <div class="col-sm-3">
                                    <h6 class="mb-0">Last Name</h6>
                                </div>
                                <div class="col-sm-9 text-secondary">Welcome <%= request.getSession().getAttribute("prenom") %></div>
                            </div>
                            <hr>
                              <div class="row">
                                <div class="col-sm-3">
                                    <h6 class="mb-0">First Name</h6>
                                </div>
                                <div class="col-sm-9 text-secondary">Welcome <%= request.getSession().getAttribute("nom") %></div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <h6 class="mb-0">Email</h6>
                                </div>
                                <div class="col-sm-9 text-secondary">Welcome <%= request.getSession().getAttribute("email") %></div>
                            </div>
                            <hr>
                               <div class="row">
                                <div class="col-sm-3">
                                    <h6 class="mb-0">Password</h6>
                                </div>
                                <div class="col-sm-9 text-secondary">Welcome <%= request.getSession().getAttribute("password") %></div>
                            </div>
                            <hr>


                          
                        </div>
                    </div>

                </div>

		
			<!-- Compiled and minified jQuery 2.1.3 -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>



	<script src="datsh.js">
		
	</script>
</body>
</html>