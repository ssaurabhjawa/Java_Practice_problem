package November_12_2016;

import java.util.Scanner;

public class Pattern{
       public static void main(String []args)
       {
       	int pattern1;
       	Scanner s=new Scanner(System.in);
       	System.out.println(" Enter number 1 or 2  to print different types of pattern ");
       	pattern1=s.nextInt();
       	
       	switch(pattern1)
       	{
       	case 1:
       	for(int m=1;m<5;m++)
       	       	{
       				for(int n=5;n>m;n--)
       				{
       					System.out.print(" ");
       				}
       				for(int p=0;p<m;p++)
       				{
       					System.out.print("*");
       				}
       	       	
       			System.out.println();
       	       	}
       	   for(int a=1;a<5;a++)
       	     	{
       	       		for(int b=0;b<a;b++)
       	       		{
       	       			System.out.print(" ");
       	       		}
       	       		for(int c=5;c>a;c--)
       	       		{
       	       			System.out.print("*");
       	       		}
       	       	
       	       		System.out.println();
       	       	}
       	break;
       	case 2:
       	System.out.println();
       	       	
       	       	for(int i=0;i<5;i++)
       	       	{
       	       		for(int j=0;j<i;j++)
       	       		{
       	       			System.out.print("*");
       	       		}
       	       	  System.out.println();
       	       	}
       	     
       	       	
       	       	
       	       	for(int k=0;k<5;k++)
       	       	{
       	       		for(int l=4;l>k;l--)
       	       		{
       	       			System.out.print("*");
       	       		}
       	       	System.out.println();
       	       	}	
       	       	
       	default:
       	if(pattern1>3)
       	System.out.print("invalid");
       	}
      }
   }


     
 
       


