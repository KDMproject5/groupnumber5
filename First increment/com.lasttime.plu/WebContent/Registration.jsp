<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
<style>
#select-choice-1{
     white-space:normal !important
}   
 </style>
 <script type ="text/javascript">
 (function($) {
		$.fn.serializeObject = function()
		{
			var o = {};
			var a = this.serializeArray();
			$.each(a, function() {
				if (o[this.name] !== undefined) {
					if (!o[this.name].push) {
						o[this.name] = [o[this.name]];
					}
					o[this.name].push(this.value || '');
				} else {
					o[this.name] = this.value || '';
				}
			});
			return o;
		};
	})(jQuery);
 </script>
<script type="text/javascript">
$(document).ready(function() {
	var $post = $('#post_example');
	$('#submit').click(function(e) {
		e.preventDefault();
		
		var javascriptobj = $post.serializeObject(), ajaxObj = {};
		ajaxObj = {
				type: "POST",
				url: "http://localhost:7001/com.lasttime.plu/api/V2/inventory/",
				data: JSON.stringify(javascriptobj),
				contentType:"application/json",
				error: function(jqXHR, textStatus, errorThrown) {
				console.log("Error " + jqXHR.getAllResponseHeaders() + " " + errorThrown);
				},
				success: function(data) {
					//console.log(data);
					if(data[0].HTTP_CODE == 200) {
					$('#div_ajaxResponse').text( data[0].MSG );
					}
					},
					complete: function(XMLHttpRequest) {
						//console.log( XMLHttpRequest.getAllResponseHeaders() );
						},
						dataType: "json" //request JSON
						};

						$.ajax(ajaxObj);
						});

});
	
</script>
</head>
<body>
<div id="div_ajaxResponse"></div>
<form id="post_example" name="post_example" action="registration.jsp" method ="post">
<div data-role ="page" id ="home"  data-inline="true" >
        <header data-role ="header" data-theme="b">
        <h1>User Registration</h1>
             <a href="#home">home</a>
    </header>

    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Name</label>
    <input type="text" name ="fname" id="username" value=""  />
</div>

    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">User Name</label>
    <input type="text" name ="username" id="name" value=""  />
</div>	

    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Email id </label>
    <input type="text" name ="email_id" id="email_id" value=""  />
</div>

<div data-role="fieldcontain" data-inline="true" >
    <label for="password">Password </label>
    <input type="password"  name ="userpassword" id="password" value="" />
</div>	

<div data-role="fieldcontain" data-inline="true" >
    <label for="password">Confirm Password </label>
    <input type="password" name ="confirm_password" id="confpassword" value="" />
</div>	

	
<div data-role="fieldcontain" data-inline="true" >
    <label for="name">Security Answer</label>
    <input type="text" name ="security_answer" id="secans" value=""  />
</div>

<div align ="center">
<input type="submit" value="Submit" data-inline="true" data-icon="check" id ="submit" />
<a href="index.html" data-role="button" data-inline="true" data-theme ="b" data-icon="delete">Cancel</a>
</div>
</div>
</form>
</body>

</html>