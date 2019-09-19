package November_12_2016;
import java.util.Scanner;
public class Array 
{
	public static void main(String[] args)
	{
		Scanner me = new Scanner(System.in);
		int rows=2;
		int cols=2;
		int x[][]= new int[rows][cols];
		
		System.out.println("Enter Array here");

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			x[i][j]= me.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			System.out.print(x[i][j]+"\t");
			}
		}
	}
}

