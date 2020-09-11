<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Form CreatPost</title>

<!--Bootsrap 4 CDN-->
	<jsp:include page="/WEB-INF/views/include/boostrap.jsp"></jsp:include>
</head>
<body>

	<jsp:include page="/WEB-INF/views/include/adnav.jsp"></jsp:include>
	<!-- NavBar -->

	<div class="container">
	
		<p class="text-danger" style="text-align: center;">${msg}</p>
	
		<form:form action="/BlogSpring/admin/addpost" method="post" modelAttribute="post" enctype="multipart/form-data">
			<div class="form-group">
				<label><b>NAME:</b></label>
				<form:input path="name" type="text" class="form-control" />
			</div>
			<div class="form-group">
				<label><b>DESCRIPTION:</b></label>
				<form:textarea path="description" rows="4" class="form-control" /> 
			</div>
		  	<div class="form-group">
				<label><b>IMAGE File:</b></label>
				<form:input path="image" type="file" accept="image/*" class="form-control"  />
			</div> 
			<div class="form-group">
				<label><b>DATE:</b></label>
				<form:input path="date" type="text" class="form-control" />
			</div>
			<div class="form-group">
				<label><b>CATEGORY:</b></label>
				<form:select path="categoryid" class="form-control">
					<c:forEach items="${categories}" var="c">
						<option value="${c.id}">${c.name}</option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<label><b>AUTHOR:</b></label>
				<form:hidden path="userid" class="form-control" value="${user.id}" />
				<input type="text" class="form-control" value="${user.fullname}" readonly="readonly"/>
			</div>
			<button type="submit" class="btn btn-success float-right">Creat POST</button>
		</form:form>
	</div>
</body>
</html>