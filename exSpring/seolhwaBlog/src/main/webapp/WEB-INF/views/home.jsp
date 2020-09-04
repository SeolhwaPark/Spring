<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Seolhwa's Blog</title>

    <!-- Css -->
    <link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">


</head>

<body>

<jsp:include page="header.jsp" flush="true"/>


    <!-- Intro -->
	<section class="intro">
		<div class="container">
			<div class="row">
				<div class="col-lg-7">
					<p>안녕하세요.신입개발자 박설화입니다.
					</p>
				</div>
			</div>
		</div>
	</section>

	
	<!-- Slider -->
	<section class="slider">
		<div class="container-fluid">
			<div class="row no-gutter">
				<div class="col-lg-12">
					<div id="myCarousel" class="carousel slide" data-ride="carousel">

					  <!-- Wrapper for slides -->
					  <div class="carousel-inner" role="listbox">
						<div class="item active">
						  <img src="img/11.jpg" alt="slide">
						</div>

						<div class="item">
						  <img src="img/slide-2.jpg" alt="slide">
						</div>

						<div class="item">
						  <img src="img/slide-3.jpg" alt="slide">
						</div>
						
						<div class="item">
						  <img src="img/slide-4.jpg" alt="slide">
						</div>
					  </div>
					  
					</div>
				</div>
			</div>
		</div>
	</section>
	
	
	<!-- About -->
	<section class="about" id="about">
		<div class="container about">
			<div class="row">
				<div class="col-md-4">
					<h4><strong>About me</strong></h4>
					<P>안녕하세요</P>
					<P>신입개발자 박설화입니다.</P>
				</div>
				
				
				<div class="col-md-6">
				
					<a href="Blog/self">
					<p><Strong>자기소개서</Strong></p></a>
					
								
				</div>
			</div>
		</div>
	</section>
	
	<!-- Gallery -->
	<section id="portfolio">
		<div class="container">
			<div class="row">	
				<div class="col-md-6 thumbnail">
					<div class="hovereffect">
						<div class="col-md-12 photo-1"></div>
							<a href="Blog/javastudy" data-toggle="modal" data-slide-to="0">
								<div class="overlay">
									<h2>Java</h2>
									<p>Java자료실</p> 
								</div>
							</a>
					</div>
				</div>
				
				<div class="col-md-6 thumbnail">
					<div class="hovereffect">
						<div class="col-md-12 photo-10"></div>
							<a href="Blog/scriptstudy" data-toggle="modal" data-slide-to="1">
								<div class="overlay">
									<h2>JavaScript</h2>
									<p>JavaScript자료실</p> 
								</div>
							</a>
					</div>
				</div>
				
				
			</div>
		</div>
		
		<div class="container">
			<div class="row">
			
				
				<div class="col-md-6 thumbnail">
					<div class="hovereffect">
						<div class="col-md-12 photo-9"></div>
							<a href="Blog/sqlstudy" data-toggle="modal" data-slide-to="8">
								<div class="overlay">
									<h2>SQL</h2>
									<p>SQL자료실</p> 
								</div>
							</a>
					</div>
				</div>
				
				
				<div class="col-md-6 thumbnail">
					<div class="hovereffect">
						<div class="col-md-12 photo-8"></div>
							<a href="Blog/springstudy" data-toggle="modal" data-slide-to="3">
								<div class="overlay">
									<h2>SpringFramework</h2>
									<p>SpringFramework자료실</p> 
								</div>
							</a>
					</div>
				</div>
				
				
			</div>
		</div>	
	</section>
		
	
	<!-- End Gallery -->

	
	<div class="container">
	  <div class="modal fade and carousel slide" id="mybox">
		<div class="modal-dialog">
		  <div class="modal-content">
			<div class="modal-body">
			  
			  <button class="close" data-dismiss="modal" type="button">×</button>
			  
			  
			  <div class="carousel-inner">
					<div class="item active">
					  <img src="img/7.jpg" alt="slide">
					</div>
					<div class="item">
					  <img src="img/10.jpg" alt="slide">
					</div>
					<div class="item">
					  <img src="img/9.jpg" alt="slide">
					</div>
					<div class="item">
					  <img src="img/8.jpg" alt="slide">
					</div>
					
			  </div><!-- /.carousel-inner -->
			  
			  
			  <a class="left carousel-control" href="#mybox" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span>
			  </a>
			  <a class="right carousel-control" href="#mybox" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right"></span>
			  </a>
			  
			</div><!-- /.modal-body -->
		  </div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	  </div><!-- /.modal -->
	</div><!-- /.container -->
	
	
	
	
	
	<!-- Press -->
	<section class="press" id="press">
		<div class="container about">
			<div class="row">
				<div class="col-md-4">
					<h4>Diary </h4>
					<p><a href="Blog/diary" target="_blank">회의 </a></p>
					<p>Seoul, April 2015</p>
					<p>“Temporibus uit autem”</p>
					<p><em>with Mark Riders</em></p>
					
					<br>
					
					<p><a href="Blog/diary" target="_blank">출장</a></p>
					<p>Sejong, November 2015</p>
					<p>“Anyone who loves”</p>
					<br>
					<!--  
					<h4>Publications</h4>
					<p><a href="#" target="_blank">Deserunt mollitia animi 2016</a></p>
					<p><a href="#" target="_blank">Vitae dicta : sunt explicabo</a></p>
					<p>Sunt in culpa qui deserunt, Spring 2015</p>
					<p><a href="#" target="_blank">Desires to obtain 1</a></p>
					-->
				</div>
				
				
				<div class="col-md-4">
					<h4>Photos & Illustrations </h4>
					<p><a href="Blog/photos" target="_blank">Magnam, 2015</a>: Best User</p>
					<p><a href="photos" target="_blank"><em>Mximus vel nibh</em>In</a></p>
					
					<br><br>
					
				</div>
				
				
				<div class="col-md-4">
					<h4>Favorite Songs </h4>
						<iframe width="460" height="215" src="https://www.youtube.com/embed/D5P1R6CRsoM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						<p>Shawn Mendes - Fallin' All In You</p>
						<iframe width="460" height="215" src="https://www.youtube.com/embed/HfDoQtOIUKw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						<p>Lauv - The Other</p>
						<p><a href="Blog/favoritesongs">etc..</a></p>
					<br>
						 
				
				</div>
			</div>
		</div>
	</section>
	
	
	<!-- Brand -->
	<section id="brand">
		<div class="container">
			<div class="row">
			
					 <center>
					<h4><strong>Contact </strong></h4>
					
					<p>박설화</p>
		 			<p><a href="mailto:lunasea731@gmail.com">lunasea731@gmail.com</a></p>
					<p>JSL인재개발원 하이브리드소프트웨어 과정 40기</p>
					<br><br>
					</center>
				</div>
				<div class="col-md-12">
				
				   <ul class="logo-list list-inline text-center">
				    <center>I'd love to hear from you.</center>
					<li><a href="http://open.kakao.com/me/lunasea731" target="_blank"><img src="img/logos/kakaolink_btn_medium.png" alt="client logo" class="img-responsive"/>KakaoTalk</a></li>
					<li><a href="https://www.facebook.com/profile.php?id=100011331422555" target="_blank"><img src="img/logos/facebook.png" alt="client logo" class="img-responsive"/>Facebook</a></li>					
					<li><a href="https://www.instagram.com/lunasea731" target="_blank"><img src="img/logos/instagram.png" alt="client logo" class="img-responsive"/>Instagram</a></li>
					<li><a href="https://github.com/SeolhwaPark" target="_blank"><img src="img/logos/9itHub-Mark-120px-plus.png" alt="client logo" class="img-responsive"/>GitHub</a></li>
				  </ul>
				 
				</div>
		
		</div>
	</section>
	

	<jsp:include page="footer.jsp" flush="true" />

    <!-- script -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
	<script src="js/modernizr.js"></script>
	<script src="js/script.js"></script>
	
	

</body>
</html>