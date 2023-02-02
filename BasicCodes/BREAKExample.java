package BasicCodes;

public class BREAKExample 
{
	public static void main(String... g)
	{
		// break keyword will terminate the loop 
		// and transfer the program execution 
		// on the nexxt coming statement after loop
		
		
		// first n natural numbers
		
		int i = 1;
		int n = 20;
		
		while(i <= 20)
		{
			System.out.println(i);
			
			if(i == 13)
				break;
			
			
			i++;								
		}
		
		System.out.println("End of while loop....");
	}

}
