package com.lasttime.plu.search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.lang.Exception;
import org.codehaus.jettison.json.JSONArray;

import com.lasttime.databaseconn.oracleramki;
import com.lasttime.utilities.Tojson;
import java.sql.ResultSet;
import java.sql.SQLException;


@Path("Vi/inventory")
public class searchclass{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public String search() throws Exception{
	
		PreparedStatement query = null;
		String returnString = null;
		Connection conn = null;
		
		
		try{
			conn = oracleramki.oracleramkiconn().getConnection();
			query = conn.prepareStatement("SELECT * from USER_REGISTRATION");
		
			ResultSet rs =query.executeQuery();
			Tojson converter = new Tojson();
			JSONArray json = new JSONArray();
			
			json = converter.toJSONArray(rs);
			query.close();
			returnString = json.toString();
		
		}
		
		catch(Exception e){
			e.printStackTrace();
			}
		
		finally{
			if(conn != null) 
				conn.close();
		}
		return returnString;
		
	}
	}
