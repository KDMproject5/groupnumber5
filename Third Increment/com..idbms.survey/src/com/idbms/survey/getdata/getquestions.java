package com.idbms.survey.getdata;

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

import com.idbms.survey.dbconnection.oracleramkiconn;
import com.idbms.survey.convertjson.Tojson;

import java.sql.ResultSet;
import java.sql.SQLException;


@Path("/questions")
public class getquestions {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public String search() throws Exception{
		
		PreparedStatement query = null;
		String returnString = null;
		Connection conn = null;

		try{
			conn = oracleramkiconn.oracleramkiconnect().getConnection();
			query = conn.prepareStatement("SELECT * from QUESTIONS");

			ResultSet rs = query.executeQuery();
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


