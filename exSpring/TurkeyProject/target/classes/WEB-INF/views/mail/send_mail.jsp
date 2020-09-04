<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="../css/turkey_style.css?ver=2" rel="stylesheet">

<c:if test="${row==0}">
	<script>
		alert("없는 수신인 입니다.\n 다시 체크 해주세요");
	</script>
</c:if>
<c:if test="${row==1}">
	<script>
		alert("수신인 체크가 되었습니다.");
	</script>
</c:if>

<title>Turkey University</title>

	<div class="post_check" onresize="parent.resizeTo(500,400)" onload="parent.resizeTo(500,400)">
		<div class="post_check_miniheader">
			<img src="../img/turkey_1.png">
			<div class="post_check_miniheader_name">Turkey University</div>
			<div class="post_check_miniheader_description">JSL Information Portal System</div>
		</div>
		<div class="post_check_name">
			쪽지 보내기
		</div>
		<div class="post_check_form">
			<form name="mail_send_form" method="post">
				<input type="text" name="reception" placeholder="받는사람" value="${reception}">
				<input type="button" value="조회" onclick="re_check()"><br><br>
				<textarea name="contents" style="width:400px; height:300px; resize:none;"></textarea>
				<br><br>
				<input type="button" value="보내기" onclick="send()">
				<a href="javascript:history.back()"><input type="button" value="취소"></a>
				<input type="hidden" name="row1" value="${row}">
			</form>
			<form>
				<div class="post_check_form_search">
					
				</div>
			</form>
		</div>
	</div>

	
<script>
	function re_check(){
		if(mail_send_form.reception.value==""){
			alert("수신인 학번을 입력 하세요");
			mail_send_form.reception.focus();
			return;
		}
		mail_send_form.action="/Turkey/re_check";
		mail_send_form.submit();
	}
	function send(){
		if(mail_send_form.reception.value==""){
			alert("수신인 학번을 입력 하세요");
			mail_send_form.reception.focus();
			return;
		}
		if(mail_send_form.contents.value==""){
			alert("내용을 입력하세요");
			mail_send_form.contents.focus();
			return;
		}
		if(mail_send_form.row1.value=="0"){
			alert("수신인 체크를 하세요");
			return;
		}
		mail_send_form.action="/Turkey/send_mail";
		mail_send_form.submit();
	}
	
</script>