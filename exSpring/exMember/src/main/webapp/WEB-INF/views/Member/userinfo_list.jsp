<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:if test="${empty user}">
	<script>
		alert("회원전용공간입니다");
		location.href="userlogin_form";
	</script>
</c:if>

<html>
<head>
<title>회원목록 보여주기</title>

<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>


<script>
	function m_search(){
		if(member.key.value==""){
			alert("검색어를 입력하세요");
			member.key.focus();
			return;
		}
		member.submit();
	}
</script>
</head>
<body>

<table width="550" border="1" cellspacing="0" cellpadding="2" bordercolorlight="#173E7C" bordercolordark="white">
  <tr>
    <td width=50 align=center>번호</td>
    <td width=50 align=center>ID</td>
    <td width=80 align=center>이름</td>
    <td width=100 align=center>전화번호</td>
    <td width=100 align=center>등록일자</td>
    <td width=100 align=center>최근접속일</td>
    
  </tr>
<c:forEach var="member" items="${list}">
   <tr>
      <td align=center>${member.idx}</td>
      <td align=center>${member.userid }</td>
      <td align=center>${member.name }</td>
      <td align=center>${member.tel }</td>
      <td align=center>${member.first_time }</td>
      <td align=center></td>
   </tr>
</c:forEach>
</table>

<form name="member" method="post" action="userinfo_list">
					<!-- 검색어를 이용하여 글제목, 작성자, 글내용 중에 하나를 입력 받아 처리하기 위한 부분 -->
<table width=550>
  <tr>
    <td>
      <select name="search">
        <option value="tel"<c:if test="${pageVO.search =='tel'}">selected </c:if>>전화 </option>
        <option value="addr1"<c:if test="${pageVO.search =='addr1'}">selected </c:if>>주소 </option>
        </select>
    </td>
    
    <td>  찾는이름:
          <input type="text" name="key" size=10> &nbsp;
          <input type=hidden name="user_id" >
          <a href="javascript:m_search()">[조회]</a>
     </td>
   </tr>
  <tr>
    <td>
    </td>
    <td></td>
   </tr>

  <tr>
  	<c:if test="${empty user}">
    <td><a href="userlogin_form">로그인 페이지 이동</a>
    </td>
  	</c:if>
	<c:if test="${!empty user}">
	<td><a href="logout">로그아웃 페이지 이동</a>
    </td>
	</c:if>
   
    <td><a href="userinfo_insert">[회원가입페이지 이동]</a></td>
   </tr>
</table>  
</form>  
</body>
</html>
