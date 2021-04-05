<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link href="resources/login.css" rel="stylesheet">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">

</head>
<body>

 <div class="container">
        <div class="content first-content">
            <div class="first-column">
                <h2 class="title title-primary">welcome back!</h2>
                <p class="description description-primary">To keep connected with us</p>
                <p class="description description-primary">please login with your personal info</p>
                <button id="signin" class="btn btn-primary">sign in</button>
            </div>    
            <div class="second-column">
                <h2 class="title title-second">create account</h2>
                <div class="social-media">
                    <ul class="list-social-media">
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-facebook-f"></i>        
                            </li>
                        </a>
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-google-plus-g"></i>
                            </li>
                        </a>
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-linkedin-in"></i>
                            </li>
                        </a>
                    </ul>
                </div><!-- social media -->
                  <c:if test="${!(msg1 == null) }" var="test">
						<div>
							<p><c:out value="${msg1}"></c:out> </p>
						</div>
	</c:if>
                <p class="description description-second">or use your email for registration:</p>
                    <form  class="form" action="Register" method="post">

                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <!-- <input type="text" placeholder="Name"  name="email"> -->
                        <input name='nom' placeholder='LastName' type='text' required>

                    </label>
                    
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <!-- <input type="email" placeholder="Email"> -->
                        <input name='prenom' placeholder='firstName' type='text' required>

                    </label>

                    <label class="label-input" for="">
                        <i class="far fa-envelope icon-modify"></i>
                        <input name='email' placeholder='E-Mail Address' type='text' required>

                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input id='pw' name='password' placeholder='Password' type='password' required>

                    </label>
                    
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="password" type="password" name="pass" id="pass" placeholder="Repeat your password"/>

          
                    </label>
                    
                    
                    <button class="btn btn-second">sign up</button>        
                </form>
            </div><!-- second column -->
        </div><!-- first content -->
        <div class="content second-content">
            <div class="first-column">
                <h2 class="title title-primary">hello, Youcoder!</h2>
                <p class="description description-primary">Enter your personal details</p>
                <p class="description description-primary">and reserve your place</p>
                <button id="signup" class="btn btn-primary">sign up</button>
            </div>
            <div class="second-column">
                <h2 class="title title-second">sign in to Youcode Reservation</h2>
                <div class="social-media">
                    <ul class="list-social-media">
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-facebook-f"></i>
                            </li>
                        </a>
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-google-plus-g"></i>
                            </li>
                        </a>
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-linkedin-in"></i>
                            </li>
                        </a>
                    </ul>
                </div><!-- social media -->
                <c:if test="${!(msg == null) }" var="test">
						<div>
							<p><c:out value="${msg}"></c:out> </p>
						</div>
					</c:if>
                <p class="description description-second">or use your email account:</p>
                    <form  class="form" action="Login" method="post">
					
                    <label class="label-input" for="">
                        <i class="far fa-envelope icon-modify"></i>
                        <input id="user" type="email" class="form-control"  name="email" required/>

                    </label>
                
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                       <input id="password" type="password" name="password" class="form-control" data-type="password"  required />

                    </label>
                
                    <a class="password" href="#">forgot your password?</a>
                    <button  class="btn btn-second" >sign in</button>
 
                
                </form>
            </div><!-- second column -->
        </div><!-- second-content -->
    </div>
		
		<script >
		/**
		 * 
		 */


		var btnSignin = document.querySelector("#signin");
		var btnSignup = document.querySelector("#signup");

		var body = document.querySelector("body");


		btnSignin.addEventListener("click", function () {
		   body.className = "sign-in-js"; 
		});

		btnSignup.addEventListener("click", function () {
		    body.className = "sign-up-js";
		})



		
		</script>		
</body>
</html>