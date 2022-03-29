<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page
	import="java.util.List,org.apache.catalina.core.ApplicationContext,org.springframework.context.support.ClassPathXmlApplicationContext,project.dao.ProductDAO,project.beans.availableProduct"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/81ac83e5bf.js" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>updateAgent</title>
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
	background-image: url('hi4.jpg');
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
	/* background-color: hsla(201, 81%, 80%, 0.6); */
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
	margin-bottom: 10px;
}

.input-group label {
	color: #fff;
	font-weight: lighter;
	font-size: 1.5em;
	margin-bottom: 7px;
}

.input-group input {
	font-size: 1.1em;
	padding: 0.1em 0.35em;
	background-color: hsla(201, 100%, 91%, 0.3);
	border: 1px solid hsl(201, 100%, 6%);
	outline: none;
	border-radius: 15px;
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
	border-radius: 10px;
	background: hsla(0, 0%, 8%, 0.452);
	border: 2px solid hsla(201, 93%, 21%, 0.596);
	outline: none;
	font-size: 1.0em;
	color: #fff;
	font-weight: 20px;
	margin-top: 20px;
	cursor: pointer;
}

.login-button:hover {
	background-color: hsla(206, 5%, 30%, 0.3);
}

.login-button:focus {
	background-color: hsla(201, 19%, 77%, 0.5);
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
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Admin</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link"
						href="adminHome">Products</a></li>
					<li class="nav-item"><a class="nav-link  active" href="adminAgent">Agents</a></li>
					<li class="nav-item"><a class="nav-link" href="adminCust">Customers</a></li>
				</ul>
				<form class="d-flex" action="searchAgent">
					<input class="form-control me-2" type="search" name="agent" placeholder="Search Customer"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
	
	<div class="full-screen-container">
		<div class="login-container">
			<h3 class="login-title">Add Agent</h3>
			<form:form action="addAgentAfter" method="POST" modelAttribute="a">
				
				<form:hidden value="${a.id }" path="id"/>
				<div class="input-group">
					<form:input path="name" value="${a.name }" placeholder="Enter Name"/>
				</div>
				<div class="input-group">
					<form:input path="city" value="${a.city }" placeholder="Enter City"/>
				</div>
				<div class="input-group">
					<form:input path="email" value="${a.email }" placeholder="Enter Email" />
				</div>
				
				<div class="input-group">
					<form:input path="phoneNo" value="${a.phoneNo }" placeholder="Enter PhoneNo" />
				</div>

				<button type="submit" class="login-button" value="submit">Update Agent</button>

			</form:form>
		</div>
	</div>
</body>
</html>