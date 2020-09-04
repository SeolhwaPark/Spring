<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="../css/turkey_style.css?ver=2" rel="stylesheet">

<title>Turkey University</title>

	<div class="post_check" onresize="parent.resizeTo(500,400)" onload="parent.resizeTo(500,400)">
		<div class="post_check_miniheader">
			<img src="../img/turkey_1.png">
			<div class="post_check_miniheader_name">Turkey University</div>
			<div class="post_check_miniheader_description">JSL Information Portal System</div>
		</div>
		<div class="post_check_name">
			쪽지 보기
		</div>
		<div class="post_check_form">
			<form name="mail_send_form" method="post">
				<input type="text" name="reception" value="${mailVO.sending_name}" readonly>
				<br><br>
				<textarea name="contents" style="width:400px; height:300px; resize:none;" readonly>${mailVO.contents}</textarea>
				
				<a href="/Turkey/list_send_mail">  <input type="button" value="보낸쪽지" style="width:100px;margin-top:50px;"></a>
				<a href="/Turkey/list_mail"><input type="button" value="받은쪽지" style="width:100px;margin-top:50px;"></a>
				<a href="/Turkey/send_mail"><input type="button" value="쪽지전송" style="width:100px;margin-top:50px;"></a><br><br>
			</form>
			<form>
				<div class="post_check_form_search">
					
				</div>
			</form>
		</div>
	</div>

	
<script>

	
</script>