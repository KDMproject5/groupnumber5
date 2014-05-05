package com.idbms.survey.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

import org.codehaus.jettison.json.JSONArray;

import com.idbms.survey.convertjson.*;

public class schemaramkiconn extends oracleramkiconn{

public int registration(String userid, String fname, String lname, String email_id, String security_question, String security_answer, String userpassword) throws Exception{
	PreparedStatement query = null;
	Connection conn = null;
	try{	
	conn = oracleramkiConnection();
		query = conn.prepareStatement("insert into usertable(userid,fname,lname,email_id,security_question,security_answer,userpassword) values (?,?,?,?,?,?,?)"); 	
		query.setString(1 , userid);
		query.setString(2, fname);
		query.setString(3, lname);
		query.setString(4, email_id);
		query.setString(5, security_question);
		query.setString(6, security_answer);
		query.setString(7, userpassword );
		
		query.executeUpdate();
		} 

	catch(Exception e) {
e.printStackTrace();
return 500; //if a error occurs, return a 500
}
finally {
if (conn != null) conn.close();
}

return 200;
}


}

