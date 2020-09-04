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
	<script>
				alert("로그아웃합니다.");
				history.go(-1);
			</script>
	<%-- <c:choose>
		<c:when test="${row==1 }">
			<script>
				alert("수정되었습니다");
				location.replace("/Member/userinfo_list")
			</script>
		</c:when>
		<c:when test="${row==0 }">
			<script>
				alert("수정실패 \n 다음에 ....")
				history.back();
			</script>
		</c:when>
	</c:choose> --%>
</body>
</html>