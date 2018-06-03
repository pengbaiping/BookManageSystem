<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ page import="java.sql.*,java.io.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>图书列表</title>
</head>
<body>
<center><b>图书信息浏览<hr>
		<table border=3>
			<tr><td><b><center>书号</td>
				<td><b><center>书名</td>
				<td><b><center>作者</td>
				<td><b><center>出版社</td>
				<td><b><center>入库时间</td>
				<td><b><center>是否借出</td>
			</tr>
		<%
		   Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt=con.createStatement();
ResultSet rst=stmt.executeQuery("select * from book;");
while(rst.next()){
	out.println("<tr>");
	out.println("<td>"+rst.getString("书号")+"</td>");
	out.println("<td>"+rst.getString("书名")+"</td>");
	out.println("<td>"+rst.getString("作者")+"</td>");
	out.println("<td>"+rst.getString("出版社")+"</td>");
	out.println("<td>"+rst.getString("入库时间")+"</td>");
	out.println("<td>"+rst.getString("是否借出")+"</td>");
	out.println("</tr>");
}
rst.close();
stmt.close();
con.close();
%>
</table>
<p><a href="HomePage.jsp">回到首页</a></p>
</body>
</html>