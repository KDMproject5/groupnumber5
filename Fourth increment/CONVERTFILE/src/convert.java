import java.io.*;
import java.util.Scanner;

import javax.swing.*;
public class convert {
	
	
	public void solve(String input) throws Exception{
		
		FileInputStream fstream = new FileInputStream("inout.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		File of = new File("output51.txt");
		FileWriter fw = new FileWriter(of.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		int i=0,j;
		String s;
		s=br.readLine();
		String str[]=s.split(", ");
		int n=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		System.out.println(n);
		System.out.println(m);
		int[][] a=new int[n][m];
		
		int x,y,z;
		while((s=br.readLine())!=null)		
		{
		  	System.out.println(s);
			str=s.split(", ");
			x=Integer.parseInt(str[0]);
			y=Integer.parseInt(str[1]);
		  	z=Integer.parseInt(str[2]);
		  	System.out.println("x="+x+"y="+y+"z="+z);
		  	a[x-1][y-1]=z;
		  	System.out.println(a[x-1][y-1]);
		  	if(x==n&&y==m)
		  		break;
		}
		br.close();
		for(i=0;i<n;i++)
		{
			bw.write("{");
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+"\t");
				bw.write(a[i][j]+",");
			}
			System.out.println();
			bw.write("}");
			bw.write(",\n");
		}
		bw.close();
	}

}
