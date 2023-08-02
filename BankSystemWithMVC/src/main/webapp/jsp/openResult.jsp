<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 String name=request.getParameter("name");
 int result=Integer.valueOf((String)request.getAttribute("result"));
%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">

<head>
    <title>口座開設</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<body>
        <h1>口座開設</h1>
        <img id="fig_img" src="https://2.bp.blogspot.com/-QKneaBDHu_Y/WYAySa-UODI/AAAAAAABF0M/hTESMqN7YwYk82rY-D0q4LCZN_Df6FCAACLcBGAs/s400/money_tsuchou_happy_woman.png">
<% if(result==0) { %>
			        <h2><span><%=name %></span>の口座の開設に成功しました。<span class="code">(100)</span></h2>
<% }else{ %>
			        <h2><span><%=name %></span>の口座は既に存在します。<span class="code">(107)</span></h2>
<% } %>
        <a href="./index.html"><input type=button value="メニューに戻る"></a>
    </body>

</html>