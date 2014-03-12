package com.lasttime.databaseconn;

import java.sql.*;
import org.codehaus.jettison.json.JSONArray;
import com.lasttime.utilities.Tojson;

public class schemaramki extends oracleramki{
	
	public int registrationinsert(String fname,String username,String email_id,String userpassword,String confirm_password,String security_question, String security_answer) throws Exception{
	
		PreparedStatement query = null;
Connection conn = null;
try{	
conn = oracleramkiConnection();
	query = conn.prepareStatement("insert into fname,username,email_id,userpassword, confirm_password,security_question,security_question VALUES ( ?, ?, ?, ?, ? ) "); 

	query.setString(1, fname);
	query.setString(2, username);
	query.setString(3, email_id);
	query.setString(4, userpassword);
	query.setString(5, confirm_password);
	query.setString(6, security_question);
	query.setString(7, security_answer);
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
