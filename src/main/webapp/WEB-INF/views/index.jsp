<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html class="no-js">
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
</head>
<body>
	<div id="fh5co-wrapper">
		<div id="fh5co-page">
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


			<div id="fh5co-search-map">
				<div class="search-property">
					<div class="s-holder">
						<h2>Search Properties</h2>
						<div class="row">
						
							<div class="col-xxs-12 col-xs-12">
								<section>
									<label for="class">Property Status:</label> <select
										class="cs-select cs-skin-border">
										<option value="" disabled selected>Any</option>
										<option value="1">Rent</option>
										<option value="2">Sale</option>
									</select>
								</section>
							</div>
							
							<div class="col-xxs-12 col-xs-12">
								<div class="input-field">
									<label for="from">Location:</label> <input type="text"
										class="form-control" id="from-place" placeholder="Any" />
								</div>
							</div>
							<div class="col-xxs-12 col-xs-12">
								<section>
									<label for="class">Price:</label>
									<div class="wide">
										<select
											class="cs-select cs-select-half cs-skin-border input-half">
											<option value="" disabled selected>Any</option>
											<option value="1">Building</option>
											<option value="2">Office</option>
										</select> <select
											class="cs-select cs-select-half cs-skin-border input-half">
											<option value="" disabled selected>Any</option>
											<option value="1">Building</option>
											<option value="2">Office</option>
										</select>
									</div>
								</section>
							</div>
						</div>
					</div>
				</div>
				<div class="map"
					style="background-image: url(${img}/first.jpg);"></div>
			</div>

			
					

			<div id="fh5co-popular-properties" class="fh5co-section-gray">
				<div class="container">
					<div class="row" >
						<div
							class="col-md-8 col-md-offset-2 text-center heading-section animate-box">
							<h3>Popular Properties</h3>
						
						</div>
					</div>
					<div class="row">
						<div class="col-md-4 animate-box">
							<a href="#" class="fh5co-property"
								style="background-image: url(${img}/usabeach.jpg);">
								<span class="status">Sale</span>
								<div class="prop-details">
									<span class="price">$3,000</span>
									<h3>Properties Near in Beach, USA California</h3>
								</div>
							</a>
						</div>
						<div class="col-md-4 animate-box">
							<a href="#" class="fh5co-property"
								style="background-image: url(${img}/nz.jpg);">
								<span class="status">Rent</span>
								<div class="prop-details">
									<span class="price">$200/mos</span>
									<h3>Modern House at NZ</h3>
								</div>
							</a>
						</div>
						<div class="col-md-4 animate-box">
							<a href="#" class="fh5co-property"
								style="background-image: url(${img}/bh.jpg);">
								<span class="status">Sale</span>
								<div class="prop-details">
									<span class="price">$3,000</span>
									<h3>Bonggalo House</h3>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>

			<div id="fh5co-testimonial"
				style="background-image: url(${img}/img_bg_2.jpg);">
				<div class="container">
					<div class="row animate-box">
						<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
							<h2>Testimonials</h2>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="box-testimony animate-box">
								<blockquote>
									<span class="quote"><span><i
											class="icon-quotes-right"></i></span></span>
									<p>&ldquo;"The trip was wonderful - lots of great memories were made. 
									All the arrangements (flights, hotels, cars, cab transfers) went as planned.....
									 Wine country was fun - Penny even learned to enjoy good red wine.
									  We toured Pear Harbor, the Dole plantation and the north shore on Oahu."&rdquo;</p>
								</blockquote>
								<p class="author">
									Diya Desai, CEO 
									<span class="subtext">Customer</span>
								</p>
							</div>

						</div>
						<div class="col-md-4">
							<div class="box-testimony animate-box">
								<blockquote>
									<span class="quote"><span><i
											class="icon-quotes-right"></i></span></span>
									<p>&ldquo;Our family of 10 traveled to Riviera Maya during the 2021 holidays 
									and the trip was wonderful! Mandi helped set up all details and everything worked like clockwork.
									 Airfare from multiple cities, transfers, multiple hotel rooms, COVID testing protocols - everything was perfect.
									  &rdquo;</p>
								</blockquote>
								<p class="author">
									Parth Naik
									<span class="subtext">Customer</span>
								</p>
							</div>


						</div>
						<div class="col-md-4">
							<div class="box-testimony animate-box">
								<blockquote>
									<span class="quote"><span><i
											class="icon-quotes-right"></i></span></span>
									<p>&ldquo;We were a bit nervous about what to expect in regards to traveling internationally during Covid.
									 We quickly realized there was really no reason for concern,
									 and aside from answering a couple of questions at the airport about whether we had Covid symptoms, 
									 it was a non-issue. .&rdquo;</p>
								</blockquote>
								<p class="author">
									Shrey Shrivastava <span
										class="subtext">Customer</span>
								</p>
							</div>

						</div>
					</div>
				</div>
			</div>

			


			<div id="fh5co-about" class="fh5co-agent">
				<div class="container">
					<div class="row">
						<div
							class="col-md-8 col-md-offset-2 text-center heading-section animate-box">
							<h3>Our Agents</h3>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-3 text-center animate-box"
							data-animate-effect="fadeIn">
							<div class="fh5co-staff">
								<img class="img-responsive"
									src="${img}/m1.jpg"
									alt="Free HTML5 Templates by freeHTML5.co">
								<h3>Vaibhavi Patel</h3>
								<p class="fh5co-social-icons">
									<a href="#"><i class="icon-twitter2"></i></a> <a href="#"><i
										class="icon-facebook2"></i></a> <a href="#"><i
										class="icon-instagram"></i></a> <a href="#"><i
										class="icon-dribbble2"></i></a> <a href="#"><i
										class="icon-youtube"></i></a>
								</p>
							</div>
						</div>
						<div class="col-sm-3 text-center animate-box"
							data-animate-effect="fadeIn">
							<div class="fh5co-staff">
								<img class="img-responsive"
									src="${img}/m2.jpg"
									alt="Free HTML5 Templates by freeHTML5.co">
								<h3>Dev Patel</h3>
								
								<p class="fh5co-social-icons">
									<a href="#"><i class="icon-twitter2"></i></a> <a href="#"><i
										class="icon-facebook2"></i></a> <a href="#"><i
										class="icon-instagram"></i></a> <a href="#"><i
										class="icon-dribbble2"></i></a> <a href="#"><i
										class="icon-youtube"></i></a>
								</p>
							</div>
						</div>
						<div class="col-sm-3 text-center animate-box"
							data-animate-effect="fadeIn">
							<div class="fh5co-staff">
								<img class="img-responsive"
									src="${img}/m3.jpg"
									alt="">
								<h3>Om Nai</h3>
								<p class="fh5co-social-icons">
									<a href="#"><i class="icon-twitter2"></i></a> <a href="#"><i
										class="icon-facebook2"></i></a> <a href="#"><i
										class="icon-instagram"></i></a> <a href="#"><i
										class="icon-dribbble2"></i></a> <a href="#"><i
										class="icon-youtube"></i></a>
								</p>
							</div>
						</div>
						<div class="col-sm-3 text-center animate-box"
							data-animate-effect="fadeIn">
							<div class="fh5co-staff">
								<img class="img-responsive"
									src="${img}/m4.jpg"
									alt="Free HTML5 Templates by freeHTML5.co">
								<h3>Shruti Patel</h3>
								<p class="fh5co-social-icons">
									<a href="#"><i class="icon-twitter2"></i></a> <a href="#"><i
										class="icon-facebook2"></i></a> <a href="#"><i
										class="icon-instagram"></i></a> <a href="#"><i
										class="icon-dribbble2"></i></a> <a href="#"><i
										class="icon-youtube"></i></a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>

			
			<!-- fh5co-blog-section -->
			<div id="fh5co-contact" class="fh5co-contact">
				<div class="half-contact">
					<div class="container-fluid">
						<div class="row">
							<div
								class="col-md-12 col-md-offset-0 text-center heading-section animate-box">
								<h3>Ask an agent, We're here to help 24/7</h3>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12 animate-box">
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Name">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Email">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<textarea name="" class="form-control" id="" cols="30"
												rows="7" placeholder="Message"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<input type="submit" value="Send Message"
												class="btn btn-primary">
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="half-bg"
					style="background-image: url(${img}/last.jpeg);"></div>
			</div>
			<footer>
				<div id="footer">
					<div class="container">
						<div class="row row-bottom-padded-md">
							<div class="col-md-3">
								<h3 class="section-title">About Homestate</h3>
								<p>Far far away, behind the word mountains, far from the
									countries Vokalia and Consonantia, there live the blind texts.
									Separated they live in Bookmarksgrove right at the coast of the
									Semantics.</p>
							</div>

							<div class="col-md-3 col-md-push-1">
								<h3 class="section-title">Links</h3>
								<ul>
									<li><a href="#">Home</a></li>
									<li><a href="#">Properties</a></li>
									<li><a href="#">Agent</a></li>
									<li><a href="#">Blog</a></li>
									<li><a href="#">API</a></li>
									<li><a href="#">FAQ / Contact</a></li>
								</ul>
							</div>

							<div class="col-md-3">
								<h3 class="section-title">Information</h3>
								<ul>
									<li><a href="#">Terms &amp; Condition</a></li>
									<li><a href="#">License</a></li>
									<li><a href="#">Privacy &amp; Policy</a></li>
									<li><a href="#">Contact Us</a></li>
								</ul>
							</div>
							<div class="col-md-3">
								<h3 class="section-title">Newsletter</h3>
								<p>Subscribe for our newsletter</p>
								<form class="form-inline" id="fh5co-header-subscribe">
									<div class="row">
										<div class="col-md-12 col-md-offset-0">
											<div class="form-group">
												<input type="text" class="form-control" id="email"
													placeholder="Enter your email">
												<button type="submit" class="btn btn-default">
													<i class="icon-paper-plane"></i>
												</button>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<p class="fh5co-social-icons">
									<a href="#"><i class="icon-twitter2"></i></a> <a href="#"><i
										class="icon-facebook2"></i></a> <a href="#"><i
										class="icon-instagram"></i></a> <a href="#"><i
										class="icon-dribbble2"></i></a> <a href="#"><i
										class="icon-youtube"></i></a>
								</p>
								<p>
									Copyright 2016 Free Html5 <a href="#">Module</a>. All Rights
									Reserved. <br>Made with <i class="icon-heart3"></i> by <a
										href="http://freehtml5.co/" target="_blank">Freehtml5.co</a> /
									Demo Images: <a href="https://unsplash.com/" target="_blank">Unsplash</a>
									&amp; <a href="http://blog.gessato.com/" target="_blank">Gessato</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</footer>



		</div>
		<!-- END fh5co-page -->

	</div>
	<!-- END fh5co-wrapper -->

	<!-- jQuery -->


	<script src="${js}/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="${js}/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="${js}/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="${js}/jquery.waypoints.min.js"></script>
	<script src="${js}/sticky.js"></script>
	<!-- Superfish -->
	<script src="${js}/hoverIntent.js"></script>
	<script src="${js}/superfish.js"></script>
	<!-- Flexslider -->
	<script src="${js}/jquery.flexslider-min.js"></script>
	<!-- Date Picker -->
	<script src="${js}/bootstrap-datepicker.min.js"></script>
	<!-- CS Select -->
	<script src="${js}/classie.js"></script>
	<script src="${js}/selectFx.js"></script>


	<!-- Main JS -->
	<script src="${js}/main.js"></script>

</body>
</html>

