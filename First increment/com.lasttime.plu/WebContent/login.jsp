<%@ page language="java" import="java.sql.*" errorPage="" %>
<%@page language="java" import="oracle.jdbc.driver.*"  errorPage=""%>

<%

    Connection conn = null;
    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ramakrishna","system", "meGA1234");
   
    ResultSet rs = null;
    Statement st=conn.createStatement();
   
    String suname=request.getParameter("name");
    String spass=request.getParameter("password");
    String message="User login successfully ";
   
    try{
    String qu="SELECT * FROM REGISTER where"
                    +" username=? and userPassword=password(?)";
   
   
   
    rs=st.executeQuery(qu);
   
    if(rs.next())
    {
      String u=rs.getString("username");
      String p=rs.getString("userpassword");
if(spass==p&&suname==u)
            response.sendRedirect("search.jsp);
    }
    else
    {
      message="No user or password matched" ;
      response.sendRedirect("login.jsp?error="+message);
    }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }   
   

%>