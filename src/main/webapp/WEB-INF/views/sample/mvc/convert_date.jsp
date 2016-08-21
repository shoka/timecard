<%@ page language="java" contentType="text/html;charset=Windows-31J"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Spring MVC Sample param Group</title>
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.0-rc.2/themes/smoothness/jquery-ui.css">
  <link rel="stylesheet" href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
  <script>
  $(document).ready(function(){
  });
  </script>
</head>
<body>


    <div id="Spring MVC">
		<h2>Spring MVC</h2>
	
		<p>
			<b>convert_date.jsp</b>
		</p>
		<div style="margin-left: 20px"> 		
		<p>
			dateÅFÅ@${date}
		    <br>
		    <fmt:formatDate value="${date}" pattern="yyyy/MM/dd" /><br>
			<br>
			<a href="<c:url value="/sample/mvc/home" />"> Back to Home! </a>
		</p>
		</div>
		
		

	</div>

</body></html> 