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
tr td {
	padding: 5px
}
</style>
<script type="text/javascript">
	
</script>
</head>

<body>

	<jsp:include page="../header.jsp" flush="true" />
<body>

	<div id="wrapper">
		<div>
			<title>Seolhwa's Blog</title>
			<meta charset="utf-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1" />
		</div>

		<section>
			<center>
				<div>
					<h2>
						<strong>My Page</strong>
					</h2>
					<br>
					<p>회원님의 비밀번호와 전화번호가 수정 가능합니다.</p>
					
					<form>
						<table>
							<tr>
								<td style="text-align: center;">아 이 디 &nbsp; &nbsp;</td>
								<td><input type=text name="userid" maxlength=16 readonly></td>
								

							</tr>
							<br>
							<tr>
								<td style="text-align: center;">성 명&nbsp; &nbsp;</td>
								<td nowrap><input type=text name="name" maxlength=12
									STYLE="WIDTH: 300;" readonly></td>
							</tr>
							<tr>
								<td style="text-align: center;">비밀번호&nbsp; &nbsp;</td>
								<td nowrap><input type=password name="pass1" maxlength=12
									STYLE="WIDTH: 300;"></td>
							</tr>
							<tr>
								<td style="text-align: center;">비밀번호 확인&nbsp; &nbsp;</td>
								<td nowrap><input type=password name="pass2" maxlength=12
									STYLE="WIDTH: 300;"></td>
							</tr>
							<tr>
								<td style="text-align: center;">전화번호&nbsp; &nbsp;</td>
								<td nowrap><input type=text name="phone" maxlength=12
									STYLE="WIDTH: 300;"></td>
							</tr>
							<tr>
								<td style="text-align: center;">이 메 일&nbsp; &nbsp;</td>
								<td nowrap><input type=text name="email1" maxlength=12
									STYLE="WIDTH: 300;"readonly> @ <input type=text name="email2"
									maxlength=12 STYLE="WIDTH: 300;" readonly></td>
								
							</tr>
							<tr>

								<td colspan=3 align=center>
									<input type="button"
									value="정보수정" style="height: 150; WIDTH: 300;" onclick="join()">
									&nbsp;<input type="button" value="다시쓰기"
									style="height: 150; WIDTH: 300;" onclick="back()">
									&nbsp;<input type="button" value="회원탈퇴"
									style="height: 150; WIDTH: 300;" onclick="del()"></td>
							</tr>

						</table>
					</form>
				</div>
			</center>
		</section>
	</div>

	<jsp:include page="../footer.jsp" flush="true" />

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.poptrox.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>


