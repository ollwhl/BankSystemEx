<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">

<head>
    <title>パスワード変更</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<body>
    <h1>BankSystem</h1>
    <form action="main" method="GET">
        <h2>パスワード変更</h2>
        <br>
        <th>パスワード</th>
        <input type="password" name="password" placeholder="6~10の半角英数字を入力してください">
        <br>
        <th>パスワードを再入力</th>
        <input type="password" name="comfirmPassword" placeholder="パスワードを再入力してください">
        <input type="hidden" name="command" value="regist" />
        <br><br><br><input type="submit" value="変更">
        <br>
    </form>
    <a href="./index.html">戻る</a>
</body>

</html>