import java.sql.*;
import com.oracle.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class validate extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
	res.setContentType("text/html");
	PrintWriter o=res.getWriter();
	try{
		String na=req.getParameter("un");
		String pa=req.getParameter("ps");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","meGA1234");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select username,userpassword from REGISTER where username='"+na+"' ");
		if(rs.next())
		{
			String x=rs.getString(1);
			String y=rs.getString(2);
			if((na.trim().equals(x.trim())) &&(pa.trim().equals(y.trim())) )
			{
				HttpSession ses=req.getSession(true);
				ses.setAttribute("user", na);
				RequestDispatcher v=req.getRequestDispatcher("search.jsp");
				v.forward(req, res);
			}
			else
			{
				o.println("invalid credentials");
				RequestDispatcher v=req.getRequestDispatcher("leg.html");
				v.include(req, res);
			}
		}
		else
		{
			o.println("invalid credentials");
			RequestDispatcher v=req.getRequestDispatcher("leg.html");
			v.include(req, res);
		}
				
		}
	catch(Exception e)
	{
		o.println(e);
	}
	finally{
		o.close();
	
	}
}
}

