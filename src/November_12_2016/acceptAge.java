//Write a program to accept Age from user, if age> 18 then,
//display message that user is eligible for voting but in other 
//case program must throw the exception regarding invalid age entry? 
package November_12_2016;
import java.io.*;
public class acceptAge 
{
	public static void main(String [] args) throws Exception
	{
			int age;
			try{
					InputStreamReader is = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(is);
			    	System.out.println("Enter user age: ");
			    	age = Integer.parseInt(br.readLine());
			    	if(age>18)
			    	{
				    	System.out.println("The user is eligible for voting");
			    	}
			    }
			catch(Exception e)
				{
					System.out.println("Age has to be above 18");
				}
		}
	
}

