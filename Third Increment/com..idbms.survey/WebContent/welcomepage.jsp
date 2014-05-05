<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
var $get = $('#get_example');
$('#submit').click(function(e) {
		e.preventDefault();
var userid = $('#uid').val();
var upwd =$('#upassword').val();
});

	});	

</script>
<title>Insert title here</title>
</head>
<body>
<div data-role ="page" id ="home" >
        <header data-role ="header" data-theme="b">
        <h1>Welcome Page</h1>
             <a href="#home">home</a>
    </header>
    
    <div align ="right">
  <a href="registration.jsp" data-role="button" data-mini="true" data-inline="true">Register</a>
    </div>
    <div data-role="fieldcontain">
    <label for="name">Userid </label>
    <input type="text" name="uid" id="uid" value=""  />
</div>	
  	
<div data-role="fieldcontain">
    <label for="password">Password </label>
    <input type="password" name="upassword" id="upassword" value="" />
</div>	

     <div align ="center">
    <a href="diseasesearch.jsp" data-role="button" data-mini="true" data-inline="true">Submit</a>
<a href="index.html" data-role="button" data-inline="true" data-theme ="b" data-icon="delete">Cancel</a>
</div>
    
  
 <footer data-role="footer" data-position ="fixed" data-theme="b">
        <nav data-role ="navbar">
            <ul>
                <li><a href ="#home" data-icon ="home">Home</a></li>
                <li><a href ="#images"data-icon="check">Logout</a></li>
                <li><a href ="#images"data-icon="check">Hospitals</a></li>
                </ul>
        </nav>
    </footer>
    </div>


</body>
</html>