<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>°´Ìõ¼þ²éÑ¯Í¼Êé</title>
</head>
<body>
<form action="SearchBook" method="post">
	<table>
		<tr>
		<td>ÇëÊäÈëÒª²éÑ¯µÄ×Ö¶Î</td></tr>
		<tr><td><select name="Ìõ¼þ">
		<option value="ÊéÃû">ÊéÃû</option>
		<option value="×÷Õß">×÷Õß</option>
		<option value="³ö°æÉç">³ö°æÉç</option>
		<option value="Èë¿âÊ±¼ä">Èë¿âÊ±¼ä</option>
	</select></td></tr>
		<tr><td><input type="text" name="×Ö¶ÎÃû"></td></tr>
		<tr><td><input type="submit" value="²éÕÒ"></td></tr>
		</table>
		   </form>
		   <h2><font color="blue">${book}</font></h2>
</body>
</html>