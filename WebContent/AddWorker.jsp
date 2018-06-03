<%@page language="java" contentType="text/html;charset=utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>添加工作人员</title>
</head>
<h1>添加工作人员</h1>
<body>
	<form name="form2"method="post"action="AddWorker"><table>
	<tr>
		<td>请输入工号：
		<td bgcolor="blue"><input name="工号" type="text">
	<tr>
		<td>请输入密码：
		<td bgcolor="blue"><input name="密码" type="ext">
		</table><br>
		<input type="reset" value="重置">
		<input type="submit" value="提交">
	</form>
		<a href="HomePage.jsp">回到首页</a>
</body>
</html>
