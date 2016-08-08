<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.0-rc.2/themes/smoothness/jquery-ui.css">
  <link rel="stylesheet" href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
  <script>
  $( function() {
	var idString ="#datepicker";
    $( idString ).datepicker();
    $(".addClass").blur(function(){
    	if (isNaN($(this).val())) {
    		$("#text3").val("");
    		$(this).css("background-color","#FFCCCC")
    		return true;
    	}
    	$(this).css("background-color","#FFFFFF")
    	
    	if (isNaN($("#text1").val()) || isNaN($("#text2").val())) {
    		return true;
    	}
	    var result = parseInt($("#text1").val()) + parseInt($("#text2").val());
	    $("#text3").val(result);
      });
    
    $("input[name=radio-1]").click(function(){
    	alert($('input[name=radio-1]:checked').val());
    });

  });
  </script>
</head>
<body>
 
<p>Date: <input type="text" id="datepicker"></p>
 
 <div class="widget">
  <h1>Sample1</h1>
 
  <h2>Radio Group</h2>
  <fieldset>
    <legend>Select a Location: </legend>
    <label for="radio-1">New York</label>
    <input type="radio" name="radio-1" id="radio-1" value="New York">
    <label for="radio-2">Paris</label>
    <input type="radio" name="radio-1" id="radio-2" value="Paris">
    <label for="radio-3">London</label>
    <input type="radio" name="radio-1" id="radio-3" value="London">
  </fieldset>
  
   <h2>計算</h2>
  <fieldset>

    <input type="text" name="text1" id="text1" class="addClass">
    +
    <input type="text" name="text2" id="text2" class="addClass">
	=
    <input type="text" name="text3" id="text3" readonly>
  </fieldset>
 

</div>

    <div id="simple">
		<h2>Simple</h2>
		<p>
			See the <code>org.springframework.samples.mvc.simple</code> package for the @Controller code
		</p>
		<ul>
			<li>
				<a id="simpleLink" class="textLink" href="<c:url value="sample2" />">GET /sample2</a>
			</li>

		</ul>
	</div>
</body>
</html>