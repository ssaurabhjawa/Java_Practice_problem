/**
 13. Program: Write a program How to check if a number is binary. 
Description: 
For this question, you need to write a function which will accept an integer and return true if it contains only 0 and 1 e.g.
if input is 123 then your function will return false, for 101 it should return true.
*/

package November_22_2016;
import java.util.Scanner;

public class checkIfBinary {
	public static void main(String [] args)
	{
		int i=0;
		Scanner me = new Scanner(System.in);
		System.out.println("Enter the number of arrays");
		int number = me.nextInt();
		int [] a = new int[number];
		System.out.println("Enter the number for array 'a'");		
		for(i =0;i<number;i++)
			{
				a[i] = me.nextInt();
			}
		for(i=0;i<number;i++)
			{
				int temp = a[i]%10;
				if(temp>1)
				{
					System.out.println( a[i]+ " is not binary");
				}
				else
				{
					System.out.println(a[i]+ " is binary");
				}
			}
		}
}