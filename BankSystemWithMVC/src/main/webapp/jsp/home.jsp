<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%
 String name=(String)request.getAttribute("name");
%>
<!DOCTYPE html>
<html lang="ja">

<head>
    <title>Login</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<body>
    <h1>BankSystem</h1>
    <h2>Welcome <%=name %></h2>
        <form action="bank" method="GET">
        <input type="hidden" name="command" value="balance" />
        <input type="submit" value="残高照会">
        <br>
        <a href="./deposit">
            <input type="button" value="預金する">
        </a>
        <br><br>
        <a href="./withdraw">
            <input type="button" value="引き出し">
        </a>
        <br>
        <br>
        <a href="./history">
            <input type="button" value="履歴照会">
        </a><br><br>
        <a href="./close">
            <input type="button" value="口座解約">
        </a>
        </form>

        <br>
        <br>
    <br>
    <br>
    <a href="./resetPassword">パスワードを変更する</a>
    <a href="./index.html">ログアウト</a>
    <br>
    <br>
</body>

</html>