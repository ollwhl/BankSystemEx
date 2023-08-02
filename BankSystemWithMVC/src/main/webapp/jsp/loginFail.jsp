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
    <title>LoginFailed</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<h1>引き出し</h1>
        <img id="fig_img" src="https://2.bp.blogspot.com/-QKneaBDHu_Y/WYAySa-UODI/AAAAAAABF0M/hTESMqN7YwYk82rY-D0q4LCZN_Df6FCAACLcBGAs/s400/money_tsuchou_happy_woman.png">
<%if(result>=0) {int amount=Integer.valueOf((String)request.getAttribute("amount"));%>
			        <h2><span><%=name %> </span>の口座へ<span><%=amount%></span>円の出金に成功し残高は<span><%=result %></span>円になりました。<span class="code">(400)</span></h2>
<%		}else if(result==-7) { %>
			        <h2><span><%=name %> </span>の口座は存在しません。<span class="code">(407)</span></h2>
<%		}else if(result==-8) {%>
			        <h2><span><%=name %></span>パスワードをも一度確認してください<span class="code">(403)</span></h2>
<%		}else {%>
			        <h2>unknowErro</h2>
		<%}%>

 <a href="./index.html">ログアウト</a>
    </body>
</body>

</html>