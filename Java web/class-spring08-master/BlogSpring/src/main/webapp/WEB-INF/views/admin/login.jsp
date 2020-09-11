<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Login Page</title>

<!--Bootsrap 4 CDN-->
<jsp:include page="/WEB-INF/views/include/boostrap.jsp"></jsp:include>

<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="/BlogSpring/static/css/form.css">
</head>
<body>
	<div class="container">
		<h2>Login Form</h2>

		<p class=" alert-danger alert-dismissible fade show"
			style="text-align: center;">${msg}</p>
		<div style="border: 1px soild white">
			<form action="/BlogSpring/login" method="post">

				<label for="username"><b>Tài khoản</b></label> 
						<input name="username" required="required" /> 
						
				<label for="password"><b>Mật khẩu</b></label> 
						<input type="password" name="password" required="required" />

				<button type="submit">Đăng nhập</button>

				<div class="container">
					<span class="psw">Forgot <a href="#">password?</a></span>
				</div>
			</form>
		</div>
	</div>
</body>
</html>