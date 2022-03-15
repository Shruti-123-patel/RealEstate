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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="updateOffice" method="POST" modelAttribute="obj">
		<form:hidden value="${obj.id }" path="id"/>
		Name:		  		<form:input value="${obj.Name }" path="Name" />
		ConferenceRooms: 	<form:input value="${obj.ConferenceRooms }" path="ConferenceRooms" />
		WaitingRooms: 	  	<form:input value="${obj.WaitingRooms }" path="WaitingRooms" />
		OwnerId:	  		<input name="oid" type="text"/>  
		Description:  		<form:input value="${obj.Description }" path="Description" />
		
		<input type="submit" value="Submit" />
	
	</form:form>
</body>
</html>