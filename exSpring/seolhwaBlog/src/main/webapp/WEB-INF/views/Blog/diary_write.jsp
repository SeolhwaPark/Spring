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

.bottom {
	padding: -100px;
	float: right;
}

.search {
	margin: 0 auto;
}

.di {
	padding: 0 30px;
}


</style>
</head>

<body>

	<jsp:include page="../header.jsp" flush="true" />


	<section class="intro">
		<center>
			<div>
				<div class="row">

					<h2>
						<strong>Diary Write</strong>
					</h2>
					<br>
					<p>글을 작성해주세요.</p>
				</div>
			</div>


			<section class="about" id="about">
				<div class="container about">
					<div>
						<form name="my" method="post" action="every_write"
							enctype="multipart/form-data" onsubmit="return formcheck();">
							<tr>
								<th>작성자</th>
								<td><input type="text" name="name"
									value="${sessionScope.id}" size="20" maxlength="20"></td>
							</tr>
							<br>
							<tr>
								<th>제목</th>
								<td><input type="text" name="subject" size="70" maxlength="200"></td>
							</tr>
						
							<br>
							<tr>
								<th>내용</th>
								<td><textarea name="contents" rows="5" cols="60"></textarea></td>
							</tr>
							
							<br>

							<tr>
								<th>첨부</th>
								<td><input type="file" name="fotoname"></td>
							</tr>
							<br>
						</form>
					</div>

				</div>
		</center>

		<div class="bottom">
			<input type="button" value="등록" class="btn" onClick="write()">&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="취소" class="btn" onClick="write()">&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
	</section>


	<jsp:include page="../footer.jsp" flush="true" />

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jq
	uery.poptrox.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>