package November_12_2016;

public class CopyCharToStr {

	public static void main(String[] args)
	{
		String str;
		char[] mychar = { 'T','h','i','s',' ','i','s',' ','j','a','v','a',' ','E','x','a','m','p','l','e'};
	
		
		str = new String(mychar);
		System.out.println(str);
		
		str = String.copyValueOf(mychar); //this is overloaded function
		System.out.println(str);
		str = String.copyValueOf(mychar,3,8);
		System.out.println(str);
	}
		
	
	
}
