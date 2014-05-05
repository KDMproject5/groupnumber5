import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.*;

public class MongoDB {

    public static void main(String[] args)throws Exception {
        
        MongoClient mc = new MongoClient( "localhost" , 27017 );
        DB db = mc.getDB( "ramki" );
        Set<String> colls = db.getCollectionNames();

        for (String s : colls) {
            System.out.println(s);
            }
        DBCollection col = db.getCollection("ramki123");
        DBCollection col1 = db.getCollection("ramki1234");
        DBCollection col3 = db.getCollection("ramki12345");
        mc.setWriteConcern(WriteConcern.JOURNALED);
        //BasicDBObject q=new BasicDBObject("Hispital_Name_s",r);
        DBCursor c1=col.find();
        DBCursor c2;
        DBCursor c3;
        while(c1.hasNext())
        {
            DBObject g=c1.next();
            String r=(String) g.get("Hospital");
            System.out.println("Hispitalname="+r);
            int r2= (int)g.get("Cluster");
            System.out.println("cluster="+r2);
            BasicDBObject ob=new BasicDBObject("Hospital_Name_s",r);
            c2=col1.find(ob);
            int count=c2.count();
            System.out.println(count);
            
            if(count==0)
                continue;
            else
            {
             DBObject g2=c2.next();
            int s1=(int) g2.get("Id");
            String s2=(String) g2.get("Address_1_s");
            String s3=(String) g2.get("Address_2_s");
            String s4=(String) g2.get("Address_3_s");
            String s5=(String) g2.get("City_s");
            String s6=(String) g2.get("State_s");
            int s7=(int) g2.get("ZIP_Code_s");
            String s8=(String) g2.get("County_s");
            long s9=(long) g2.get("Phone_Number_s");
            String s10=(String) g2.get("Hospital_Type_s");
            String s11=(String) g2.get("Hospital_Ownership_s");
            String s12=(String) g2.get("Emergency_Services_s");
            
            BasicDBObject in=new BasicDBObject("id",s1).append("Cluster", r2).append("Hospital_Name_s", r).append("Address_1_s", s2).append("Address_2_s", s3).append("Address_3_s", s4).append("City_s", s5).append("State_s", s6).append("ZIP_Code_s", s7).append("County_s", s8).append("Phone_Number_s", s9).append("Hospital_Type_s", s10).append("Hospital_Ownership_s", s11).append("Emergency_Services_s", s12);
            col3.insert(in);
            }
           }
        System.out.println("Ramki");
        }
}
