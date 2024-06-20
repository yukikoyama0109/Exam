<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>


<%! int countA = 0;  %>
<%! int countC = 100;  %>

<%
int countB=0;
	countA++;
	countB++;

%>

<%
	countC--;
%>

<p>宣言による変数countAは<%=countA %></p>
<p>スクリプトレット内の変数countBは<%=countB %></p>
<p>宣言による変数countCは<%=countC %></p>
<p><%=Math.random() %></p>




<%@include file="../footer.html" %>