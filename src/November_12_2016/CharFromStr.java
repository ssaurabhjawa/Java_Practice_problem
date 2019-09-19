package November_12_2016;

public class CharFromStr 
{
	public static void main(String[] args)
	{
	String str = "This is JAVA Example";
	char ch = str.charAt(6);
	System.out.println(ch);
	
	char[] mystr = new char[5];
	str.getChars(5, 10, mystr, 0);
	System.out.println(mystr);
	}
}
