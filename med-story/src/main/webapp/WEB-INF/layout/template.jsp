<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<!doctype html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href='<c:url value="/resources/images/logoMedstory.png"/>' />
<link rel="stylesheet" href='<c:url value="/resources/css/ol.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/jquery-ui.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/font-awesome.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/alertify.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/datatables.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/styleMedstory.css"/>'>
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Comfortaa">
<script type="text/javascript" src='<c:url value="/resources/js/ol.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery-ui.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery.validate.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/bootstrap.min.js" />'></script>
<script type="text/javascript" src='<c:url value="/resources/js/alertify.min.js" />'></script>
<script type="text/javascript" src='<c:url value="/resources/js/datatables.min.js" />'></script>
<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>
	<tilesx:useAttribute name="current" />
	
	<div class="container">
		<security:authorize access="isAuthenticated()">
	    	<header>
				<a href="#" class="logo"><img src='<c:url value="/resources/images/logoMedstory.png"/>' alt="logo" class="image-logo"></a>
				<div class="menu-toggle"></div>
				<nav>
					<ul>
						<li><a class="${current == 'dashboard' ? 'active' : ''}" href='<spring:url value="/dashboard.html" />'>Dashboard</a></li>
						<li><a class="${current == 'patients' ? 'active' : ''}" href='<spring:url value="/patients.html" />'>Pacientes</a></li>
						<li><a href='<spring:url value="/logout" />'>Salir</a></li>
					</ul>
				</nav>
				<div class="clearfix"></div>
			</header>
	   	</security:authorize>
	   	
	   	<tiles:insertAttribute name="body" />
	
		<div align="center">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$('.menu-toggle').on('click', function() {
				$('.menu-toggle').toggleClass('active');
				$('nav').toggleClass('active');
			});
		});
	</script>
</body>
</html>