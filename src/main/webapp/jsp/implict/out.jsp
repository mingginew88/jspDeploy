<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>	
	td {
		border : 1px solid blue;
		text-align : center;
	}
</style>
</head>
<body>

<%
	//기본객체 : request, response, session
	//out객체 : servlet의 printWriter와 유사한 객체(정확히 말하면 완전히 다른 객체)
	//localhost:8280/jsp/implict/out.jsp
	out.write("sumResult : " + session.getAttribute("sumResult"));
	out.write("<br>");
%>

<%
	out.write("<table>");
	for (int i = 1; i < 10; i++) {
		out.write("<tr>");
		for (int j = 2; j < 10; j++) {
			out.write("<td>" + j + "*" + i + "=" + i * j + "</td>");
		}
		out.write("</tr>");
	}
	out.write("</table>");
%>






</body>
</html>