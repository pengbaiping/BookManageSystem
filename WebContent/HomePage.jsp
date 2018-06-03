<%@page language="java" contentType="text/html;charset=utf-8" %>
<html>
<head>
<meta charset="utf-8">
<title>PBP图书管理系统</title>
</head>
<body>
	<h1><marquee>欢迎使用本系统</marquee></h1>
	<h2><center>公告</center></h2>
	<h4><center><font color="blue">${noticeBean}</font></center></h4>
	<b><center>______________________________________________________________________________________________________</center></b>
	<p><a href="BookList.jsp"><center>图书列表</center></a></p>
	<p><a href="AdminLogin.jsp"><center>管理员登录</center></a></p>
	<p><a href="WorkerLogin.jsp"><center>工作人员登录</center></a></p>
	<p><a href="ReaderLogin.jsp"><center>读者登录</center></a></p>
<script language="javascript">
    function showtime(){
    var today,hour,second,minute,year,month,date;
    var strDate ;
    today=new Date();
    var n_day = today.getDay();
    switch (n_day){
        case 0:strDate = "星期日";break;
        case 1:strDate = "星期一";break;
		case 2:strDate = "星期二";break;
        case 3:strDate = "星期三";break;
        case 4:strDate = "星期四";break;
        case 5:strDate = "星期五";break;
        case 6:strDate = "星期六";break;
        case 7:strDate = "星期日";break;  
    }
    year = today.getFullYear();
    month = today.getMonth()+1;
    date = today.getDate();
    hour = today.getHours();
    minute =today.getMinutes();
    second = today.getSeconds();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (date >= 0 && date <= 9) {
        date = "0" + date;
    }
    if (hour >= 0 && hour <= 9) {
        hour = "0" + hour;
    }
    if (minute >= 0 && minute <= 9) {
        minute = "0" + minute;
    }
    if (second >= 0 && second <= 9) {
        second = "0" + second;
    }
    document.getElementById('current-time').innerHTML ="当前时间："+ year + "年" + month + "月" + date + "日" +"  "+ strDate +"   " + hour + ":" + minute + ":" + second; //显示时间  
    setTimeout("showtime();", 1000); //设定函数自动执行时间为 1000 ms(1 s)
}  
</script>
     <div id="current-time"></div>
       <script language="javascript">showtime();</script>
	
</body>
</html>