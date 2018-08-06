<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/common/jquery.jsp" %>
<script>
//select box 변경시 요청이 되도록 수정
$(function(){
	//페이지 로딩시 select box 설정
	$("select[name=locale]").val("${param.locale}").prop("selected", true);
	
	//select box 변경 이벤트
// 	$("select[name=locale]").change(function(){
// 		$("form").submit();
// 	});
});

</script>
</head>
<body>

<form action="/localeSelectServlet" method="get">
	<select name="locale">
		<option value="ko">한국어</option>
		<option value="ja">日本の語</option>
		<option value="en">English</option>
	</select>
	<input type="submit" value="전송" />
</form>


<c:set var="userId" value="brown"/><br>

<fmt:setLocale value="${param.locale}" />
<fmt:setBundle basename="kr.or.ddit.msg.msg" var="msg" />
<fmt:message bundle="${msg}" key="hello" />
<fmt:message bundle="${msg}" key="visitor">
	<fmt:param value="${userId}" />
</fmt:message>



</body>
</html>