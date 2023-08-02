<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 String name=(String)request.getAttribute("name");
int result=Integer.valueOf((String)request.getAttribute("result"));
%>
		<!DOCTYPE html>
		<html lang="ja">
		    <head>
		        <title>残高照会</title>
		        <link rel="stylesheet" href="./mydec.css">
		        <meta charset="utf-8">
		    </head>
		    <body>
		        <h1>引き出し</h1>
		        <img id="fig_img" src="https://2.bp.blogspot.com/-QKneaBDHu_Y/WYAySa-UODI/AAAAAAABF0M/hTESMqN7YwYk82rY-D0q4LCZN_Df6FCAACLcBGAs/s400/money_tsuchou_happy_woman.png">
<%		if(result>=0) {%>
			        <h2><span><%=name%></span>の口座の残高は<span><%=result%>円</span><span class="code">(500)</span></h2>
			        <%		}else if(result==-7) {%>
			        <h2><span><%=name%></span>の口座は存在しません。<span>(507)</span></h2>
			         <%		}else {%>
			        <h2>unknowErro</h2>
			        <%		}%>
       	<form action="bank" method="GET" class="back">
	  		<input type="hidden" name="command" value="login"/>
	        <input type="submit" value="メニューに戻る">
		</form>
		    </body>
		</html>