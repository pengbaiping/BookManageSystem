<%@ page language="java" contentType="text/html;charset=utf-8" %>
<html>
<head>
<meta charset="utf-8">
<title>读者登录</title>
<script language="javascript" type="text/javascript">
function validator()
{
	if(document.form1.图书证号.value=="")
		{
		alert("请输入图书证号！");return false;
		}
	if(document.form1.登录密码.value=="")
	{
	alert("请输入密码！");return false;
	}
	}</script>
</head>
<h1>欢迎</h1>
	<form name="form1" method="post" action="ReaderLogin" onSubmit="return validator()">
    <table>
	<tr>
		<td>请输入图书证号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入登录密码：
		<td bgcolor="blue"><input name="登录密码" type="password">
	<tr>
		</table><br>
	<input type="reset" value="重置">
	<input type="submit" value="登录">
	</form>
		<a href="HomePage.jsp">回到首页</a>
<body>
</body>
</html>
