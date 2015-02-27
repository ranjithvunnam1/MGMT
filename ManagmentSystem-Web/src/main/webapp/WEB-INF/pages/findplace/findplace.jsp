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
	<!-- Header -->
	<div class="work-container">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 work-title wow fadeIn animated"
					style="visibility: visible;">
					<h2>Our Latest Work</h2>
				</div>
			</div>
			<div class="row">
				<!-- dinamic content will come here... -->
				<ul id="place_ul">

				</ul>
			</div>
		</div>
	</div>
	<!-- /.intro-header -->
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

	<script type="text/javascript">
		$("#h_findplace").addClass("active");
		$("img.lazy").lazyload();
		$(document)
				.ready(
						function(e) {
							$('#place_ul')
									.html(
											'<img src="resources/img/loading.gif" id="load_icon">');
							var data = {
									lattitude : geoplugin_latitude(),
									langtitude : geoplugin_longitude(),
									radius	: 1500,
									type	: '${type}'
								};
							$
									.ajax({
										url : "getPlaces.do",
										type : "GET",
										data : data,
										contentType : 'application/json; charset=utf-8',
										success : function(response) {
											$('#load_icon').remove();
											if (response[0].isError) {
												var ss = $('#place_ul');
												ss
														.append('<div class="page-title-container" style="padding: 50px;margin: 100px;"><div class="container"><div class="row"><div class="col-sm-12 wow fadeIn animated" style="visibility: visible;"><i class="fa fa-exclamation-triangle" style="color: #9A3F69";></i><h1>'
																+ response[0].error.status
																+ ' /</h1><p>'
																+ response[0].error.message
																+ '</p></div></div></div></div>');
											} else {
												for ( var i in response) {
													var ss = $('#place_ul');
													ss
															.append('<li class="col-sm-3"><div class="work wow fadeInUp animated" style="visibility: visible;"><img src="'+response[i].photos+'" class="img-height-fixed lazy photoframe"><h3 class="name-title">'
																	+ response[i].name
																	+ '</h3><div class="work-bottom"><a class="big-link-2 view-work" href="resources/img/portfolio/work1.jpg"><i	class="fa fa-search"></i></a> <a class="big-link-2"	href="portfolio.html"><i class="fa fa-link"></i></a></div></div></li>');
												}
											}
										},
										error : function(e) {
											alert('Error: ' + e);
										}
									});
						});
	</script>
</body>
</html>