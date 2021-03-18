<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

        <!DOCTYPE>
        <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New/Edit place</title>
        </head>
        <body>
<div align="center">
    <h1>Reservation list</h1>
    <h3>
        <a href="newReservation">New Reservation</a>
    </h3>
    <table border="1">

        <th>idReservation</th>
        <th>Date</th>
        <th>Confirmation</th>
        <th>IdUser</th>
        <th>Action</th>
        <tr>
       
                <td>t</td>
                <td>t</td>
                <td>t</td>
                <td>t</td>
                <tdt>t</td>
                <td><a href="editReservation">Edit</a>
                    <a href="removeReservation">Delete</a></td>
        </tr>


<%-- <!--          --><c:forEach var="employee" items="${listReservation}">
 --%>          <%--   <tr>

                <td>${reservation.idReservation}</td>
                <td>${reservation.Date}</td>
                <td>${reservation.confirmation}</td>
                <td>${reservation.idUser}</td>
                <td><a href="editReservation?id=${reservation.id}">Edit</a>
                    <a href="removeReservation?id=${reservation.id}">Delete</a></td>

            </tr>
        </c:forEach> --%>
    </table>
</div>        </body>
        </html>