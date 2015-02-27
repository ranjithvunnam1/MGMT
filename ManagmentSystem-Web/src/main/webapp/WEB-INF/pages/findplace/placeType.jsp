<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/templates/TagLibrary.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400">
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Droid+Sans">
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Lobster">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="resources/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/css/animate.css">
<link rel="stylesheet" href="resources/css/magnific-popup.css">
<link rel="stylesheet" href="resources/flexslider/flexslider.css">
<link rel="stylesheet" href="resources/css/form-elements.css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/media-queries.css">
<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="resources/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="resources/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="resources/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="resources/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="resources/ico/apple-touch-icon-57-precomposed.png">
</head>
<body>
	<%@ include file="/WEB-INF/templates/header.jsp"%>
	<!-- page title  -->
	<div class="page-title-container">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 wow fadeIn animated"
					style="visibility: visible;">
					<i class="fa fa-user"></i>
					<h1>Looking For /</h1>
					<p>Below you can select what you are looking for</p>
				</div>
			</div>
		</div>
	</div>
	<!-- Select type here  -->
	<div class="team-container">
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="team-box wow fadeInUp animated"
						style="visibility: visible;">
						<a href="findplace.do?type=food" id="food" data-id="food" data-option="21">
						<img src="resources/img/team/1.jpg" alt=""
							data-at2x="resources/img/team/1.jpg">
						<h3>Food/restaurents</h3>
						</a>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="team-box wow fadeInDown animated"
						style="visibility: visible;">
						<a href="findplace.do?type=bar" id="bar" data-id="bar" data-option="21">
						<img src="resources/img/team/2.jpg" alt=""
							data-at2x="resources/img/team/2.jpg">
						<h3>bar</h3>
						</a>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="team-box wow fadeInUp animated"
						style="visibility: visible;">
						<img src="resources/img/team/3.jpg" alt=""
							data-at2x="resources/img/team/3.jpg">
						<h3>Tim Brown</h3>
						<div class="team-social">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-linkedin"></i></a> <a href="#"><i
								class="fa fa-envelope"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="team-box wow fadeInDown animated"
						style="visibility: visible;">
						<img src="resources/img/team/4.jpg" alt=""
							data-at2x="resources/img/team/4.jpg">
						<h3>Sarah Red</h3>
						<div class="team-social">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-linkedin"></i></a> <a href="#"><i
								class="fa fa-envelope"></i></a>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>

	<%@ include file="/WEB-INF/templates/footer.jsp"%>
	<!-- jQuery -->
	<script src="resources/js/jquery-1.11.1.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/js/bootstrap-hover-dropdown.min.js"></script>
	<script src="resources/js/jquery.backstretch.min.js"></script>
	<script src="resources/js/wow.min.js"></script>
	<script src="resources/js/retina-1.1.0.min.js"></script>
	<script src="resources/js/jquery.magnific-popup.min.js"></script>
	<script src="resources/flexslider/jquery.flexslider-min.js"></script>
	<script src="resources/js/jflickrfeed.min.js"></script>
	<script src="resources/js/masonry.pkgd.min.js"></script>
	<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
	<script src="resources/js/jquery.ui.map.min.js"></script>
	<script src="resources/js/scripts.js"></script>
	<script src="resources/js/jquery.lazyload.js" type="text/javascript"></script>
	<script language="JavaScript"
		src="http://www.geoplugin.net/javascript.gp" type="text/javascript"></script>
	<script>
		$("#h_findplace").addClass("active");
	</script>
</body>
</html>