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
<!--         
        <form action="saveReservation" method="post">

	<div class='login'>
	  <h2>Register</h2>
	  <input name='nom' placeholder='nom' type='text' required>
	  <input name='prenom' placeholder='prenom' type='text' required>

	  <input name='email' placeholder='E-Mail Address' type='text' required>
	  <input id='pw' name='password' placeholder='Password' type='password' required>

	  <input class='animated' type='submit' value='register'>
	  <a class='forgot' href='login'>Already have an account?</a>
	</div>
	</form> -->
        
        <form action="saveReservation" method="post" >
          <input name='nom' placeholder='nom' type='text' required>
	      <input name='prenom' placeholder='prenom' type='text' required>
           <input type="date"  name="trip-start"  value="2021-07-22" min="2021-01-01" max="2022-12-31" name="dateReservation" />

        <input type="submit" value="Save"></td>
        </form>
<!-- <div align="center">
    <h1>Reservation list</h1>
    <h3>
        <a href="newReservation">New Reservation</a>
    </h3>
        <form:form action="saveReservation" method="post" modelAttribute="reservation">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form> -->
<%--     <table border="1">

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


<!--          --><c:forEach var="employee" items="${listReservation}">
            <tr>

                <td>${reservation.idReservation}</td>
                <td>${reservation.Date}</td>
                <td>${reservation.confirmation}</td>
                <td>${reservation.idUser}</td>
                <td><a href="editReservation?id=${reservation.id}">Edit</a>
                    <a href="removeReservation?id=${reservation.id}">Delete</a></td>

            </tr>
        </c:forEach>
    </table>
</div> --%>    

    </body>
        </html>