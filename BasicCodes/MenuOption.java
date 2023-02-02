package BasicCodes;

import java.util.Scanner;
public class MenuOption 
{
	public static void main(String... g)
	{
		int choice;
		
		float radius,area,cir;

		String ch="";
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("\nMain Menu");
		System.out.println(" 1: Area \n 2: Circumference \n 3: Exit \n Enter your choice: ");
		
		choice = sc.nextInt();
		
		System.out.println("Enter radius: ");
		radius = sc.nextFloat();
		
		switch(choice)
		{
			case 1: 
					area = 3.14F * radius *radius;
					System.out.println("Area : "+area);
					break;
			case 2: 
				cir = 3.14F * 2 *radius;
				System.out.println("Circumference : "+cir);
				break;
				
			case 3:
					System.exit(0);
					
		}
		
		System.out.println("\nDo you want to continue : ");
		ch = sc.next();
		if(ch.equals("N")||ch.equals("n"))
		{
			System.exit(0);
		}
		
		} // while end
						
	}

}
