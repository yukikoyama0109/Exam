<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%--メッセージの出力 --%>
<p>Hello!</p>

<p>Hello!</p>
<p>Hello!</p>
<p>Hello!</p>
<p>Hello!</p>

<%--javaを書いている場所 --%>
<p><% out.println(new java.util.Date()); %></p>

<%@include file="../footer.html" %>