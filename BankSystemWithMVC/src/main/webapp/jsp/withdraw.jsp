<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 String name=(String)request.getAttribute("name");
%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">
    <head>
        <title>引き出し</title>
        <link rel="stylesheet" href="./mydec.css">
        <meta charset="utf-8">
    </head>
    <body>
        <h1>預金</h1>
        <br>
     <form action="./bank" method="GET">  
		<h2>Welcome <%=name %></h2>
        <th>引き出し金額：</th>
        <input type="text" name="amount" placeholder="金額を入力してください">
        <input type="hidden" name="command" value="withdraw"/> 
        <input type="submit" value="OK">
        <a href="./withdraw">
            <input type="reset" value="reset">
        </a>
        </form>
        <br>
        <br>
       <form action="bank" method="GET">
		<input type="hidden" name="command" value="login"/>
		<input type="submit" value="メニューに戻る">
		</form>

    </body>
</html>