<%@ page language="java" contentType="text/html;charset=Windows-31J"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Spring MVC Sample Form</title>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.0-rc.2/themes/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script>
  $(document).ready(function(){
	  console.log("${person.firstName}");
  });
  </script>
</head>
<body>


	<div id="Spring MVC">
		<h2>Spring MVC</h2>

		<p>フォームアクション指定なし：</p>
		<div style="margin-left: 20px">
			<p>

				<form:form modelAttribute="person">
					<table>
						<tr>
							<td>First Name:</td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="登録" /></td>
						</tr>
					</table>
				</form:form>
			</p>
			<p>フォームアクション指定あり：</p>
			<p>
				<spring:url value="/sample/mvc/form/update" var="formUrl" />
				<form:form modelAttribute="person" action="${formUrl}">
					<table>
						<tr>
							<td>First Name:</td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="登録" /></td>
						</tr>
					</table>
				</form:form>
			</p>
			<p>
				<br> <a href="<c:url value="/sample/mvc/home" />"> Back to
					Home! </a>
			</p>
		</div>



	</div>

</body>
</html>
