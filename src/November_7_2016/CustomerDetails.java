package November_7_2016;
import java.util.Scanner;

public class CustomerDetails 
	{
		
		double totalprice, percentage;
		
		void acceptCustomer()
		{	
			Scanner sc = new Scanner(System.in);
			String name;
			int totalProduct;
			float price;
			int quantity;
			
			
			System.out.println("Enter Customer Name");
			name =  sc.next();
			
			System.out.println("Enter number of product Purchased");
			totalProduct =  sc.nextInt();
			
			for(int i = 1; i<=totalProduct;i++)
			 {
				 System.out.println("Enter quantity for " + i+ " product purchased");
					quantity =  sc.nextInt();
				System.out.println("Enter price of " +i+" product for purchased");
					price =  sc.nextFloat();
					
				   totalprice = totalprice + quantity*price;
			 }
			System.out.println("The total price spent for purchasing is "+totalprice);
		}
		
		 public double calculation()
		 {
			 double percentage = (totalprice/10000)*100;
			return percentage;	
		  }
		 
		 public static void main(String[] args)
		 {
			 CustomerDetails cd = new CustomerDetails();
			 cd.acceptCustomer();
				System.out.println("The customer has spent " + cd.calculation() + "% of his salary");
		}
	}	
