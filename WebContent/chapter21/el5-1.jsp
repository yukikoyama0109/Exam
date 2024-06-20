<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@page import="java.util.List, java.util.ArrayList" %>
<%@page import="java.util.Map, java.util.HashMap" %>

<form action="el5-2.jsp" method="post">
<input type="text" name="price">
円×
<input type="text" name="count">
個=

<input type="submit" value="計算">
</form>



<%@include file="../footer.html" %>
