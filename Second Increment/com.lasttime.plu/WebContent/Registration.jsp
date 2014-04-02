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

</head>
<body>
<div data-role ="page" id ="home"  data-inline="true" >
        <header data-role ="header" data-theme="b">
        <h1>User Registration</h1>
             <a href="#home">home</a>
    </header>
    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Name</label>
    <input type="text" name="name" id="name" value=""  />
</div>	
    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">User Name</label>
    <input type="text" name="name" id="name" value=""  />
</div>	
    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Email id </label>
    <input type="text" name="name" id="name" value=""  />
</div>
<div data-role="fieldcontain" data-inline="true" >
    <label for="password">Password </label>
    <input type="password" name="password" id="password" value="" />
</div>	
<div data-role="fieldcontain" data-inline="true" >
    <label for="password">Confirm Password </label>
    <input type="password" name="password" id="password" value="" />
</div>	
	<div data-role="fieldcontain" data-inline="true" >
   <label for="select-choice-1" class="select" data-inline ="true">Security Question</label>
   <select name="select-choice-1" id="select-choice-1" >
   <option value="birth">What is your place of birth</option>
   <option value="holiday">What is your favourite holiday spot ?</option>
   <option value="idol">Who is your idol</option>
   <option value="Friend">Who is your child hood's best friend ?</option>
   <option value="Hero">Who is your child hood's hero?</option>
</select>
</div>
<div data-role="fieldcontain" data-inline="true" >
    <label for="name">Security Answer</label>
    <input type="text" name="name" id="name" value=""  />
</div>
<div align ="center">
<input type="submit" value="Submit" data-inline="true" data-icon="check"/>
<a href="index.html" data-role="button" data-inline="true" data-theme ="b" data-icon="delete">Cancel</a>
</div>

</body>
</html>