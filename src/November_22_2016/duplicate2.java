package November_22_2016;
import java.util.Scanner;

public class duplicate2 {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		int count = 0;

		System.out.println("enter elemts of array ");

		for (int i = 0; i < array.length; i++)
		{
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++)
		{
			for (int k = i + 1; k < array.length; k++)
			{
				if (array[i] == array[k])
				{
					count++;
				}
			}
				// System.out.println();
		}
			System.out.println(count);
	}
}



