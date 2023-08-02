<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">

<head>
    <title>口座開設</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<body>
    <h1>BankSystem</h1>
    <form action="bank" method="GET">
        <h2>口座開設</h2>
        <th>名前</th>
        <input type="text" name="name" placeholder="名前を入力してください">
        <br>
        <th>パスワード</th>
        <input type="password" name="password" placeholder="6~10の半角英数字を入力してください">
        <br>
        <th>パスワードを再入力</th>
        <input type="password" name="comfirmPassword" placeholder="パスワードを再入力してください">
        <input type="hidden" name="command" value="open" />
        <br><br><br><input type="submit" value="開設">
        <br>
    </form>
    <a href="./index.html">ログイン</a>
</body>

</html>