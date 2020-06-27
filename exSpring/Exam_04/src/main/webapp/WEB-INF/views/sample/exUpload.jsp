<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset = utf-8">
<title>가상 파일업로드</title>
</head>
<body>
	<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data"></form>
	
	<div>
		<input type="file" name="files"><!-- 배열방식으로 데이터를 넘길 수 있음 -->
	</div>
	<div>
		<input type="file" name="files">
	</div>
	<div>
		<input type="file" name="files">
	</div>
	<div>
		<input type="submit" >
	</div>
</body>
</html>