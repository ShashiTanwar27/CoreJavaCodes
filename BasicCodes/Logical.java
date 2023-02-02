package BasicCodes;
/* Slab
 *  >=90  A+
 *  >=80 A
 *  >=70 B
 *  >=60 C
 *  >=50 D
 *  rest F
 *  
 * */

public class Logical 
{
	public static void main(String... g)
	{
		int marks[] = {78,98,67,59,45};
		int total=0;
		float avg;
		
		
		
		for(int i=0;i < marks.length ; i++)
		{
			total = total + marks[i];  
			//System.out.println(marks[i]);			
		}
		
		System.out.println("Total " + total);
		
		avg = total / marks.length;
		
		System.out.println("Average :  " + avg);
		
		if(avg >= 90)
			System.out.println("A+");
		else if(avg >=80 )
			System.out.println("A");
		else if(avg >= 70)
			System.out.println("B");
		else if(avg >= 60)
			System.out.println("C");
		else if(avg >= 50)
			System.out.println("D");
		else if(avg > 0)
			System.out.println("F");
		
		System.out.println("__________________________");
		
		if(avg >=0 && avg<50)
			System.out.println("F");
		else if(avg>=50 && avg <60)
			System.out.println("D");
		else if(avg>=60 && avg<70)
			System.out.println("C");
		else if(avg>=70 && avg <80)
			System.out.println("B");
		else if(avg>=80 && avg <90)
			System.out.println("B");
		else if(avg>=90)
			System.out.println("A+");
												
	}
}
