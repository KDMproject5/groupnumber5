
import java.io.*;


public class readfile {

	public static void main(String[] args){
BufferedReader br = null;	
String line = "";



try {
	FileInputStream fstream = new FileInputStream("csvfile.csv");
	br = new BufferedReader(new InputStreamReader(fstream));
	File of = new File("output.json");
	FileWriter fw = new FileWriter(of.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
System.out.println("[");
bw.write("[");
while ((line = br.readLine())!= null){
		String[] doctor = line.split(",");
 //bw.write("{\"id\" : "+" \"" + doctor[0] +"\""+"," + "\"last_name_s\" : "+" \"" + doctor[3] +"\""+","+ "\"first_name_s\" : "+" \"" + doctor[4] +"\""+","+ "\"middle_name_s\" : "+" \"" + doctor[5] +"\""+","+ "\"suffix_s\" : "+" \"" + doctor[6] +"\""+","+ "\"gender_s\" : "+" \"" + doctor[7] +"\""+","+ "\"credential_s\" : "+" \"" + doctor[8] +"\""+","+ "\"med_School_s\" : "+" \"" + doctor[9] +"\""+","+ "\"grad_year_s\" : "+" \"" + doctor[10] +"\""+","+ "\"prim_spec_s\" : "+" \"" + doctor[11] +"\""+","+ "\"org_s\" : "+" \"" + doctor[17]  +"\""+","+ "\"line1_address_s\" : "+" \"" + doctor[20] +"\""+","+ "\"line2_address_s\" : "+" \"" + doctor[21] +"\""+","+ "\"marker_s\" : "+" \"" + doctor[22] +"\""+","+ "\"doc_City_s\" : "+" \"" + doctor[23] +"\""+","+ "\"doc_State_s\" : "+" \"" + doctor[24] +"\""+","+ "\"zip_s\" : "+" \"" + doctor[25] +"\""+","+ "\"med_assign_s\" : "+" \"" + doctor[36] +"\""+","+ "\"erx_s\" : "+" \"" + doctor[37] +"\""+","+ "\"pqrs_s\" : "+" \"" + doctor[38] +"\""+","+ "\"ehr_s\" : "+" \"" + doctor[39] +"\""+ "},");  
 


 //System.out.println("{\"name\" : "+" \"" + doctor[17] +"\""+"," +"}");
 //filtering data
 if(doctor[17].contains("\"")){
	 doctor[17]=doctor[17].replace("\"", "");
	 
 }else if (doctor[3].contains("\"")){
	 doctor[3] = doctor[3].replace("\"", "");
 }else if (doctor[4].contains("\"")){
	 doctor[4] = doctor[4].replace("\"", "");
 }else if (doctor[5].contains("\"")){
	 doctor[5] = doctor[5].replace("\"", "");
 }else if (doctor[6].contains("\"")){
	 doctor[6] = doctor[6].replace("\"", "");
 }else if (doctor[7].contains("\"")){
	 doctor[7] = doctor[7].replace("\"", "");
 }else if (doctor[8].contains("\"")){
	 doctor[8] = doctor[8].replace("\"", "");
 }else if (doctor[9].contains("\"")){
	 doctor[9] = doctor[9].replace("\"", "");
 }else if (doctor[10].contains("\"")){
	 doctor[10] = doctor[10].replace("\"", "");
 }else if (doctor[11].contains("\"")){
	 doctor[11] = doctor[11].replace("\"", "");
 }else if (doctor[20].contains("\"")){
	 doctor[20] = doctor[20].replace("\"", "");
 }else if (doctor[21].contains("\"")){
	 doctor[21] = doctor[21].replace("\"", "");
 }else if (doctor[22].contains("\"")){
	 doctor[22] = doctor[22].replace("\"", "");
 }else if (doctor[23].contains("\"")){
	 doctor[23] = doctor[23].replace("\"", "");
 }else if (doctor[24].contains("\"")){
	 doctor[24] = doctor[24].replace("\"", "");
 }else if (doctor[25].contains("\"")){
	 doctor[25] = doctor[25].replace("\"", "");
 }else if (doctor[36].contains("\"")){
	 doctor[36] = doctor[36].replace("\"", "");
 }else if (doctor[37].contains("\"")){
	 doctor[37] = doctor[37].replace("\"", "");
 }else if (doctor[37].contains("\"")){
	 doctor[38] = doctor[38].replace("\"", "");
 }else if(doctor[39].contains("\"")){
	 doctor[39] = doctor[39].replace("\"", "");
 }
 else {
	 System.out.println(" ");
 }
 bw.write("{\"id\" : "+" \"" + doctor[0] +"\""+"," + "\"last_name_s\" : "+" \"" + doctor[3] +"\""+","+ "\"first_name_s\" : "+" \"" + doctor[4] +"\""+","+ "\"middle_name_s\" : "+" \"" + doctor[5] +"\""+","+ "\"suffix_s\" : "+" \"" + doctor[6] +"\""+","+ "\"gender_s\" : "+" \"" + doctor[7] +"\""+","+ "\"credential_s\" : "+" \"" + doctor[8] +"\""+","+ "\"med_School_s\" : "+" \"" + doctor[9] +"\""+","+ "\"grad_year_s\" : "+" \"" + doctor[10] +"\""+","+ "\"prim_spec_s\" : "+" \"" + doctor[11] +"\""+","+ "\"org_s\" : "+" \"" + doctor[17]  +"\""+","+ "\"line1_address_s\" : "+" \"" + doctor[20] +"\""+","+ "\"line2_address_s\" : "+" \"" + doctor[21] +"\""+","+ "\"marker_s\" : "+" \"" + doctor[22] +"\""+","+ "\"doc_City_s\" : "+" \"" + doctor[23] +"\""+","+ "\"doc_State_s\" : "+" \"" + doctor[24] +"\""+","+ "\"zip_s\" : "+" \"" + doctor[25] +"\""+ "},");  
 System.out.println(doctor[17]);
	}
bw.write("]");
System.out.println("]");
}catch(IOException e){
e.printStackTrace();
}finally{
	if(br!=null){
		try{
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

}
}