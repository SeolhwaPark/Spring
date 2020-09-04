<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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


			<center>
			<div>
				<div class="row">
					<div>
						<h2><strong>자기소개서 / Introduce My Self</strong></h2>						
						<br>
						<p>안녕하세요.</p>
					</div>
				</div>
			</div>	
			

	<jsp:include page="../header.jsp" flush="true" />

	<!-- About -->
	<section class="about" id="about">
		<div class="container about">
			<div class="row">
				<div class="col-md-6">
					<p>
						<Strong>기본정보/Basic Info</Strong>
					</p>
					<p>Name : 박 설화 (Seolhwa Park)</p>
					<p>Gender : 여자 (female)</p>
					<p><a href="mailto:lunasea731@gmail.com">lunasea731@gmail.com</a></p>
				</div>
				<div class="col-md-6">
					<p>
						<Strong>사진 / Photo</Strong>
					</p>
					<p>사진넣을곳</p>
					<p>ㅋㅋ</p>
					<br> <br> <br>
				</div>
				<br>
				<div class="col-md-6">
					<p>
						<Strong>학력 / Education</Strong>
					</p>
					<p>2010.04~2014.03 문화학원대학 복장학부 복장조형학과(일본) 졸업</p>
					<p>2006.03~2009.02 대전신일여자고등학교 디지털미디어과(한국) 졸업</p>
					<br>
				</div>
				<div class="col-md-6">
					<p>
						<Strong>핵심가치 / Core Value</Strong>
					</p>
					<p>도전정신</p>
					<p>소통능력</p>
					<p>끈기</p>
					<br>
				</div>
				<br>



				<div class="col-md-6">
					<p>
						<Strong>기술스택 / Technical Stack</Strong>
					</p>
					<p>Frontend : JavaScript, Html5, Css</p>
					<p>Backend : Java, JSP/Servlet, SpringFramework, Oracle SQL</p>

					<br> <br>
				</div>
				<div class="col-md-6">
					<p>
						<Strong>프로젝트 / Project</Strong>
					</p>
					<p>개인 프로젝트 : 서블릿방식을 이용한 블로그(2020.03.25~04.01)</p>
					
					<p>팀 프로젝트 : 스프링 MVC패턴을 이용한 학사관리 프로그램(2020.07.13~08.19)</p>
					<br> <br>
				</div>
				<br>
				<div class="col-md-6">
					<p>
						<Strong>자격증 / Qualification</Strong>
					</p>
					<p>2020.06 정보처리산업기사 취득</p>
					<p>2009.01 일본어능력시험(JLPT) 1급 취득</p>

				</div>


				<div class="col-md-6">
					<p>
						<Strong>자기소개 / About me</Strong>
					</p>
					<p>신입개발자입니다.</p>
					<p>안녕하세요!</p>
					<p>잘 부탁 드립니다.</p>
					<br>
				</div>

			</div>
		</div>
	</section>










</center>	

	<jsp:include page="../footer.jsp" flush="true" />

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.poptrox.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>