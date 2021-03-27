<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
        <a href="newReservation">New Reservation</a>
<table class="table table-dark">
  <thead>
    <tr>
    
      
      <th scope="col">id_Reservation</th>
      <!--   <th scope="col">nom</th>
     <th scope="col">prenom</th> -->
      <th scope="col">date_Reservation</th>
    
      <th scope="col">Confirmation</th>
    </tr>
  </thead>
  <tbody>

 
 <c:forEach var="reservation" items="${listReservation}">
                <tr>
 
                    <td>${reservation.idReservation}</td>
                    <%-- <td>${Users.nom}</td>
                    <td>${Users.prenom}</td>
                     --%>
                    <td>${reservation.dateReservation}</td>
                    <td>${reservation.confirmation}</td>
                 
                </tr>
            </c:forEach>
 
 

 
 
 
 
  </tbody>
   </table>
  </body>


</html>