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
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;

import java.lang.Exception;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;

import com.lasttime.databaseconn.oracleramki;
import com.lasttime.utilities.Tojson;
import com.lasttime.databaseconn.schemaramki;

import java.sql.ResultSet;
import java.sql.SQLException;

@Path("/V2/inventory")
public class registration {
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response enterfields(String incomingdata) throws Exception{
		String returnString = null;
	JSONArray jsonArray = new JSONArray();
		schemaramki reg = new schemaramki();
	try{
		System.out.println("incomingdata:"+ incomingdata);
		ObjectMapper mapper = new ObjectMapper();
		registerentry regentry = mapper.readValue(incomingdata, registerentry.class);
		
		int http_code = reg.registrationinsert(regentry.fname, regentry.username, regentry.email_id, regentry.userpassword, regentry.confirm_password,regentry.security_answer);
	if(http_code == 200){
	returnString = jsonArray.toString();	
	}
	else{
		return Response.status(500).entity("unable to process").build();
	}
	}
	catch(Exception e){
		e.printStackTrace();
		return Response.status(500).entity("Server unable to process").build();
	}
	return Response.ok(returnString).build();
	}
	

}

class registerentry{
	public String fname;
	public String username;
	public String email_id;
	public String userpassword;
	public String confirm_password;
	public String security_answer;
	
}