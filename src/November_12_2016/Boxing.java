package November_12_2016;

public class Boxing {
	
	public static void main(String[] args)
	{
		//boxing
		int i = 5;
		Integer y = new Integer(i);
		System.out.println(y);
		
		//unboxing
		int z =y.intValue();
		System.out.println(z);

		//AutoUnboxing
		int r=y;
		System.out.println(r);

		//AutoBoxing
		Integer s = i;
		System.out.println(s);
	}
}
