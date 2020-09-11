<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form CreatPost</title>

<!--Bootsrap 4 CDN-->
	<jsp:include page="/WEB-INF/views/include/boostrap.jsp"></jsp:include>
</head>
<body>

	<jsp:include page="/WEB-INF/views/include/adnav.jsp"></jsp:include>
	<!-- NavBar -->

	<div class="container">
		<form:form action="/BlogSpring/admin/uppost" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label><b>ID:</b></label>
				<form:input path="id" class="form-control" value="${n.id}" readonly="readonly"/>
			</div>
			<div class="form-group">
				<label><b>NAME:</b></label>
				<form:input path="name" type="text" class="form-control" value="${n.name}" />
			</div>
			<div class="form-group">
				<label><b>DESCRIPTION:</b></label>
				<form:textarea path="description" rows="10" class="form-control" >${n.description}</form:textarea>
			</div>
			<div class="form-group">
				<label><b>IMAGE File:</b></label>
				<form:input path="image" type="file" accept="image/*" value="${n.image}" class="form-control" />
			</div>
			<div class="form-group">
				<label><b>DATE:</b></label>
				<form:input path="date" type="text" class="form-control" value="${n.date}" required/>
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
				<form:hidden  path="userid" class="form-control" value="${user.id}" />
				<input type="text" class="form-control" value="${user.fullname}" readonly="readonly">
			</div>
			<button type="submit" class="btn btn-success float-right">UPDATE POST</button>
		</form:form>
	</div>
</body>
</html>