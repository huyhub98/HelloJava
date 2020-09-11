<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form CreatCategory</title>

<!--Bootsrap 4 CDN-->
	<jsp:include page="/WEB-INF/views/include/boostrap.jsp"></jsp:include>
</head>
<body>

	<jsp:include page="/WEB-INF/views/include/adnav.jsp"></jsp:include>
	<!-- NavBar -->

	<div class="container">
		<form:form  modelAttribute="category" action="/BlogSpring/admin/upcate" method="post" >
			<div class="form-group">
				<label><b>NAME CATEGORY :</b></label>
				<form:input path="name" type="text" class="form-control" value="${cate.name}" required/>
			</div>
			<button type="submit" class="btn btn-success float-right">Creat Category</button>
		</form:form>
	</div>
</body>
</html>