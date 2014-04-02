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
<title>Insert title here</title>
</head>
<body>
<div data-role ="page" id ="home" >
        <header data-role ="header" data-theme="b">
        <h1>Search</h1>
             <a href="#home">home</a>
    </header>
     <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Search Page</label>
    <input type="text" name="name" id="name" value=""  />
</div>	
<a href="map.html" data-role="button">Map Showing Hospitals</a>
 <footer data-role="footer" data-position ="fixed" data-theme="b">
        <nav data-role ="navbar">
            <ul>
                <li><a href ="#home" data-icon ="home">Home</a></li>
                <li><a href ="#images"data-icon="check">Logout</a></li>
                <li><a href ="#hospital"data-icon="check">Hospitals</a></li>
                </ul>
        </nav>
    </footer>
    </div>

</body>
</html>