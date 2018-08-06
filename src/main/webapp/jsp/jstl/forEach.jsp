<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table {
		text-align : center;
	}
</style>

</head>
<body>
<h3>전체학생 조회</h3>
<!-- <table> -->
<!-- 	<tr> -->
<!-- 		<th>ID	</th> -->
<!-- 		<th>이름	</th> -->
<!-- 		<th>횟수	</th> -->
<!-- 	</tr>	 -->
<%-- 	<c:forEach items="${studentList}" var="studentVo"> --%>
<!-- 			<tr> -->
<%-- 				<td>${studentVo.id}			</td> --%>
<%-- 				<td>${studentVo.name}		</td> --%>
<%-- 				<td>${studentVo.call_cnt}	</td> --%>
<!-- 			</tr> -->
<%-- 	</c:forEach> --%>
<!-- </table> -->


<table>
	<tr>
		<th>ID	</th>
		<th>이름	</th>
		<th>횟수	</th>
		<th>상태	</th>
	</tr>	
	<c:forEach items="${studentList}" var="studentVo" begin="2" end="13" step="2" varStatus="status">
			<tr>
				<td>${studentVo.id}			</td>
				<td>${studentVo.name}		</td>
				<td>${studentVo.call_cnt}	</td>
				<td>${status.index}			</td>
			</tr>
	</c:forEach>
</table>


<h3>foreach map</h3>
<%-- map에 잇는 값들을 전부 조회해서 출력 
	map.get("name"), map.get("alias")
--%>
<c:forEach items="${map}" var="entry">
	${entry.key} / ${entry.value} <br>
</c:forEach>

<h3>forTokens</h3>
<c:forTokens items="${lineRangers}" delims="," var="ranger">
	 ${ranger} <br>
</c:forTokens>
	


</body>
</html>