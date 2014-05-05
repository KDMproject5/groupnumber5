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
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;

import java.lang.Exception;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;

import com.idbms.survey.dbconnection.oracleramkiconn;
import com.idbms.survey.dbconnection.schemaramkiconn;
import com.idbms.survey.convertjson.Tojson;


import java.sql.ResultSet;
import java.sql.SQLException;

@Path("/register")
public class UserRegister {
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response enterfields(String incomingdata) throws Exception{
		String returnString = null;
	
		JSONArray jsonArray = new JSONArray();
schemaramkiconn regist = new schemaramkiconn();
try{
	System.out.println("incomingdata:"+ incomingdata);
	ObjectMapper mapper = new ObjectMapper();
	register regentry = mapper.readValue(incomingdata, register.class);

	int HTTP_CODE = regist.registration(regentry.userid, regentry.fname, regentry.lname, regentry.email_id, regentry.security_question, regentry.security_answer, regentry.userpassword);
			if(HTTP_CODE == 200){
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
class register{
	public String userid;
	public String fname;
	public String lname;
	public String email_id;
	public String security_question;
	public String security_answer;
	public String userpassword;
}