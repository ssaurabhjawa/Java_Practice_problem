package November_12_2016;
import java.io.*;
import java.io.BufferedWriter;
public class acceptBW {
	public static void main(String [] args)
	{
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 10 lines of statement");
			FileWriter fw = new FileWriter("/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			int count;
			String [] tenLines = new String[10];
			for(count=0;count<10;count++)
			{
				tenLines[count] = br.readLine();
				bw.write(tenLines[count]);
				bw.newLine();
			}
			
			bw.write(tenLines[3]+" is 3rd line");
			bw.newLine();
			bw.write(tenLines[4]+" is 4th line");
			
			System.out.println(tenLines[3]);
			System.out.println(tenLines[4]);
			
			bw.flush();
			bw.close();
			
		}
		catch(IOException ioex)
		{
			ioex.printStackTrace();
		}
	}
}	