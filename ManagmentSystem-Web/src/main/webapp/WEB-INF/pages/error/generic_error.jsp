<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/templates/TagLibrary.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Change Password</title>
<link
	href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.servletContext.contextPath}/resources/css/custom.css"
	rel="stylesheet">
<link
	href="${pageContext.servletContext.contextPath}/resources/css/bootstrapValidator.css"
	rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Muli'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<%@ include file="/WEB-INF/templates/header.jsp"%>
	<article class="login-panel"> <section
		class="login-area main-form">
	<div class="container main-body">
		<div class="row">
			<div class="col-md-5 col-md-offset-4 col-sm-7 col-sm-offset-3">
				<div style="margin: 30px 10px 10px; 10 px; text-align: center;">
					<h2 class="page-content1">${errMsg}</h2>
				</div>
			</div>
		</div>
	</div>
	</section> </article>
	<%@ include file="/WEB-INF/templates/footer.jsp"%>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/jquery.min.js"></script>
	<!-- Bootstrap JavaScript -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/bootstrapValidator.min.js"></script>
</body>
</html>
