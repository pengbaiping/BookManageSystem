<%@page language="java" contentType="text/html;charset=utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>新书入库</title>
</head>
<h1>新书入库</h1>
<body>
	<form name="form2"method="post"action="AddBook"><table>
	<tr>
		<td>请输入书号：
		<td bgcolor="blue"><input name="书号" type="text">
	<tr>
		<td>请输入书名：
		<td bgcolor="blue"><input name="书名" type="ext">
	<tr>
		<td>请输入作者：
		<td bgcolor="blue"><input name="作者" type="text">
	<tr>
		<td>请输入出版社：
		<td bgcolor="blue"><input name="出版社" type="text">
	<tr>
		<td>请输入入库时间：
		<td bgcolor="blue"><input name="入库时间" type="text">
	<tr>
		<td>请输入图书状态：
		<td bgcolor="blue"><input name="是否借出" type="text">
	<tr>
		</table><br>
		<input type="reset" value="重置">
		<input type="submit" value="提交">
	</form>
		<a href="HomePage.jsp">回到首页</a>
</body>
</html>
