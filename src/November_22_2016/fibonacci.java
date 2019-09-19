//6. Java Program for Fibonacci series without using recursive function concept.
/**Algorithm to generate fibonacci series
**First two terms of fibonacci series is 0 and 1.
**we will store the last two terms of fibonacci series in "last" and "secondLast" integer variable.
**Current term of fibonacci series is equal to the sum of "last" and "secondLast" term.(current = last + secondLast)
**Update last and secondLast variable as secondLast = last; and last = current;
*/


package November_22_2016;
import java.util.Scanner;
public class fibonacci {

	public static void main(String [] args)
	{
		int last = 0, secondLast =1,current,i;
		Scanner me = new Scanner(System.in);
		System.out.println("Enter the number of terms in fibonacci series?");
		int terms = me.nextInt();
		
		for(i=0;i<terms;i++)
		{
			if(i<2)
			{
				current = i;
			} else {
				current = last + secondLast;
				last = secondLast;
				secondLast = current;
			}
			System.out.println(current + " ");
		}		
				
	 }
}