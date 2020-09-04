<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	/*
			url : 데이터를 전송할 URL
			dataType : 서버가 리턴하는 데이터 타입 (xml, json, script, html)
			data : 서버에 전송할 데이터, key/value 형식의 객체
			type : 서버로 전송하는 데이터의 타입 (POST, GET)
			success : ajax통신에 성공했을 때 호출될 이벤트 핸들러
	 */

	$('#getResult')
			.click(
					function() {
						$('#result').html('');

						// 사용자가 getResult 버튼을 눌렀을 때 텍스트 노드에 있는 결과값을 지워준다.

						$
								.ajax({
									url : 'http://opentutorials.org/example/jquery/example.jquery.ajax.php',
									dataType : 'json',

									// 서버가 리턴해주는 데이터 타입이 json이다.
									type : 'POST',
									data : {
										'msg' : $('#msg').val()
									},

									// data 속성 내부에 또다른 {}가 있다. 중괄호 내부는 객체이다.
									// data: 서버에 전송할 데이터로서 값은 key와 value로 이루어진 객체

									success : function(result) {

										// 인자 result에는 서버에서 리턴해준 배열이 들어감
										// 배열이 들어온 이유는 dataType속성을 JSON으로 했기 때문에 리턴되는 데이터가 텍스트더라도 내부적으로 그 데이터를                                     // JSON으로 해석하여 배열로 변환
										// 그래서 배열에 있는 result값을 체크하면 result가 true라면 성공 이벤트 관련 로직을 출력한다.
										// 서버와의 통신이 성공하면 호출되는 이벤트 핸들러인 function(result)
										// result 인자에는 서버가 리턴해주는 데이터가 들어감

										if (result['result'] == true) {

											//result['result']는 연상 배열인가 확인하자
											$('#result').html(result['msg']);
										}
									}
								});
					})

	// 자바스크립트에서 중괄호는 객체를 의미 , $ajax{}도 마찬가지이다.
</script>

</head>
<body>

	<div id="result"></div>
	<input type="text" id="msg" />
	<input type="button" value="get result" id="getResult" />

<!-- 
	
1. $ajax 설정값
	(1) url 
		HTTP 요청을 할 대상이되는 url
		단순히 html 페이지에 대한 주소가 될 수도 있고 WCF.ASMX 서비스에서 노출한 서비스 종단점에 대한 url일 수도 있다.

	(2) async
		true/false 기본값 true
		기본적으로 모든 Ajax 요청은 비동기적으로 보내진다. 동기적으로 호출하면 요청이 진행되는 동안 페이지가 잠시 블록킹된다.

	(3) cache
		true/false
		false로 설정되면 브라우저는 요청된 결과로 받은 페이지를 캐싱하지 않는다.

	(4) contentType
		기본값: application/x-www-form-urlencode
		서버로 데이터를 전송할 때 콘텐츠 타입을 나타내는 값
		기본값을 사용하면 대부분의 경우 잘 적용된다. JSON 형식의 데이터를 서버로 보낼 때는 "application/json"으로 설정한다.

	(5) type
		GET, POST (기본값은 GET이다.)

	(6) dataType
		서버에서 반환받을 데이터의 타입
		사용 가능한 값: html, json, jsonp, script, text
		이 값에 따라 반환받은 데이터를 적절하게 자동으로 파싱한다. 이 값을 설정하지 않으면 HTTP 응답의 MIME 타입을 근거로 자동 파싱한다. 
		만약 xml이 MIME 타입에 포함돼 있다면 xml로 파싱해서 다음 단계로 넘겨준다.

	(7) data
		서버로 전송될 데이터. GET, POST 같은 전송 타입에 따라 처리되는 방식이 다르다. 어떤 전송 타입이든 ‘키, 값’으로 돼 있어야 한다.
		GET 방식이면 key1=value1, key2=value2처럼 구성될 것이고 POST 방식이면서 dataType이 "json" 이면 key1:value1, 
		key2:value2을 전송할 것이다.

	(8) processData
		true/false
		기본적으로 data로 건네받은 객체가 문자열이 아닌 경우는 content-type이 
		“application/x-www-form-urlencorded"에 맞게 모두 변경된다.
		만약 data에서 넘겨준 그대로를 서버로 보내고 싶다면 false로 지정한다.

2. $ajax() 콜백 설정
	$Ajax()는 Ajax 호출을 하는 데 많은 단계를 정의하고 있다. 
	$Ajax() 설정 중에는 이러한 단계별로 호출될 콜백 함수 객체를 전달할 수 있는 항목이 있다. 

	(1) beforeSend
		beforeSend에 설정된 콜백함수를 호출할 때는 다음의 두 인자를 차례로 전달한다.
		jqXHR: jQuery XMLHttpRequest 객체
		settings: 설정 항목

	(2) dataFilter
		서버로부터의 HTTP 요청이 성공하고 나서 서버로부터 데이터를 받으면 호출되는 함수다. 
		success 콜백 함수가 호출되며, 인자로 data, dataType를 받는다.
		data: 서버로부터 반환된 raw 데이터
		dataType: 호출 시 설정한 dataType 항목의 값 
		이 함수는 success로 전달될 데이터를 반환해야 한다.

	(3) success
		HTTP 요청이 성공하면 호출되는 함수로서, 차례로 data, textStatus, jqXHR를 인자로 전달 받는다.
		data: 서버에서 반환된 데이터, dataType 설정에 따라 반환된 결과가 달라진다. json이면 서버에서 반환된 문자열이 JSON.parse()를 거치게 된다.
		textStatus: 요청 상태를 나타내는 문자열
		jqXHR: JQuery XMLHttpRequest 객체

	(4) error
		요청이 실패하면 호출될 함수로서, 차례로 jqXHR, textStatus,
		errorThrown을 인자로 전달 받는다.

		jqXHR: JQuery XMLHttpRequest 객체
		textStatus: 애러 타입을 나타내는 문자열(‘timeout', 'error', 'abort','parseerror' 등)
		errorThrown: HTTP 에러가 발생하는 경우 “Not Found"나 “Internal Server Error”와 같이 HTTP 상태를 나타내는 문자열

	(5) complete
		HTTP 요청이 끝난 후나 success, error 콜백 함수가 실행되고 나서
		호출되는 함수로서, 차례로 jqXHR, textStatus를 인자로 전달 받는다.



 -->
</body>
</html>

