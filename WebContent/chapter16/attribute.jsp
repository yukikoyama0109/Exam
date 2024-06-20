<%@page contentType="text/html; charset=UTF-8"  %>
<%@include file="../header.html" %>
<!-- importする -->
<%@page import="bean.Product" %>

<!-- サーブレットからデータを受け取るget.attribute() -->
<% Product p=(Product)request.getAttribute("product"); %>

<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>

<%@include file="../footer.html" %>
