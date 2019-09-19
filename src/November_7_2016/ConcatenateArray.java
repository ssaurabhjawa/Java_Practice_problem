package November_7_2016;

import java.util.Scanner;

//Q8. Write a program to concatenate two character array data?
public class ConcatenateArray {

	public static void main(String [] args)
	{
	Scanner me = new Scanner(System.in);
	System.out.println("Enter a statement");
	 String a = me.nextLine();
	 System.out.println("Enter second statement");
	 String  b = me.nextLine();
	 String c = a.concat(b);
	 System.out.println(c);
	}
}
