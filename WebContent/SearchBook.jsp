<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>按条件查询图书</title>
</head>
<body>
<form action="SearchBook" method="post">
	<table>
		<tr>
		<td>请输入要查询的字段</td></tr>
		<tr><td><select name="条件">
		<option value="书名">书名</option>
		<option value="作者">作者</option>
		<option value="出版社">出版社</option>
		<option value="入库时间">入库时间</option>
	</select></td></tr>
		<tr><td><input type="text" name="字段名"></td></tr>
		<tr><td><input type="submit" value="查找"></td></tr>
		</table>
		   </form>
		   <h2><font color="blue">${book}</font></h2>
</body>
</html>