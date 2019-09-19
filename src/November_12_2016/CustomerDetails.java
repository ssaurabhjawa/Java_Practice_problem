//Q1. Accept customer details and display it. Do not  use your scanner class and use the concept of Exception handling?

package November_12_2016;
import java.io.*;
public class CustomerDetails {
	public static void main(String[] aa)
	{
		byte CustId;
		String CustName;
		int CustAge;
		float Custbal;
		float CustSal;
		char grade;
		try
		{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter Customer Id");
		CustId = Byte.valueOf(br.readLine()); // this kind of program needs exception // 
	
		System.out.println("Enter Customer Name");
		CustName = br.readLine(); 
	
		System.out.println("Enter Customer Age");
		CustAge = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Customer Salary");
		CustSal = Float.parseFloat(br.readLine());
		
		System.out.println("Enter Customer Grade");
		grade = (char)(br.read());
		
		System.out.println("Id Is "+CustId);
		System.out.println("Id Is "+CustName);
		System.out.println("Id Is "+CustAge);
		System.out.println("Id Is "+CustSal);
		System.out.println("Id Is "+grade);
		
		FileOutputStream fobj = new FileOutputStream("/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails1.doc");
		fobj.write(CustId);
		fobj.write(CustName.getBytes());
		fobj.write(CustAge);
		//fobj.write(Integer.parseInt(CustSal));
		fobj.write(grade);
			
	}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
