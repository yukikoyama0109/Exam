<%@page contentType="text/html; charset=UTF-8"  %>
<%@include file="../header.html" %>

<p>商品追加成功</p>
<p>下記商品登録成功</p>


商品名<%=request.getParameter("name") %>
価格<%=request.getParameter("price") %>



<%@include file="../footer.html" %>
