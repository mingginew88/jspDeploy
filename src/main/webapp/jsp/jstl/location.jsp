<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	작성한 msg파일
	msg.properties 디폴트 파일~~~~
	msg_ko.properties
	msg_en.properties
	msg_ja.properties
--%>
<%-- <%
pageContext.setAttribute("userId","brown");
%> --%>
<!--c:set -->

<%--테스트 영역에 속성을 추가한것. --%>
<c:set var="userId" value="brown"/><br>

<fmt:setLocale value="ja"/>

<fmt:bundle basename="kr.or.ddit.msg.msg">
	<fmt:message key="hello" /><br>
	<fmt:message key="visitor">
		<fmt:param value="${userId}"></fmt:param>
	</fmt:message>
</fmt:bundle>

<h3>setBundle</h3>
<fmt:setLocale value="en"/>
<fmt:setBundle basename="kr.or.ddit.msg.msg" var="msg"/>
<fmt:message bundle="${msg}" key="hello"/>
<fmt:message bundle="${msg}" key="visitor"> 
	<fmt:param value="${userId}"/>
</fmt:message>

</body>
</html>