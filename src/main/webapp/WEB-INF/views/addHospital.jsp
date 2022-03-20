<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page
	import="java.util.List,org.springframework.context.support.ClassPathXmlApplicationContext,project.dao.ProductDAO,project.beans.availableProduct"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="addHospital" method="POST" modelAttribute="obj">
		Name:		    <form:input path="Name" />
		GeneralRooms:   <form:input path="GeneralRooms" />
		OT:				<form:input path="OT" />
		ICU:			<form:input path="ICU" />
		chambers:		<form:input path="chambers" />
		OwnerId:	  	<input name="oid" type="text"/>  
		Description:	<form:input path="Description" />
		
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>