<%@page import="java.util.List"%>
<%@page import="project.dao.FactoryProvider"%>
<%@page import="project.dao.HouseFetchDao"%>
<%@page import="project.beans.ResidentialBuilding"%>
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
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Homestate &mdash; Real Estate</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
        <meta name="keywords"
            content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
        <meta name="author" content="FREEHTML5.CO" />
        
        <!-- Facebook and Twitter integration -->
        <meta name="twitter:title" content="" />
        <meta name="twitter:image" content="" />
        <meta name="twitter:url" content="" />
        <meta name="twitter:card" content="" />
        
        
        
        
        <spring:url var="css" value="/r/css" />
        <spring:url var="js" value="/r/js" />
        <spring:url var="img" value="/r/images" />
        
        
        
        
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="shortcut icon" href="favicon.ico">
        
        <link
            href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,300'
            rel='stylesheet' type='text/css'>
        
        <!-- Animate.css -->
        <link rel="stylesheet" href="${css}/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="${css}/icomoon.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="${css}/bootstrap.css">
        <!-- Superfish -->
        <link rel="stylesheet" href="${css}/superfish.css">
        <!-- Flexslider  -->
        <link rel="stylesheet" href="${css}/flexslider.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="${css}/magnific-popup.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="${css}/bootstrap-datepicker.min.css">
        <!-- CS Select -->
        <link rel="stylesheet" href="${css}/cs-select.css">
        <link rel="stylesheet" href="${css}/cs-skin-border.css">
        
        <link rel="stylesheet" href="${css}/style.css">
        
        
        
        <script src="${js}/modernizr-2.6.2.min.js"></script>
        
            <script src="/project/assets/js/respond.min.js"></script>
        <title>House</title>
        <link rel="stylesheet" href="${css }/productCss.css" />
        </head>

    <body>

        <%
        String nameofuser = (String) session.getAttribute("username");
        %>
        <%-- <div>
            <nav class="topbar">
                <div class="logo">
                    <img src="images/logo.jpg" alt="" srcset="">
                </div>
                <div class="name">E T E R N A L &nbsp; &nbsp; E M P I R E</div>
                <button class="btn">
                    <%
                    if (session.getAttribute("username") == null) {
                        out.print("Log In");
                    } else {
                        out.print(session.getAttribute("username"));
                    }
                    %>
                </button>
            </nav>
        </div> --%>
        
        <header id="fh5co-header-section" class="sticky-banner">
                    <div class="container">
                        <div class="nav-header">
                            <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
                            <h1 id="fh5co-logo">
                                <a href="index.jsp"><i class="icon-home"></i>Eternal<span>Empire</span></a>
                            </h1>
                            <!-- START #fh5co-menu-wrap -->
                            <nav id="fh5co-menu-wrap" role="navigation">
                                <ul class="sf-menu" id="fh5co-primary-menu">
                                    <li class="active"><a href="index.jsp">Home</a></li>
                                    <li><a href="properties.jsp" class="fh5co-sub-ddown">Properties</a>
                                        <ul class="fh5co-sub-menu">
                                            <li><a href="hospital">Hospital</a></li>
                                            <li><a href="resi">Residential Building</a></li>
                                            <li><a href="villa">Villa</a></li>
                                            <li><a href="office">Office</a></li>
                                            <li><a href="complex">Complex</a></li>
                                        </ul></li>
                                        <%
                                        int id=-1;
                                        String name="Login";
                                        String link="/project/login";
                                        System.out.println("yahoooooo345!!!!");
                                        if(session.getAttribute("customerID")!=null)
                                        {
                                            id = (Integer) session.getAttribute("customerID");
                                            System.out.println("yahoooooo!!!!");
                                            name=(String) session.getAttribute("username");
                                            link="updateCustomer?cid="+id;
                                        }
                                    %>
                                    <li><a href="agent">Agent</a></li>
                                    <li><a href="blog">Blog</a></li>
                                    <li><a href="contact">Contact</a></li>
                                    <li><a href="<%= link%>"><%=name%></a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </header>

        <div class="house" style="margin-top: 25px;">
            <center>
                <h1 style="border-bottom: 2px dotted black;">-: Explore the wide Collection of Houses :-
                </h1>
            </center>
        </div>

        <c:forEach var="rb" items="${obj}"> 

        <div class="gallary" style="margin-bottom: 50px">
            <div class="section">
                <div class="img">
                    <img src="" alt="" srcset="">

                </div>
                <div class="description">
                    <p>Owner Id : <span>
                        ${rb.getOwner().getId()}
                        </span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Owner
                        Name :
                        <span>
                            ${rb.getOwner().getName()}
                        </span>
                    </p>
                    <br>
                    <p>Owner Phone Number : <span>
                            ${rb.getOwner().getPhone_no}
                        </span></p>
                    <br>
                    <p>Number Of Bedrooms : <span>
                            ${rb.getBedrooms()}
                        </span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Number Of
                        Floors :
                        <span>
                            ${rb.getFloors()}
                        </span>
                    </p>
                    <br>
                    <p>City : <span style="margin-right: 280px;">${rb.getName()}</span>Price : <span>${rb.getPrice()}</span></p>
                    <br>
                    <p>Description :- <span>
                            ${rb.getDescription()}
                        </span>
                    </p>
                    <br><br>
                    <div>    
                        <form action="Purchase" method="post">
                            <input type="hidden" value="${rb.getId()}" name="HouseId">\
                            <input type="hidden" value="2" name="ProductKeyId">
                            <input type="submit" value=" Buy Now" class="btn2">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
        <footer class="footer-distributed">

            <div class="footer-left">
                <img src="images/logo.jpg">
                <h3>Eternal<span> Empire</span></h3>

                <p class="footer-links">
                    <a href="#">Home</a>
                    |
                    <a href="#">Blog</a>
                    |
                    <a href="#">About</a>
                    |
                    <a href="#">Contact</a>
                </p>

                <p class="footer-company-name">© 2003 Eternal Empire Pvt. Ltd.</p>
            </div>

            <div class="footer-center">
                <div>
                    <i class="fa fa-map-marker"></i>
                    <p><span>309 - Stark Tower,
                            Madhaton, Center Tower</span>
                        Nadiad, Navi Mumbai - 400710</p>
                </div>

                <div>
                    <i class="fa fa-phone"></i>
                    <p>+91 77780 34244</p>
                </div>
                <div>
                    <i class="fa fa-envelope"></i>
                    <p><a href="mailto:support@eduonix.com">support@ironman.com</a></p>
                </div>
            </div>
            <div class="footer-right">
                <p class="footer-company-about">
                    <span>About the company</span>
                    We offer wide and the exotic collection of the real estate buildings and do global Transcations too</p>
                <div class="footer-icons">
                    <a href="#"><i class="fa fa-facebook"></i></a>
                    <a href="#"><i class="fa fa-twitter"></i></a>
                    <a href="#"><i class="fa fa-instagram"></i></a>
                    <a href="#"><i class="fa fa-linkedin"></i></a>
                    <a href="#"><i class="fa fa-youtube"></i></a>
                </div>
            </div>
        </footer>
    </body>
    <script src="js/checkout.js"></script>
</html>