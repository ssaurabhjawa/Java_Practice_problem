package November_7_2016;
import java.util.Scanner;
//Given an array of numbers. please find largest and smallest value in given a array;
public class MaxMinArray 
{
	public static void main(String [] args)
	{
	Scanner me = new Scanner(System.in);
	System.out.println("Enter the number of rows: ");
	int rows = me.nextInt();
	System.out.println("Enter the number of columns: ");
	int columns = me.nextInt();
	int[][] a = new int[rows][columns];
	int[][] b = new int[rows][columns];
	int max=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Enter values for array");
				a[i][j] = me.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(max<a[i][j])
				{
					max = a[i][j];
				}
			}
		}
		System.out.println("Max number is "+ max);
	}
}

