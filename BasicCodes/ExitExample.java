package BasicCodes;

public class ExitExample 
{

	public static void main(String... g)
	{
		
		int i = 1;
		int n = 20;
		
		while(i <= 20)
		{
			System.out.println(i);
			
			
			if(i == 13)
				System.exit(0);
			
			// terminate the program execution 
			                     // 0 - if no error occur
			                     //1 - if error occur			
			i++;								
		}
		
		System.out.println("End of while loop....");
	}
	
}
