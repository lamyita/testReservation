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

</head>
<body>
	<table class="table table-dark">
		<thead>
			<tr>



				<th scope="col">id_Reservation</th>
				
				<th>Nom</th>
				<th>Prenom</th>

				<th scope="col">date_Reservation</th>
				<th scope="col">type_Reservation</th>

				<th scope="col">Confirmation</th>
			</tr>
		</thead>
		<tbody>


			<c:forEach var="reservation" items="${listReservation}">
				<tr>

					<td>${reservation.idReservation}</td>
					<td>${Users.nom}</td>
					<td>${Users.prenom}</td>

					<td>${reservation.dateReservation}</td>
					<td>${reservation.typeReservation}</td>
					
					<td class="d-flex flex-row">
                        <form action="deleteReservation"  method="post">
                            <input type="hidden" value="${reservation.idReservation}"  name="id" class="form-control"/>
                            <input type="submit" value="Supprimer" class="btn btn-danger">
                        </form>
                        <c:if test="${reservation.confirmation == false}">
                            <form action="AccpterReservation"  method="post">
                                <input type="hidden" value="${reservation.idReservation}"  name="id" class="form-control"/>
                                <input type="submit" value="Accepter" class="btn btn-primary">
                            </form>
                        </c:if>
                    </td>
					<%-- 					<td>${reservation.confirmation}</td>
 --%>
					<!-- <td>
					
					
						<button type="button" class="btn btn-default btn-lg">
							<span class="glyphicon glyphicon-star" aria-hidden="true"></span>
							Accept
						</button>
						<button type="button" class="btn btn-default btn-lg">
							<span class="glyphicon glyphicon-star" aria-hidden="true"></span>
							Delete
						</button>
					</td> -->
					
					
					
					
					
					
					
				</tr>
			</c:forEach>







		</tbody>
	</table>
</body>


</html>