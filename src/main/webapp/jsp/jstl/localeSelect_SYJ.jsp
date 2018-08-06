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

<form class="selectedLanguage" action="/localeSelect" method="get" >
	<select id="langSel" name="langSel">
		<option id="sel" value="${locale}">
			<c:choose>
				<c:when test="${locale == 'ko'}">한국어	</c:when>
				<c:when test="${locale == 'ja'}">日本の語	</c:when>
				<c:when test="${locale == 'en'}">English</c:when>
			</c:choose>
		</option>
		<option value="ko">한국어		</option>
		<option value="ja">日本の語	</option>
		<option value="en">English	</option>
	</select>
	<input type="submit" id="btn" value="전송" />
</form>

	<c:set var="userId" value="brown"/><br>
	<fmt:setLocale value="${locale}"/>
	
	<fmt:bundle basename="kr.or.ddit.msg.msg">
		<fmt:message key="hello" /><br>
		<fmt:message key="visitor">
			<fmt:param value="${userId}"></fmt:param>
		</fmt:message>
	</fmt:bundle>

</body>
</html>