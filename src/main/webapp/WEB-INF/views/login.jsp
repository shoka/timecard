<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="false" %>

<html>
<head>
	<title>forms | mvc-showcase</title>
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		

</head>
<body>

	<div id="formsContent">
		<h2>Forms</h2>
		<spring:url value="/login" var="formUrl"/>
		<form:form  modelAttribute="User" action="${formUrl}" method="post" >

		  	<fieldset>
		  		<legend>Personal Info</legend>

		  		<form:input path="${userId}" />
		  		
		  		<form:input path="${password}" />
	
	
		  	</fieldset>
	

	
			<p><button type="submit">Submit</button></p>
		</form:form>

	</div>

</body>
</html>
