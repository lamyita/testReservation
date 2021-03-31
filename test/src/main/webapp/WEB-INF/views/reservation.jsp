<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<link rel="stylesheet" href="resources/reservationAdminPage.css">
	

</head>
<body>
<div class="container">

	<table class="table bordered">
		<thead>
			<tr>



				<!-- 				<th scope="col">id_Reservation</th>
 -->
				<th>Nom</th>
				<th>prenom</th>
				<th scope="col">date_Reservation</th>
				<th scope="col">type_Reservation</th>

				<th scope="col">Confirmation</th>
				<th scope="col">Action</th>


			</tr>
		</thead>
		<tbody>
			<c:forEach var="reservation" items="${listReservation}">
				<tr>
	
					<td>${reservation.apprenant.nom}
					
					<td>${reservation.apprenant.prenom}</td>
					<td>${reservation.dateReservation}</td>
					<td>${reservation.typeReservation}</td>
					<td>${reservation.confirmation}</td>

					<td class="d-flex flex-row">
						<form action="deleteReservation" method="post">
							<input type="hidden" value="${reservation.idReservation}"
								name="id" class="form-control" /> <input type="submit"
								value="Supprimer" class="btn btn-outline-danger">
						</form> <c:if test="${reservation.confirmation == false}">
							<form action="AccpterReservation" method="post">
								<input type="hidden" value="${reservation.idReservation}"
									name="id" class="form-control" /> <input type="submit"
									value="Accepter" class="btn btn-outline-success">
							</form>
						</c:if>
						
					</td>





				</tr>
			</c:forEach>







		</tbody>
	</table>
	</div>
</body>


</html>