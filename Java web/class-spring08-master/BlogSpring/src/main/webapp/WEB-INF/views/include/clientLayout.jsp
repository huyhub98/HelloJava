<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title> <tiles:getAsString name="title"></tiles:getAsString>  </title>

<!-- Bootstrap core CSS -->
<!--<jsp:include page="/WEB-INF/views/include/boostrap.jsp"></jsp:include> -->
 <script src="<c:url  value='/static/jquery/jquery.slim.min.js' />" type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/popper.min.js' />"  type="text/javascript"></script>
<script src="<c:url value='/static/jquery/jquery.min.js' />"  type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/js/bootstrap.min.js' />" type="text/javascript"></script>
<script defer src="<c:url value='/static/fontawesome/js/brands.js' />"></script>
 <script defer src="<c:url value='/static/fontawesome/js/solid.js' />"></script>
 <script defer src="<c:url value='/static/fontawesome/js/fontawesome.js' />"></script>


 			 
  <link href="<c:url value='/static/fontawesome/css/fontawesome.css' />" rel="stylesheet">
  <link href="<c:url value='/static/fontawesome/css/brands.css' />" rel="stylesheet">
  <link href="<c:url value='/static/fontawesome/css/solid.css' />" rel="stylesheet"> 		
  <link href="https://fonts.googleapis.com/css?family=B612+Mono|Cabin:400,700&display=swap" rel="stylesheet">	 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="<c:url value='/static/bootstrap/css/bootstrap.min.css'/>"/>
<!-- Custom styles for this template -->
<link href='<tiles:insertAttribute name="css" ignore=true/>' rel="stylesheet" />
</head>
<body>

	<div id ="root">
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>