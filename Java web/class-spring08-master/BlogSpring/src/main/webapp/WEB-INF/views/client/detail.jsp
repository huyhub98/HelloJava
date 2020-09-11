<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Blog Home </title>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v5.0"></script>
  <!-- Bootstrap core CSS -->
  <jsp:include page="/WEB-INF/views/include/boostrap.jsp"></jsp:include>
  <!-- Custom styles for this template -->
  <link href="/BlogSpring/static/css/blog-home.css" rel="stylesheet" type="text/css">


</head>

<body>

  <!-- Navigation -->
  		<jsp:include page="/WEB-INF/views/include/navbar.jsp"></jsp:include>
  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Post Content Column -->
      <div class="col-lg-8">

        <!-- Title -->
        <h1 class="mt-4">${n.name}</h1>

        <!-- Author -->
        <p class="lead">
          by
          <a href="#">${n.user.fullname}</a>
        </p>

        <hr>

        <!-- Date/Time -->
        <p>Posted on ${n.date} in ${n.category.name}</p>

        <hr>

        <!-- Preview Image -->
        <img class="img-fluid rounded" src="/webblog/download?image=${n.image}" alt="ảnh chi tiết" width="100%">

        <hr>

        <!-- Post Content -->
        	<p>${n.description}</p>
        <hr>
        <span class="views" style="margin: 0;padding-top: 10px;">${vote.vote}</span>
        <form:form action="/BlogSpring/post" method="post" modelAttribute="vote">
         <div id="rating">
   
    			<form:radiobutton id="star5" path="vote" value="5" checked="checked"/>
    			<label class = "full" for="star5" title="Awesome - 5 stars"></label>
 	
    			<form:radiobutton id="star4" path="vote" value="4" />
    			<label class = "full" for="star4" title="Pretty good - 4 stars"></label>
 
    			<form:radiobutton id="star3" path="vote" value="3" />
   	 			<label class = "full" for="star3" title="Meh - 3 stars"></label>
 
   			 	<form:radiobutton  id="star2" path="vote" value="2" />
   			 	<label class = "full" for="star2" title="Kinda bad - 2 stars"></label>
 
   			 	<form:radiobutton  id="star1" path="vote" value="1" />
   			 	<label class = "full" for="star1" title="Sucks big time - 1 star"></label>
   			 	<form:hidden path="id" value="${n.id}" /> 		 	
			</div>
				<button style="padding: 3px; height: 30px; width: 84px;" class="btn btn-outline-primary" type="submit">	Vote</button>
			</form:form>
        <!-- Comments Form
		<div class="fb-share-button" data-href="http://localhost:8081/webblog/client/post" data-layout="button" data-size="large">
		<a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2Flocalhost%3A8081%2Fwebblog%2Fclient%2Fpost&amp;
		src=sdkpreparse" class="fb-xfbml-parse-ignore">Chia sẻ</a></div>
        <div class="card my-4">
          <h5 class="card-header">Leave a Comment:</h5>
          <div class="fb-comments" data-href="http://localhost:8081/webblog/client/post?id=${n.id}" data-width="100%" data-numposts="5"></div>
        </div>
       
        Single Comment -->
        <!-- Comment with nested comments -->
        

      </div>

     <jsp:include page="/WEB-INF/views/include/category.jsp"></jsp:include>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

 <!-- Footer -->
	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>


</body>

</html>
