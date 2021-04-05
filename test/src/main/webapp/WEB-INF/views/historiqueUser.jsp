 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation</title>
	<link rel="stylesheet" href="resources/ReservationUserPage.css">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
<link rel="stylesheet"
	href="resources/css/style.css/fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="resources/datshboard.css">
<link rel="stylesheet" href="resources/boxSelect.css">


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

				<li><a href="newReservation"><i class="fa fa-folder-open"></i>New
						Reservation</a> </li>
			<li class="active"><a href="historiqueUser"><i class="fa fa-folder-open"></i>Historique</a></li>

				<li><a href="profileUser"><i class="fa fa-wrench"></i>Profile</a></li>

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

			<li><a href="profileUser"><i class="fa fa-user"></i> View Profile</a></li>


			<li><a href="logOut"><i class="fa fa-sign-out"></i> Log out</a></li>

		</div>

	</header>
		<aside>

		<h1>YouCode</h1>

		<ul>

			<li class="active"><a href="#"><i class="fa fa-line-chart"></i>Dashboard</a></li>

			<li><a href="newReservation"><i class="fa fa-folder-open"></i>New
					Reservation</a></li>
		<li class="active"><a href="historiqueUser"><i class="fa fa-folder-open"></i>Historique</a></li>

			<li><a href="profileUser"><i class="fa fa-wrench"></i>Profile</a></li>
			
			

		</ul>

	</aside>
		<div class="dashboard">

	
	<table class="table bordered">
		<thead>
			<tr>
 <th>First Name</th>

									 <th>First Name</th>
					 <th>DateReservation</th>
	
				<th scope="col">type_Reservation</th>

				<th scope="col">Confirmation</th>
		


			</tr>
		</thead>
		<tbody>
			
        <c:forEach var="reservationHistorique" items="${listReservation}">
                <tr>
                    <td>${reservationHistorique.apprenant.nom}</td>
                    <td>${reservationHistorique.apprenant.prenom}</td>
                    <td>${reservationHistorique.dateReservation}</td>
                    <td>${reservationHistorique.typeReservation}</td>
                    <td>${reservationHistorique.confirmation}</td>
                  
                </tr>
            </c:forEach>
		</tbody>
	</table>



	<!-- Compiled and minified jQuery 2.1.3 -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>



	<script src="datsh.js">
		
	</script>

	</div>
<script>



    function SetMinDate() {
        var now = new Date();

        var day = ("0" + now.getDate()).slice(-2);
        var month = ("0" + (now.getMonth() + 1)).slice(-2);

        var today = now.getFullYear() + "-" + (month) + "-" + (day);


        document.getElementById("date").min = today;

    }
    SetMinDate();
</script>
</body>
</html>
