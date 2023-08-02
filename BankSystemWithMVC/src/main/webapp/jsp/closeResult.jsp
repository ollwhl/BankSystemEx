<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String name=(String)request.getAttribute("name");
int result=Integer.valueOf((String)request.getAttribute("result"));
%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">

<head>
    <title>Login</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<body>
 <body>
        <h1>口座解約</h1>
        <img id="fig_img" src="https://2.bp.blogspot.com/-QKneaBDHu_Y/WYAySa-UODI/AAAAAAABF0M/hTESMqN7YwYk82rY-D0q4LCZN_Df6FCAACLcBGAs/s400/money_tsuchou_happy_woman.png">
    <%if(result==0){ %>
    <h2><span><%=name %></span>口座解約成功しました<span class="code">(200)</span></h2>
    <%}else if(result==-7){%>
	<h2><%=name %>の口座が存在しません<span class="code">(207)</span></h2>
	<%}else if(result==-1){%>
	<h2><span><%=name %></span>の口座の残高が０でない<span class="code">(201)</span></h2>
	<%}else{%>
	<h2>Unknow erro</h2>
	<%} %>
        <a href="./index.html"><input type=button value="メニューに戻る"></a>
    </body>
</body>

</html>
