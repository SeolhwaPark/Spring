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
			보낸 쪽지함
		</div>
		
		<div class="post_check_form">
			<form>
				<div class="post_check_form_search">
					<table style="text-align:center;">
						<colgroup>
							<col width="100px">
							<col width="300px">
							<col width="100px">
						</colgroup>
						<tr>
							<th style="border-right:1px solid #000">보낸사람</th>
							<th style="border-right:1px solid #000">내용</th>
							<th>날짜</th>
						</tr>
						<colgroup>
							<col width="100px">
							<col width="300px">
							<col width="100px">
						</colgroup>
						<c:forEach var="sendmail" items="${send_mail_list}">
							<tr>
								<th style="border-right:1px solid #000">${sendmail.sending}</th>
								<th style="border-right:1px solid #000">${sendmail.contents}</th>
								<th>${sendmail.regdate.substring(0,10)}</th>
							</tr>
						</c:forEach>
					</table>
				</div>
			</form>
				<a href="/Turkey/list_send_mail">  <input type="button" value="보낸쪽지" style="width:100px;margin-top:50px;"></a>
				<a href="/Turkey/list_mail"><input type="button" value="받은쪽지" style="width:100px;margin-top:50px;"></a>
				<a href="/Turkey/send_mail"><input type="button" value="쪽지전송" style="width:100px;margin-top:50px;"></a><br><br>
		</div>
		
	</div>

	
<script>

</script>