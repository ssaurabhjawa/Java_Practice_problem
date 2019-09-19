package November_7_2016;

import java.util.Scanner;
public class ScoreCard {
	/*
	  Question. Write a program to accept student name and marks of 5 subject, calculate the percentage and display how the GRADE for the Student.

	1. Between 100 to 84 Grade = A+;
	2. Between 84 to 75 , Grade = A
	3. Between 74 to 65 , Grade = B
	4. Between 65 to 50 , Grade = C
	5. Below 50 Grade = Fail
	Display Name along with grade of student
	 */
		String name ="";
		float phys,math,bio,comp,chem;
		
		public void acceptDetails()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the name of the Student");
			name = s.next();
			System.out.println("Enter the marks of Physics out of 100");
			phys = s.nextInt();
			System.out.println("Enter the marks of Math out of 100");
			math = s.nextInt();
			System.out.println("Enter the marks of Computer Science out of 100");
			comp = s.nextInt();
			System.out.println("Enter the marks of Biology out of 100");
			bio = s.nextInt();
			System.out.println("Enter the marks of Chemistry out of 100");
			chem = s.nextInt();
		}
		public void calculation()
		{
			float percentage = ((phys+math+comp+bio+chem)*100)/500;
			System.out.println(name+" your total percentage is "+percentage);
			if(percentage >84 && percentage <100)
			{
				System.out.println("A");
			}
			else if(percentage >75 && percentage <84)
			{
				System.out.println("B");
			}
			else if(percentage >65 && percentage <74)
			{
				System.out.println("C");
			}
			else if(percentage >50 && percentage <65)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("Fail");
			}
		}
				
		public static void main(String[] args)
		{
			ScoreCard report = new ScoreCard();
			report.acceptDetails();
			report.calculation();
		}
	}
