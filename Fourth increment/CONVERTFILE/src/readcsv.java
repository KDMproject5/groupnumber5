import java.io.*;
import java.lang.*;

public class readcsv {

	public static void main(String[] args) throws IOException,IndexOutOfBoundsException{
		
String result = " ";		
		
BufferedReader br =null ;
String line = "";
String csvsplitby =",";

try {
	FileInputStream fstream = new FileInputStream("csvfile.csv");
	br = new BufferedReader(new InputStreamReader(fstream));
File of = new File("doctors.json"); 
	FileWriter file = new FileWriter(of.getAbsoluteFile());
	file.write("[{");
	file.write("\"id\":\"PAC.ID\":\"Professional.Enrollment.ID\":\"Last.Name\":\"First.Name\":\"Middle.Name\":\"Suffix\":\"Gender\":\"Credential\":\"Medical.school.name\":\"Graduation.year\":\"Primary.specialty\":\"Secondary.specialty.1\":\"Secondary.specialty.2\":\"Secondary.specialty.3\":\"Secondary.specialty.4\":\"All.secondary.specialty.\":\"Organization.legal.name\":\"Group.Practice.PAC.ID\":\"Number.of.Group.Practice.members\":\"Line.1.Street.Address\":\"Line.2.Street.Address\":\"Marker.of.address.line.2.suppression\":\"City\":\"State\":\"Zip.Code\":\"Claims.based.hospital.affiliation.CCN.1\":\"Claims.based.hospital.affiliation.LBN.1\":\"Claims.based.hospital.affiliation.CCN.2\":\"Claims.based.hospital.affiliation.LBN.2\":\"Claims.based.hospital.affiliation.CCN.3\":\"Claims.based.hospital.affiliation.LBN.3\":\"Claims.based.hospital.affiliation.CCN.4\":\"Claims.based.hospital.affiliation.CCN.4\":\"Claims.based.hospital.affiliation.LBN.4\":\"Claims.based.hospital.affiliation.CCN.5\":\"Claims.based.hospital.affiliation.LBN.5\":\"Professional.accepts.Medicare.Assignment\":\"Participating.in.eRx\":\"Participating.in.PQRS\":\"Participating.in.EHR\"");
	int i=0;
	String[][] array=new String[i][];
	for(int p=0;p<=i;p++)
	{
		for(int q=0;q<=array[p].length;q++)
		{
			System.out.println("suresh");
			System.out.println(array[p][q]);
			
		}
	}
	while((line = br.readLine())!= null) {
System.out.println(line);
	array[i] = line.split(",");
	i++;
System.out.println(array);
	/*String id = array[0];
	String pacid = array[1];
	String peid = array[2];
	String ln = array[3];
	String fn = array[4];
	String mn = array[5];
	String suff = array[6];
	String gen = array[7];
	String cre  = array[8];
	String med = array[9];
	String grad = array[10];
	String prim = array[11];
	String sec1 = array[12];
	String sec2 = array[13];
	String sec3 = array[14];
	String sec4 = array[15];
	String allsec = array[16];
	String org = array[17];
	String group = array[18];
	String gpm = array[19];
	String line1 = array[20];
	String line2 = array[21];
	String marker = array[22];
	String city = array[23];
	String State = array[24];
	String zip = array[25];
	String clccn1 = array[26];
	String cllbn1 = array[27];
	String clccn2 = array[28];
	String cllbn2 = array[29];
	String clccn3 = array[30];
	String cllbn3 = array[31];
	String clccn4 = array[32];
	String cllbn4 = array[33];
	String clccn5 = array[34];
	String cllbn5 = array[35];
	String prof = array[36];
	String erx = array[37];
	String pqrs = array[38];
	String ehr = array[39];
*/	
 
	
	//file.write(",\"id\":"+"\""+array2[1]+"\"");
	
//file.write("}]");
//file.flush();
//file.close();
}	
	}catch(IOException|IndexOutOfBoundsException e){
e.printStackTrace();	
}
finally{
	
		try {
			if (br != null)
				br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	}
	
}
