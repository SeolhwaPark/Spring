<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${row == 0}">
	<script>
		alert("등록에 실패");
		history.back();
	</script>
</c:if>

<c:if test="${row == 1}">
	<script>
		alert("등록에 성공");
		location.replace("/Board/board_list");
	</script>
</c:if>

</body>
</html>