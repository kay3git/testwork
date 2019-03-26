<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>BuyItem画面</title>

<style type="text/css">

/*==============TAG LAYOUT=======*/
body{
margin:0;
padding:0;
line-height:1.6;
letter-spacing:1px;
font-familiy:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
background:#fff;
width:100%;

}

table{
text-align:center;
margin:0 auto;
}
/*=====ID  LAYOUT======*/
#top{
width:780px;
margin:30px auto;
border:1px solid #333;
}

#header{
width: 100%;
height: 80px;
background-color:black;
}
#main{
width:100%;
height:450px;
text-align: center;
}
#footer{
width:100%;
height:80px;
background-color:black;
clear:both;
}
.user{
float:left;
font-size:15px;
margin:0;
margin-left:125px;
text-align: center;
}
.user_name{
float:left;
margin:0;
font-size:15px;
}
.line{
width:100%;
height:25px;
}
.img1{
width:100px;
height:150px;
padding-top:50px;
padding-left:55px;
}
.img2{
width:200px;
height:200px;
}
.box{
width:300px;
height:300px;
float:left;
}
.box2{

width:300px;
height:300px;
float:left;
}
.list{
width:100%;
height:70%;
}

.move{
text-align:center;
}
.list_top{
margin:0 auto;
width:600px;
height:300px;
text-align:center;
}
p{

margin:0 auto;
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
                    <p>BuyItem</p>
              </div>
              <div class="line"><p class="user">アカウント名:</p><a href='<s:url action="MyPageAction"/>'><p class="user_name"><s:property value="session.user_name"/></p></a></div>





              <div class="list">
                  <div class="list_top">
                            <div class="box">

                            <s:form action="BuyItemAction">
                                        <div class="img1"><img src="noot.jpg"></div>
                                        <p>ノートBook</p>
                                        <p>200円</p>
                                        購入個数
                                       <select name="count">
                                               <option value="1"selected="selected">1</option>
                                               <option value="2">2</option>
                                               <option value="3">3</option>
                                               <option value="4">4</option>
                                               <option value="5">5</option>
                                       </select>
                                       <input type="hidden" name="id" value=1>
                                       <s:submit class="buttom" value ="購入"/>

                             </s:form>
                             </div>

                              <div class="box2">
                              <s:form action="BuyItemAction">
                                        <div class="img2"><img src="bike.jpg"></div>
                                        <p>自転車</p>
                                        <p>300円</p>
                                        購入個数
                                       <select name="count">
                                               <option value="1"selected="selected">1</option>
                                               <option value="2">2</option>
                                               <option value="3">3</option>
                                               <option value="4">4</option>
                                               <option value="5">5</option>
                                       </select>
                                       <input type="hidden" name="id" value=2>
                                       <s:submit class="buttom" value="購入"/>

                               </s:form>
                               </div>
                    </div>
                </div>







                            <div class="move">
                                   <p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
                            </div>


                </div>




       <div>
       <div id="footer">
                <div id="pr">
                </div>
       </div>
       </div>

</body>
</html>