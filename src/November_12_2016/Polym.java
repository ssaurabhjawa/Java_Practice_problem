package November_12_2016;

public class Polym 
{
	void add(int x,
			int y,int z)
	{
		int a = x+y+z;
		System.out.println(a);
	}
	void add(double d, double e)
	{
		double b = d+e;
		System.out.println(b);
	}

	public static void main (String[] args)
	{
		Polym c = new Polym();
		c.add(5,4,3);
		c.add(4.5,3.4);
	}
}
