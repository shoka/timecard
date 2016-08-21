<%@ page language="java" contentType="text/html;charset=Windows-31J"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:useBean id="date" class="java.util.Date"/>

<html><body>


    <div id="fmt">
		<h2>JSP タグ</h2>
	
		<p>
			<b>&lt;fmt:formatNumber&gt;</b>　数値データのフォーマット
		</p>
		<div style="margin-left: 20px"> 		
			<fmt:formatNumber value="1234" pattern="###,###" /><br>
			<fmt:formatNumber value="12.3" pattern="0.0000" /><br>
			<fmt:formatNumber value="0.278" pattern="##.#%" /><br>
		</div>
		
		
		<p>
			<b>&lt;fmt:formatDate&gt;</b>　日付データのフォーマット
		</p>
		<div style="margin-left: 20px"> 		
			<fmt:formatDate value="${date}" pattern="yyyyMMdd" /><br>
			<fmt:formatDate value="${date}" pattern="yyyy/MM/dd HH:mm:ss" /><br>
			<fmt:formatDate value="${date}" pattern="yyyy年MM月dd日（E） a KK時mm分ss秒" /><br>
			---------------------<br>
			<fmt:formatDate value="${date}" type="DATE" dateStyle="FULL" /><br>
			<fmt:formatDate value="${date}" type="DATE" dateStyle="LONG" /><br>
			<fmt:formatDate value="${date}" type="DATE" dateStyle="MEDIUM" /><br>
			<fmt:formatDate value="${date}" type="DATE" dateStyle="SHORT" /><br>
			---------------------<br>
			<fmt:formatDate value="${date}" type="TIME" timeStyle="FULL" /><br>
			<fmt:formatDate value="${date}" type="TIME" timeStyle="LONG" /><br>
			<fmt:formatDate value="${date}" type="TIME" timeStyle="MEDIUM" /><br>
			<fmt:formatDate value="${date}" type="TIME" timeStyle="SHORT" /><br>
			---------------------<br>
			<fmt:formatDate value="${date}" type="BOTH" dateStyle="FULL" /><br>
			<fmt:formatDate value="${date}" type="BOTH" dateStyle="LONG" /><br>
			<fmt:formatDate value="${date}" type="BOTH" dateStyle="MEDIUM" /><br>
			<fmt:formatDate value="${date}" type="BOTH" dateStyle="SHORT" /><br>
		</div>
		

	</div>


</body></html> 