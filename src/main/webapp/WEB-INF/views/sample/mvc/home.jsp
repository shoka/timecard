<%@ page language="java" contentType="text/html;charset=Windows-31J"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>



	<div id="Spring MVC">
		<h2>Spring MVC</h2>

		<p>
			リクェストマッピング：<b>byPath&amp;Method</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/bypath_and_method" />"> By Path and Method </a>
			</p>
		</div>

		<p>
			リクェストマッピング：<b>byParameter</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/byparameter?name=Katsu" />"> By Parameter </a>
			</p>
		</div>


		<p>
			リクェストマッピング：<b>by Multiple Parameters</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/paramgroup?param1=foo&param2=bar&param3=baz" />"> Group of query parameters </a>
			</p>
		</div>
		
		<p>
			リクェストマッピング：<b>Path variable</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/path/変数" />">Path variable</a>
			</p>
		</div>

		<p>
			リクェストマッピング：<b>Convert Primitive</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/convert/primitive?value=300000000" />">Primitive</a>
			</p>
		</div>
		
		<p>
			リクェストマッピング：<b>Convert Date</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/convert/date/2016-08-22" />">Date</a>
			</p>
		</div>
		
		
		<p>
			リクェストマッピング：<b>POST</b>
		</p>
		<div style="margin-left: 20px">
			<p>
				<a href="<c:url value="/sample/mvc/post" />">POST</a>
			</p>
		</div>

	</div>


</body>
</html>
