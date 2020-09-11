<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-12">
					<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#carouselExampleCaptions" data-slide-to="0"
								class="active"></li>
							<li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
							<li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
						</ol>		
							<div class="carousel-inner">
							<c:forEach items="${news2}" var="n" begin="0" end="2" varStatus="status">
						  		<c:choose>
							<c:when test="${status.index == 0}">
									<div class="carousel-item active">
										<img src="/BlogSpring/download?image=${n.image}"  height="500px" class=" d-block w-100"
											alt="Second">
										<div class="carousel-caption d-none d-md-block">
											<h5>${n.name}</h5>
										</div>
									</div>
							</c:when>
							<c:otherwise>
									<div class="carousel-item ">
										<img src="/BlogSpring/download?image=${n.image}" height="500px" class="d-block w-100 "
											alt="Second">
										<div class="carousel-caption d-none d-md-block">
											<h5>${n.name}</h5>
										</div>
									</div>
							</c:otherwise>	
						  </c:choose>		
						</c:forEach>
						</div>

					</div>
					<a class="carousel-control-prev" href="#carouselExampleCaptions"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleCaptions"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
			</div>
		</div>
		<div class="row">

			<!-- Blog Entries Column -->
			<div class="col-md-8">

				<h3 class="my-4">Bài viết mới đăng</h3>
				<hr>

				<!-- Blog Post -->
				<c:forEach items="${news1}" var="n" >
				
				<div class="card mb-4">
					<img class="card-img-top" src="/BlogSpring/download?image=${n.image}" width="500px" height="300px" alt="Card image cap">
					<div class="card-body">
						<h2 class="card-title">${n.name}</h2>
						<c:set var="d" value="${fn:substring(n.description,0,180)}"></c:set>
						<p class="card-text"> ${d} [....] </p>
						<a href="/BlogSpring/post?id=${n.id}" class="btn btn-primary">Read More &rarr;</a>
					</div>
					<div class="card-footer text-muted">
						Posted on ${n.date} in ${n.category.name} by <a href="/BlogSpring/about">${n.user.fullname}</a>
					</div>
				</div>
				</c:forEach>

				<ul class="pagination justify-content-center mb-4">
					<li class="page-item"><a class="page-link" href="/BlogSpring/home?offset=0">1</a></li>
					<li class="page-item"><a class="page-link" href="/BlogSpring/home?offset=3">2</a></li>
					<li class="page-item"><a class="page-link" href="/BlogSpring/home?offset=6">3</a></li>
				</ul>

			</div>
		</div>
	</div>
	<!-- /.container -->
	


</body>
</html>

