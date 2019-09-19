/**
1.	Program: Find out duplicate number between 1 to N numbers. 
Description: You have got a range of numbers between 1 to N, where one of the number is repeated. You need to write a program to find out the duplicate number.
*/

package November_22_2016;
import java.util.Scanner;
public class duplicateNumber {

		public static void main(String [] args)
		{
			int count=0;
			int i,j = 0;
			Scanner me = new Scanner(System.in);
			System.out.println("Enter total numbers");
			int n=me.nextInt();
			int [] numbers = new int[n];
			System.out.println("Enter the number for the array");
			for(i=0;i<n;i++)
				{
					numbers[i] = me.nextInt();
				}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(numbers[i] == numbers[j])
					{
						count++;
					}
				}
				System.out.println(numbers[i]+" is repeated"+count+" times");
			}
		}
}
