<%@tag import="java.sql.SQLException"%>
<%@tag import="java.sql.DriverManager"%>
<%@tag import="java.sql.ResultSet"%>
<%@tag import="java.sql.PreparedStatement"%>
<%@tag import="java.sql.Statement"%>
<%@tag import="java.sql.Connection"%>

<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="lgu" type="java.lang.String" required="false"%>

<%
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc17";
	String pass = "java";
	Connection conn =null;
	Statement  stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs =null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pass);
		stmt = conn.createStatement();
		pstmt = conn.prepareStatement("select prod_id, prod_name from prod where prod_lgu='" + jspContext.getAttribute("lgu") + "'");
		rs=pstmt.executeQuery();
		out.write("<select>");
		while(rs.next()) {
			out.write("<option value=\"" + rs.getString("prod_id") + "\">");
			out.write(rs.getString("prod_name"));
			out.write("</option>");
		}
		out.write("</select>");
		conn.close();
	
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(conn!=null) try {conn.close();} catch (SQLException e) {}
	}
%>










