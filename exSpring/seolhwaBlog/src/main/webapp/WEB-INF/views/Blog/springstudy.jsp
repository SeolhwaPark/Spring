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
<style type="text/css">
.intro {
	padding: 5px;
	margin: 0 auto;
}
.bottom{
padding:-100px ;float:right; 
}
.search{
	margin: 0 auto;
	
}
</style>
</head>

<body>

<jsp:include page="../header.jsp" flush="true" />


<section class="intro">
		<center>
			<div>
				<div class="row">
					<div>
						<h2>
							<strong>SpringFramework 공부자료실</strong>
						</h2>
						<br>
						<p>SpringFramework의 기본지식을 공유합니다.</p>

					</div>
				</div>
			</div>





			<section class="about" id="about">
				<div class="container about">
					<div class="row">
						<div class="col-md-6">

									<img src="" alt="">
							<td><span>No.</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class=""> <i class="fa fa-eye"></i>
										12
									</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<span class="date">date</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<a href="">title</a>
									</td>
						</div>
					</div>
				</div>

			
		</center>
		
			<div class="bottom">
			<input type="button" value="작성" class="btn"
						onClick="write()">&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
	</section>
	<center>
<div class="search">
<form name="" method="" action="">
				<table>
					<td>게시물 검색&nbsp;&nbsp; <select name="search">
							<option value="subject"
								<c:if test="${search =='subject'}" >selected</c:if>>글제목</option>
							<option value="name"
								<c:if test="${search =='name'}" >selected</c:if>>작성자</option>
							<option value="contents"
								<c:if test="${search =='contents'}" >selected</c:if>>글내용</option>
					</select> <input type="text" name="key" class="minput" value="${key}"></td>
					&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="button" value="검색" class="btn"
						onClick="searchWeb()"></td>

				</table>
			</form>
</div>

	<jsp:include page="../footer.jsp" flush="true" />

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jq
	uery.poptrox.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>