//Q8. Write a program to accept the Customer Details from Key Board and Write it to File?
package November_12_2016;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.*;
public class customerKeyFile {
	
	public static void main(String[] args) throws Exception
		//throws is used for exception, file inputstream tends to have errors
	{
		String CustId;
		String CustName;
		int CustAge;
		float Custbal;
		float CustSal;
		
		try
		{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		FileOutputStream fout = new FileOutputStream("/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails1.doc");
		
		System.out.println("Enter Customer ID");
		CustId = br.readLine();
		byte b[] = CustId.getBytes();
		fout.write(b);
		
		System.out.println("Enter Customer Name");
		CustName = br.readLine();
		fout.write(CustName.getBytes());
		
		System.out.println("Enter Customer Age");
		CustAge = Integer.parseInt(br.readLine());
		fout.write(CustAge);
		
		System.out.println("Enter Customer Salary");
		CustSal = Float.parseFloat(br.readLine());
		int sal = (int)CustSal;
		fout.write(sal);
		
		
		
		System.out.println("Id Is "+CustId);
		System.out.println("Id Is "+CustName);
		System.out.println("Id Is "+CustAge);
		System.out.println("Id Is "+CustSal);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
	}
}

