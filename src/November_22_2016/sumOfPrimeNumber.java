/**. 8A Program: Write a program to find the sum of the first 1000 prime numbers. 
Description: Write a program to find the sum of the first 1000 prime numbers.
*/


package November_22_2016;
public class sumOfPrimeNumber {

	public static boolean isP(int primeNumber)
	{
		boolean tf= false;
		for(int j=2;j<primeNumber;j++)
		{
			if(primeNumber%j==0)
			{
				tf= false;
			}
			
			
		}
		return tf;
	}		
	
	public static void main(String [] args)
	{
		 int sum =0,prime=2;
		
		
			for( prime=2; prime<=1000;prime++)
			{
					if(isP(prime) == false)
						{
							sum = sum +prime;
						}
			}
			System.out.println(sum);

	}
}


