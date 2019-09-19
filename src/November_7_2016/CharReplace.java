
package November_7_2016;
//Write a program to replace specific characters from given string?
import java.util.Scanner;
import java.util.ArrayList;
public class CharReplace 
{
	public static void main(String [] args)
	{
	Scanner me = new Scanner(System.in);
	System.out.println("Enter a statement");
	 String crazy = me.nextLine();
	 System.out.println("Enter character to replace");
	 char  a = me.next().charAt(0);
	 System.out.println("Enter character to replace with");
	 char  b = me.next().charAt(0);
	 String c = crazy.replace(a, b);
	 System.out.println(c);
	}
	
}
