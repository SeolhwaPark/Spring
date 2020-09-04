<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
<script type="text/javascript">
var txt1 = 'text1';
console.log(txt1);

if (true) {
  var txt2 = 'text2';
  console.log(txt2);
}
console.log(txt1);
console.log(txt2);
let txt1_1 = 'text1_1';
const txt3 = 'hello';

try {
console.log(txt1_1);
   txt3 = 'hello';
}catch(e) {
   console.log(txt3 + '를 할당할 때 에러가 발생하였습니다');
}
if (true) {
  let txt2_2 = 'text2_2';
  console.log(txt2_2);
}
console.log(txt1_1); 
console.log(txt3);

</script>
</head>
<body>
<h1>
	Hello world!  Exam_04
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
