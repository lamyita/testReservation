<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
      <link href="resources/login.css" rel="stylesheet">
<!--      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 -->        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Reservation Youcode</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">About me <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="profileUser">Profile</a></li>
          <li><a href="#">reservation historique  </a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
    </ul>
  </div>
</nav>

<table class="table table-dark">
  <thead>
    <tr>
    
      <th scope="col">id_Reservation</th>
      <th scope="col">date_Reservation</th>
    
      <th scope="col">Confirmation</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      
      
<td><input type="date" id="start" name="trip-start"
       value="2021-01-01"
       min="2021-12-30" max="2022-12-31"></td>
      
      <td>Otto</td>
      <td></td>
    </tr>
    
     </tbody>
   </table>
  </body>
</html>