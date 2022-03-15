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
	<form:form action="updateHospital" method="POST" modelAttribute="obj">
		Name:		    <form:input value="${obj.getName() }" path="Name" />
		GeneralRooms:   <form:input value="${obj.getGeneralRooms() }" path="GeneralRooms" />
		OT:				<form:input value="${obj.getOT() }" path="OT" />
		ICU:			<form:input value="${obj.getICU() }" path="ICU" />
		chambers:		<form:input value="${obj.getChambers() }" path="chambers" />
		OwnerId:	  	<input name="oid" value="${obj.getOwner().getId() }" type="text"/>  
		Description:	<form:input value="${obj.getDescription() }" path="Description" />
		
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>