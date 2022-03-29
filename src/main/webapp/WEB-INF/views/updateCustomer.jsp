<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
</head>
<body>
	<div class="full-screen-container">
		<div class="login-container">
			<h3 class="login-title"></h3>
			<form:form action="updateCustomerAfter" method="POST" modelAttribute="obj" enctype="multipart/form-data">

				<div class="input-group">
					<form:hidden value="${obj.custId }" path="custId"/>
				</div>
				<div class="input-group">
					<form:input value="${obj.Name }" path="Name" />
				</div>
				<div class="input-group">
					<form:input value="${obj.Phone_no }" path="Phone_no" />
				</div>
				<div class="input-group">
					<form:input value="${obj.email }" path="email" />
				</div>
				<button type="submit" class="login-button" value="submit">Update Details</button>
			</form:form>
		</div>
	</div>
</body>
</html>