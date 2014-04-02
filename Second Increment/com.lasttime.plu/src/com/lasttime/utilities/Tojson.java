package com.lasttime.utilities;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import java.sql.ResultSet;
import org.owasp.esapi.ESAPI;

public class Tojson {

	public JSONArray toJSONArray(ResultSet rs) throws Exception{
		
		JSONArray json = new JSONArray();
		String temp = null;
		try{
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			//looping through the values
					while(rs.next()){
						int numcolumns = rsmd.getColumnCount();
					
						JSONObject obj = new JSONObject();
				
					for(int i = 1; i<numcolumns+1;i++){
						String column_name = rsmd.getColumnName(i);
					
						if(rsmd.getColumnType(i) == java.sql.Types.ARRAY){
							obj.put(column_name,rs.getArray(column_name));
					System.out.println("TOJSON : ARRAY");	
						}
						else if(rsmd.getColumnType(i) == java.sql.Types.BIGINT){
							obj.put(column_name,rs.getInt(column_name));
						System.out.println("TOJSON : BIGINT");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.BOOLEAN){
							obj.put(column_name,rs.getBoolean(column_name));
						System.out.println("TOJSON : BOOLEAN");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.BLOB){
							obj.put(column_name,rs.getBlob(column_name));
						System.out.println("TOJSON : BLOB");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.DOUBLE){
							obj.put(column_name,rs.getDouble(column_name));
						System.out.println("TOJSON : DOUBLE");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.FLOAT){
							obj.put(column_name,rs.getFloat(column_name));
						System.out.println("TOJSON : FLOAT");

						    }
						
						else if(rsmd.getColumnType(i) == java.sql.Types.NVARCHAR){
							obj.put(column_name,rs.getNString(column_name));
							System.out.println("TOJSON : NVARCHAR");
						
							}
						else if(rsmd.getColumnType(i) == java.sql.Types.VARCHAR){
							
							temp = rs.getString(column_name);
							temp = ESAPI.encoder().canonicalize(temp);
							temp = ESAPI.encoder().encodeForHTML(temp);
							obj.put(column_name, temp);
							
							//obj.put(column_name,rs.getString(column_name));
						//System.out.println("TOJSON : varchar");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.TINYINT){
							obj.put(column_name,rs.getInt(column_name));
						System.out.println("TOJSON : TINYINT");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP){
							obj.put(column_name,rs.getTimestamp(column_name));
						System.out.println("TOJSON : TIMESTAMP");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.SMALLINT){
							obj.put(column_name,rs.getInt(column_name));
						System.out.println("TOJSON : SMALLINT");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.DATE){
							obj.put(column_name,rs.getDate(column_name));
						System.out.println("TOJSON : DATE");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.NUMERIC){
							obj.put(column_name,rs.getBigDecimal(column_name));
						System.out.println("TOJSON : NUMERIC");
						
							}	
						else if(rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP){
							obj.put(column_name,rs.getTimestamp(column_name));
						System.out.println("TOJSON : TIMESTAMP");
						
							}	
						else {
							obj.put(column_name,rs.getObject(column_name));
							System.out.println("TOJSON : OBJECT" + column_name);
						}		
						}
					json.put(obj);
					
					
					}
		} 
		catch(Exception e){
			e.printStackTrace();
		}
				
		return json;
		
	}
}
