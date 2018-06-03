<%@page language="java" contentType="text/html;charset=utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>添加读者</title>
</head>
<h1>添加新读者</h1>
<body>
	<form name="form2"method="post"action="AddReader"><table>
	<tr>
		<td>请输入图书证号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入登录密码：
		<td bgcolor="blue"><input name="登录密码" type="ext">
	<tr>
		<td>请输入姓名：
		<td bgcolor="blue"><input name="姓名" type="text">
	<tr>
		<td>请输入院系：
		<td bgcolor="blue"><input name="院系" type="text">
	<tr>
		<td>请输入班级：
		<td bgcolor="blue"><input name="班级" type="text">
		</table><br>
		<input type="reset" value="重置">
		<input type="submit" value="提交">
	</form>
		<a href="HomePage.jsp">回到首页</a>
</body>
</html>
