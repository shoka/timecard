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
<link href="<c:url value="/resources/calendar.css" />" rel="stylesheet"  type="text/css" />	
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.0-rc.2/themes/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script>
  $(document).ready(function(){

  });
  </script>
</head>
<body>


	<div id="Spring MVC">
		<p>CAPカレンダー</p>
		<div style="margin-left: 20px; width: 600px;text-align: center;">
		<spring:url value="/sample/calendar/update" var="formUrl" />
		<form:form modelAttribute="calendarForm" action="${formUrl}">
			<table>
            <tr>
              <th style="text-align: center;">日</th>
              <th style="text-align: center;">月</th>
              <th style="text-align: center;">火</th>
              <th style="text-align: center;">水</th>
              <th style="text-align: center;">木</th>
              <th style="text-align: center;">金</th>
              <th style="text-align: center;">土</th>
            </tr>
				<tr class="${status.index % 2 == 0 ? 'even' : 'odd'}">
					<c:forEach var="calendar" items="${calendarForm.calendarList}"
						varStatus="status">
						<td class="${status.index % 7 == 0 ? 'fc-my_sun' : status.index % 7 == 6 ? 'fc-my_sat' : calendar.workingDiv != 1 ? 'fc-my_pubholiday' : 'fc-normalday'}">
						<fmt:formatDate	value="${calendar.date}" pattern="dd" />
						<br>
						<c:if test="${!empty calendar.date}">
						<form:checkbox path="calendarList[${status.index}].workingDiv" value="1"/>
						</c:if>
						</td>
						<c:if test="${status.index%7==6}">
							</tr><tr>
						</c:if>
					</c:forEach>
				</tr>
			</table>
			<br>
			<input type="submit" value="更新" />
			</form:form>

		</div>



	</div>

</body>
</html>
