<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url var="css" value="/r/css" />
<spring:url var="js" value="/r/js" />
<spring:url var="img" value="/r/images" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Quicksand:wght@300;500&display=swap')
	;

* {
	box-sizing: border-box;
	font-family: 'Quicksand', sans-serif;
}

html, body {
	margin: 0;
}
/* .img{
	/* filter: blur(8px);
  	-webkit-filter: blur(8px); */
/* }  * */
.full-screen-container {
	background-image: url('${img}/a6.jpeg');
	/* filter: blur(8px);
  	-webkit-filter: blur(8px); */
	/* z-index: -1; */
	height: 100vh;
	width: 100vw;
	background-size: cover;
	background-position: center;
	display: flex;
	align-items: center;
	justify-content: center;
}

.login-container {
	background-color: hsla(201, 81%, 80%, 0.6);
	padding: 50px 30px;
	min-width: 400px;
	width: 50%;
	max-width: 00px;
	border-color: green;
	border-radius: 40px;
	/* z-index: 2; */
}

.login-title {
	color: rgb(0, 0, 0);
	text-align: center;
	margin: 0;
	margin-bottom: 40px;
	font-size: 2.5em;
	font-weight: 450
}

.input-group {
	display: flex;
	flex-direction: column;
	margin-bottom: 40px;
}

.input-group label {
	color: #fff;
	font-weight: lighter;
	font-size: 1.5em;
	margin-bottom: 7px;
}

.input-group input {
	font-size: 1.5em;
	padding: 0.1em 0.35em;
	background-color: hsla(201, 100%, 91%, 0.3);
	border: 1px solid hsl(201, 100%, 6%);
	outline: none;
	border-radius: 55px;
	color: rgb(0, 0, 0);
	font-weight: 25px;
}

::placeholder {
	color: black;
}

.input-group input:focus {
	border: 1px solid hsl(201, 100%, 50%);
}

.login-button {
	padding: 10px 30px;
	width: 100%;
	border-radius: 55px;
	background: hsla(201, 100%, 50%, 0.452);
	border: 2px solid hsla(201, 93%, 21%, 0.596);
	outline: none;
	font-size: 1.0em;
	color: #fff;
	font-weight: 20px;
	margin-top: 20px;
	cursor: pointer;
}

.login-button:hover {
	background-color: hsla(201, 100%, 50%, 0.3);
}

.login-button:focus {
	background-color: hsla(201, 100%, 50%, 0.5);
}

.input-group input:focus {
	border: 1px solid hsl(201, 100%, 50%);
}

.signin-button {
	padding: 10px 30px;
	width: 40%;
	border-radius: 55px;
	background: hsla(201, 100%, 50%, 0.452);
	border: 2px solid hsla(201, 93%, 21%, 0.596);
	outline: none;
	font-size: 1.0em;
	color: #fff;
	font-weight: 20px;
	margin-top: 20px;
	margin-left: 30%;
	cursor: pointer;
	text-decoration: none;
	text-align: center;
}

.signin-button:hover {
	background-color: hsla(201, 100%, 50%, 0.3);
}

.signin-button:focus {
	background-color: hsla(201, 100%, 50%, 0.5);
}
</style>
</head>
<body>
	<!-- <div class="image"></div> -->
	<div class="full-screen-container">
		<div class="login-container">
			<h3 class="login-title">SIGN-iN</h3>
			<form action="Login" method="POST">

				<div class="input-group">
					<input type="text" name="uname" placeholder="Enter the name">
				</div>
				<div class="input-group">
					<input type="password" name="pass" placeholder="Enter Password">
				</div>

				<button type="submit" class="login-button">SIGN IN</button>
				<div class="input-group">
					<a href="signin.jsp" class="signin-button">SIGN UP</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>