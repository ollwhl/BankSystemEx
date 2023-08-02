<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 316541 ワンフリン-->
<!DOCTYPE html>
<html lang="ja">
    <head>
        <title>口座解約</title>
        <link rel="stylesheet" href="./mydec.css">
        <meta charset="utf-8">
    </head>
    <body>
        <h1>口座解約</h1>
        <figure>
            <div>
                <img id="fig_img" src="https://4.bp.blogspot.com/-yegtrREZExI/VxC3Q2-WhMI/AAAAAAAA51k/PMe0Rfkh61MasMNRZjdUgqbWg96Svbo6ACLcB/s400/kaiyaku_contract.png">
            </div>
            <figcaption id="fig_cap">解約する口座のパスワードを入力して「OK」ボタンを押して下さい。</figcaption>
        </figure>
     <form action="./bank" method="GET">  
        <th>パスワード：</th>
        <input type="text" name="password" placeholder="パスワードを入力してください">
        <input type="hidden" name="command" value="close"/> 
        <input type="submit" value="OK">
        <a href="./close">
            <input type="reset" value="reset">
        </a>
        </form>
        <form action="bank" method="GET" class="back">
	  		<input type="hidden" name="command" value="login"/>
	        <input type="submit" value="メニューに戻る">
		</form>
    </body>
</html>