package November_12_2016;
import java.util.Scanner;
public class squaredigits 
{
	public static void main(String[] args)
	{
	
		Scanner ne = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = ne.nextInt();
		int digit;
		int total=0;

		
		while(number!=0)
		{
			
			digit =number%10;
			 total = total + (digit*digit);
			number = number/10;
		}
		System.out.println(total);
		
	}
	
}
