<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div data-role ="page" id ="home" >
        <header data-role ="header" data-theme="b">
        <h1>Welcome Page</h1>
             <a href="#home">home</a>
    </header>
    
    <div align ="right">
  <a href="Registration.jsp" data-role="button" data-mini="true" data-inline="true">Register</a>
    </div>
    <div data-role="fieldcontain">
    <label for="name">User Name</label>
    <input type="text" name="name" id="name" value=""  />
</div>	
  	
<div data-role="fieldcontain">
    <label for="password">Password </label>
    <input type="password" name="password" id="password" value="" />
</div>	

     <div align ="center">
    <input type="submit" value="Submit" data-inline="true" data-icon="check" action="login.jsp" method="post" />
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