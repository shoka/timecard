<%@ page language="java" contentType="text/html;charset=Windows-31J"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*" %>
<%@ page import="me.linknext.timecard.javabean.SampleBean" %>

<jsp:useBean id="date" class="java.util.Date"/>

<html>
<head>
<style>
tr.odd {background-color: #EEDDEE}
tr.even {background-color: #EEEEDD}

</style>
</head>
<body>

<%
session.setAttribute("name","TOM");
session.setAttribute("count","15");
session.setAttribute("age","25");
%>
    <div id="fmt">
		<h2>JSP タグ</h2>
	
		<p>
			変数をセットする：<b>&lt;c:set&gt;</b>　
		</p>
		<div style="margin-left: 20px"> 		
			<pre>例：<a href="http://struts.wasureppoi.com/jstl/02_set.html">http://struts.wasureppoi.com/jstl/02_set.html</a></pre>
		</div>
		
		<p>
			単一の条件分岐：<b>&lt;c:if&gt;</b>　
		</p>
		<div style="margin-left: 20px"> 		
			<pre>例：<a href="http://struts.wasureppoi.com/jstl/02_if.html">http://struts.wasureppoi.com/jstl/02_if.html</a></pre>
		</div>
		
		<p>
			複数の条件分岐：<b>&lt;c:choose&gt;&lt;c:when&gt;&lt;c:otherwise&gt;</b>
		</p>
		<div style="margin-left: 20px"> 		
			<pre>例：<a href="http://struts.wasureppoi.com/jstl/02_choose.html">http://struts.wasureppoi.com/jstl/02_choose.html</a></pre>

		</div>
		
		<p>
			繰り返し（ループ）：<b>&lt;c:forEach&gt;</b>
		</p>
		<div style="margin-left: 20px"> 		
			<pre>例：<a href="http://struts.wasureppoi.com/jstl/02_foreach.html">http://struts.wasureppoi.com/jstl/02_foreach.html</a></pre>
			 <table>
			 <tr class="odd">
			   <th>No.</th>
			   <th>名前</th>
			 </tr>
			 <c:forEach var="person" items="${userList}" varStatus="status">
			 <tr class="${status.index % 2 == 0 ? 'even' : 'odd'}">
			   <td style="width: 100px;text-align: center;"><c:out value="${status.index}"/></td>
			   <td style="width: 200px;text-align: center;"><c:out value="${person.name}"/></td>
			 </tr>
			 </c:forEach>
			</table> 
		</div>

		<p>
			ＵＲＬエンコードする：：<b>&lt;c:url&gt;</b>
		</p>
		<div style="margin-left: 20px"> 		
			<pre>例：<a href="http://struts.wasureppoi.com/jstl/02_url.html">http://struts.wasureppoi.com/jstl/02_url.html</a></pre>
		</div>
	</div>


</body></html> 