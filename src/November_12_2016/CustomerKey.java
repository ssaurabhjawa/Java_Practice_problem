package November_12_2016;
import java.io.*;
import java.io.BufferedWriter;


//Q8. Write a program to accept the Customer Details from Key Board and Write it to File?

	public class CustomerKey{
		
		public static void main(String[] args) throws Exception
			//throws is used for exception, file inputstream tends to have errors
		{
			int CustAge;
			String CustName="";
			
			try
			{
				//String qw = "/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails.txt";
				
				InputStreamReader is = new InputStreamReader(System.in);


				//FileReader is = new FileReader("/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails1.txt");
				BufferedReader br = new BufferedReader(is);
				FileWriter fw = new FileWriter("/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails1.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				System.out.println("Enter Customer Name");
				CustName = br.readLine();
				bw.write(CustName);
				bw.newLine();
				
				System.out.println("Enter Customer Age");
				CustAge = Integer.parseInt(br.readLine());
				//bw.write(CustAge);
				bw.write(String.valueOf(CustAge));
	
				
				System.out.println("My name is "+CustName);
				System.out.println("My name is "+CustAge);
				bw.flush();
				bw.close();
		
			}
			catch(IOException ex)
			{
				System.out.println("Error writing to file");
			}
			 
		}
	}

	
	