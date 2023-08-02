<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">
    <head>
        <title>残高照会</title>
        <link rel="stylesheet" href="./mydec.css">
        <meta charset="utf-8">
    </head>
    <body>
        <h1>残高照会</h1>
        <figure>
            <div>
                <img id="fig_img" src="https://3.bp.blogspot.com/-rbLf9xwxI0o/WYAyTS8FZKI/AAAAAAABF0c/zolV8Jwkw44-L1htjGakVLgi9n1Jt59dgCLcBGAs/s400/money_tsuchou_shock_woman.png">
            </div>
            <figcaption id="fig_cap">残高照会する口座の名前を入力して「OK」ボタンを押して下さい。</figcaption>
        </figure>
        <th>名前：</th>
        <form action="./bank" method="GET">  
        <input type="hidden" name="command" value="balance">
        <input type="text" name="name" placeholder="名前を入力してください">
        <input type="submit" value="OK">
        <a href="./balance">
            <input type="reset" value="reset">
        </a>
        </form>
        <br>
        <br>
        <a href="./index.html"><input type=button value="メニューに戻る"></a>

    </body>
</html>