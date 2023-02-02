package BasicCodes;

import java.util.Scanner;


public class TernaryOperator 
{
	public static void main(String args[]) 
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// (condition) ? true statement : false statement
		
		System.out.println((a > b && a > c)? "A is greater" :(b>a && b>c)? "B is greater":"C is greater");
		
			
	}

}
