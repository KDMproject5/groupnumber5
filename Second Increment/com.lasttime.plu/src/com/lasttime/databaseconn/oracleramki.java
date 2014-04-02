package com.lasttime.databaseconn;

import javax.naming.*;
import javax.sql.*;
import java.sql.Connection;

public class oracleramki {

	private static DataSource oracleramki = null ;
	private static Context context = null;
	
	public static DataSource oracleramkiconn() throws Exception{
		
		if(oracleramki != null){
			return oracleramki;
		}
			
		try{
			if(context == null){
				context = new InitialContext();
			}
			oracleramki = (DataSource) context.lookup("ramkioracle");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return oracleramki;
	}
protected static Connection oracleramkiConnection() {
Connection conn = null;
try {
conn = oracleramkiconn().getConnection();
return conn;
}
catch (Exception e) {
e.printStackTrace();
}
return conn;
}
	
}
