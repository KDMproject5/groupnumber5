package com.idbms.survey.check;

import javax.ws.rs.*;

import javax.ws.rs.core.*;

import com.idbms.survey.dbconnection.*;

import java.sql.*;




@Path("/Vi/status")
public class statuscheck {

	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public String returntitle(){
		return "<p>java returns</p>";
	}
	
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public String returnVersion(){
		return"<p>Version</p>";
	}
	
	@Path("/database")
	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public String returnDatabaseStatus() throws Exception{
	
		PreparedStatement query = null;
		String mystring = null;
		String returnstring = null;
		Connection conn = null;
		try{
			conn = oracleramkiconn.oracleramkiconnect().getConnection();
			query = conn.prepareStatement("select to_char(sysdate,'YYYY-MM-DD HH24:MI:SS') DATETIME from sys.dual");
			ResultSet rs = query.executeQuery();
		
		while (rs.next()){
			mystring = rs.getString("DATETIME");
		}
		query.close();
		
		returnstring  ="<p>Database status</p>" + "<p>datetime</p>" + mystring + "<p> </p>";
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			
			if(conn != null) conn.close();
		}
		return returnstring;
	}

		}
