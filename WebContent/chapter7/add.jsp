<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%!
int add(int a, int b) {
	return a+b;
	}
%>

<%!
int kake(int a, int b) {
	return a*b;
	}
%>

<%!
int hiki(int a, int b) {
	return a-b;
	}
%>

<%!
double wari(double a, double b) {
	double c = a/b;
	return c;
	}
%>

<p>1+2=<%=add(1,2) %></p>
<p>3+4=<%=add(3,4) %></p>

<p>3×4=<%=kake(3,4) %></p>
<p>7×8=<%=kake(7,8) %></p>

<p>3-4=<%=hiki(3,4) %></p>
<p>7-8=<%=hiki(7,8) %></p>

<p>4/2=<%=wari(4,2) %></p>
<p>8/3=<%=wari(8,3) %></p>
<%@include file="../footer.html" %>