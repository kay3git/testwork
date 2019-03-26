<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>BuyItemConfirm画面</title>
<style type="text/css">
	body {
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana,Helvetica,sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}
	table {
	text-align:center;
	margin:0 auto;
	}
	#top {
	width:780px;
	margin:30px auto;
	border:1px solid black;
	}
	#header {
	width:100%;
	hright:80px;
	background-color:black;
	}
	#main {
	width:100%;
	height:500px;
	text-align:center;
	}
	#footer {
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
	}
	#text-link {
	display:inline-block;
	text-align:right;
	}

</style>

</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
	<div>
		<s:form >
			<table>
				<tr>
					<td>商品名</td>
					<td><s:property value="session.buyItem_name"/></td>
				</tr>
				<tr>
					<td>値段</td>
					<td><s:property value="session.total_price"/><span>円</span></td>
				</tr>
				<tr>
					<td>購入個数</td>
					<td><s:property value="session.count"/><span>個</span></td>
				</tr>
				<tr>
					<td>支払い方法</td>
					<td><s:property value="session.pay"/></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>

					<td><s:submit action="BuyItemConfirmAction" value="完了"/></td>

					</tr>

			</table>
		</s:form>
	</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>