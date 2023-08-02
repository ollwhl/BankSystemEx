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
    <title>引き出し</title>
    <link rel="stylesheet" href="./mydec.css">
    <meta charset="utf-8">
</head>

<h1>引き出し</h1>
        <img id="fig_img" src="https://2.bp.blogspot.com/-QKneaBDHu_Y/WYAySa-UODI/AAAAAAABF0M/hTESMqN7YwYk82rY-D0q4LCZN_Df6FCAACLcBGAs/s400/money_tsuchou_happy_woman.png">
<%if(result>=0) {int amount=Integer.valueOf((String)request.getAttribute("amount"));%>
			        <h2><span><%=name %> </span>の口座へ<span><%=amount%></span>円の出金に成功し残高は<span><%=result %></span>円になりました。<span class="code">(400)</span></h2>
<%		}else if(result==-7) { %>
			        <h2><span><%=name %> </span>の口座は存在しません。<span class="code">(407)</span></h2>
<%		}else if(result==-1) {%>
			        <h2><span><%=name %></span>:出金金額は残高に超えています<span class="code">(401)</span></h2>
<%		}else if(result==-3) {%>
			        <h2><span><%=name %></span>:0以上の整数を入力してください<span class="code">(403)</span></h2>
<%		}else if(result==-4) {%>
			        <h2><span><%=name %></span>:0以上の整数を入力してください<span class="code">(404)</span></h2>
<%		}else {%>
			        <h2>unknowErro</h2>
		<%}%>

       	<form action="bank" method="GET" class="back">
	  		<input type="hidden" name="command" value="login"/>
	        <input type="submit" value="メニューに戻る">
		</form>>
    </body>
</body>

</html>