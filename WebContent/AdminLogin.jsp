<%@ page language="java" contentType="text/html;charset=utf-8" %>
<html>
<head>
<meta charset="utf-8">
<title>管理员登录</title>
<script language="javascript" type="text/javascript">
function validator()
{
	if(document.form1.用户名.value=="")
		{
		alert("请输入用户名！");return false;
		}
	if(document.form1.管理密码.value=="")
	{
	alert("请输入密码！");return false;
	}
	}</script>
</head>
<h1>欢迎</h1>
	<form name="form1" method="post" action="AdminLogin" onSubmit="return validator()">
    <table>
	<tr>
		<td>请输入用户名：
		<td bgcolor="blue"><input name="用户名" type="text" >
	<tr>
		<td>请输入管理密码：
		<td bgcolor="blue"><input name="管理密码" type="password">
	<tr>
		</table><br>
	<input type="reset" value="重置">
	<input type="submit" value="登录">
	</form>
		<a href="HomePage.jsp">回到首页</a>
<body>
</body>
</html>
