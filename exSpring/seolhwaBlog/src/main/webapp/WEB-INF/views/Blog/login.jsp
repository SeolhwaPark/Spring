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

<jsp:include page="../header.jsp" flush="true" />

	<section class="intro">
		<center>
			<div>
				<div class="row">
					<div>
						<h2><strong>Login</strong></h2>						
						<br>
						<p>로그인을 하시면 각 게시물 및 콘택트가 가능합니다.</p>
						
					<form>
						<table>
							<tr>
								<td style="text-align: center;"> I      D&nbsp; &nbsp;</td>
								<td><input type=text name="userid" maxlength=16
									STYLE="WIDTH: 300;"></td>
								<td rowspan="2">&nbsp; &nbsp;<input type="submit" value="Login" class="btn-write"
									style="height: 110px;"></td>
							</tr>
							<tr>
								<td style="text-align: center;"> Password&nbsp; &nbsp;</td>
								<td nowrap><input type=password name="pass1" maxlength=12
									STYLE="WIDTH: 300;"></td>
							</tr>
						</table>
					</form>
					
					</div>
				</div>
		</center>
	</section>
	<br>
	<br>
	<br>

	<jsp:include page="../footer.jsp" flush="true" />

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jq
	uery.poptrox.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>