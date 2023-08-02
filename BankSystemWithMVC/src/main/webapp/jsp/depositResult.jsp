<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 316541 ワンフリン-->
<%
String name=(String)request.getAttribute("name");
int result=Integer.valueOf((String)request.getAttribute("result"));
%>
<!DOCTYPE html>
<html lang="ja">

<head>
    <title>Login</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<body>
    <h1>預金</h1>
        <img id="fig_img" src="https://2.bp.blogspot.com/-QKneaBDHu_Y/WYAySa-UODI/AAAAAAABF0M/hTESMqN7YwYk82rY-D0q4LCZN_Df6FCAACLcBGAs/s400/money_tsuchou_happy_woman.png">
    <% if(result>=0) { int amount=Integer.valueOf((String)request.getAttribute("amount"));%>
			        <h2><span><%=name %></span>の口座へ<span><%=amount %></span>円の預金に成功し残高は<span><%=result %></span>円になりました。<span class="code">(300)</span></h2>
	<% 	}else if(result==-7) { %>
			        <h2><span><%=name %></span>の口座は存在しません。<span class="code">(307)</span></h2>
	<% 	}else if(result==-3) { %>
			        <h2><span><%=name %></span>:0以上の整数を入力してください<span class="code">(303)</span></h2>
	<% 	}else if(result==-4) { %>
			        <h2><span><%=name %></span>:0以上の整数を入力してください<span class="code">(304)</span></h2>
	<% 	}else { %>
			        <h2>unknowErro</h2>
	<% 	} %>
   	<form action="bank" method="GET">
		  <input type="hidden" name="command" value="login"/>
		  <input type="submit" value="メニューに戻る">
	</form>
</body>


</html>