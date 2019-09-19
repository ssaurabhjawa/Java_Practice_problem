/*Q. Write a program to accept customer name and customer rating for Android One mobile Phone, 
	Display the average rating for the product.
*/

package November_7_2016;

	import java.util.Scanner;
	public class Average_rating 
	{
		int number;
		float rating;
		String name;
		double sumOfRating;
		
		public void acceptDetails()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of customer");
		number=sc.nextInt();
			for(int i=0; i< number; i++)
			{
				System.out.println("Enter the name of "+ i + " Customer and rating out of 5" );
				name = sc.next();
				rating = sc.nextFloat();
				sumOfRating = sumOfRating +  rating;
			}
		 }	
			void displayAverageRating()
			{
				double avg = sumOfRating/number;
				System.out.println("The average rating for phone is "+avg);
			}
	
	    public static void main(String []aa)
	    {
	    	Average_rating a1= new Average_rating();
	    	a1.acceptDetails();
	    	a1.displayAverageRating();
	    }
	}
	
