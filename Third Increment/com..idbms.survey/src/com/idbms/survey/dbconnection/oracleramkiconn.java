package com.idbms.survey.dbconnection;

import javax.naming.*;

import javax.sql.*;
import java.sql.Connection;

public class oracleramkiconn {

	private static DataSource oracleramkiconn = null ;
	private static Context context = null;
	
	public static DataSource oracleramkiconnect() throws Exception{
		
		if(oracleramkiconn != null){
			return oracleramkiconn;
		}
			
		try{
			if(context == null){
				context = new InitialContext();
			}
			oracleramkiconn = (DataSource)context.lookup("ramakrishnaoracledb");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return oracleramkiconn;
	}
protected static Connection oracleramkiConnection() {
Connection conn = null;
try {
conn = oracleramkiconnect().getConnection();
return conn;
}
catch (Exception e) {
e.printStackTrace();
}
return conn;
}
	
}
