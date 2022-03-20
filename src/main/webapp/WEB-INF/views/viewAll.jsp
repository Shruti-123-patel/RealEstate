<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List,org.springframework.context.support.ClassPathXmlApplicationContext,project.dao.ProductDAO,project.beans.availableProduct" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>

				<table class="table" style="border:3">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Product Name</th>
					</thead>
					<tbody>
						<c:forEach var="p" items="${list}">
							<tr>	
								<td>${p.getName()}</td>
								<td><a href="update?pid=${p.id}&classs=${name}">Update</a></td>
								<td><a href="removeProduct?classs=${name }&pid=${p.getId() }">Remove</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>