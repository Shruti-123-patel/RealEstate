<%@page import="java.util.List"%>
<%@page import="project.dao.FactoryProvider"%>
<%@page import="project.dao.VillaFetchDao"%>
<%@page import="project.beans.Villa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List,org.apache.catalina.core.ApplicationContext,org.springframework.context.support.ClassPathXmlApplicationContext,project.dao.ProductDAO,project.beans.availableProduct"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url var="css" value="/r/css" />
<spring:url var="js" value="/r/js" />
<spring:url var="img" value="/r/images" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
        <link rel="stylesheet" href="${css }/productCss.css"/>
        <style>
            .textinfo {
                margin-top: 50px;
                font-size: xx-large;
                font-weight: bolder;
            }

            .card {
                margin-top: 100px;
                background-image: linear-gradient(45deg, rgba(253, 223, 223, 0.76), rgba(245, 219, 219, 0.938));
                height: 350px;
                width: 900px;
                border-radius: 25px;
            }


            .form {
                padding: 10px;
                margin-top: 50px;
            }

            .num {
                margin-top: 50px;
                padding: 10px;
                margin-left: 5px;
                margin-right: 5px;
                border-radius: 10px;
                border: none;
            }

            .sub {
                font-size: 15px;
                font-weight: bolder;
                height: 50px;
                width: 100px;
                margin-top: 50px;
                padding: 10px;
                margin-left: 5px;
                margin-right: 5px;
                border-radius: 10px;
                border: none;
            }

            .sub:hover {
                background-color: lightgreen;
                color: black;
            }
        </style>
    </head>
    <body>
        <!--<h1> <% out.print(session.getAttribute("ownerid")); %> </h1>-->
        
        <div>
            <nav class="topbar">
                <div class="logo">
                    <img src="images/logo.jpg" alt="" srcset="">
                </div>
                <div class="name">E T E R N I T Y &nbsp; &nbsp; P R I M I E R E</div>
                <button class="btn"><%out.print(session.getAttribute("username"));%></button>
            </nav>
        </div>

        <div class="container">
            <center>
                <div class="textinfo">Enter Payment Details</div>
            </center>

            <center>
                <div class="card">
                    <div class="number">
                        <form action="OrderPlaced" class="form">
                            <input type="text" class="num">
                            <input type="text" class="num">
                            <input type="text" class="num">
                            <input type="text" class="num">

                            <div class="vaildthru">
                                <span>Valid Thru : </span>
                                <input type="number" class="num">
                                <input type="number" class="num">
                            </div>
                            <input type="submit" class="sub" value="Pay Now">
                        </form>
                    </div>
                </div>
            </center>

        </div>
<script src="js/checkout.js"></script>
    </body>
</html>
