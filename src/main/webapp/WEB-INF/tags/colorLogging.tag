<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="color" type="java.lang.String" required="true"%>
<%@ attribute name="size" type="java.lang.Integer" required="false"%>
<%-- size속성이 들어오지 않으면 기본값으로 30 --%>

<font color="${color}">	
	<c:choose>
		<c:when test="${size == null}">
			<c:forEach begin="0" end="50">_</c:forEach>
		</c:when>
		<c:when test="${size != null}">
			<c:forEach begin="0" end="${size}">_</c:forEach>
		</c:when>
	</c:choose>
</font>


	<!-- 다른 방법 -->
<%-- <c:if test="${size == null }"> --%>
<%-- 	<c:set var="size" value="30"> --%>
<%-- </c:if> --%>

<%-- <font color="${color}"> --%>
<%-- 	<c:forEach begin="0" end="${size}">_</c:forEach> --%>
<!-- </font> -->