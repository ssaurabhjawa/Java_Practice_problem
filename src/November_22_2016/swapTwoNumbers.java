/**8. Program: How to swap two numbers without using temporary variable? 
Description: Write a program to swap or exchange two numbers. You should not use any temporary or third variable to swap.
*/
package November_22_2016;
	public class swapTwoNumbers {

		public static void main(String [] args)
		{
			int a=7;
			int b=2;
			int c= b-a;
			int d = b+a;
			a = (c+d)/2;
			b = d-a;
			System.out.println("a= "+a);
			System.out.println("b= "+b);
		}
}
