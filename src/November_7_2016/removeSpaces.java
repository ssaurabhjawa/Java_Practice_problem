package November_7_2016;
//Q5. Write a program to remove multiple spaces from string variable "This —— is —— JAVA"
import java.util.StringTokenizer;
public class removeSpaces
{
	public static void main(String[] args)
	{
	String str = "This     is    Java";
	//System.out.println(str);
	StringTokenizer st = new StringTokenizer(str," "); 
	 //System.out.println(st.nextToken()); 
	StringBuffer sb = new StringBuffer(str);
		while (st.hasMoreElements())
		{
			sb.append(st.nextElement());
	    }
		System.out.println(sb);
	}
}





