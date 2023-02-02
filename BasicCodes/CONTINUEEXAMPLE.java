package BasicCodes;

public class CONTINUEEXAMPLE 
{
	public static void main(String... g)
	{			
		int i = 0;
		int n = 20;
		
		while(i <= 20)
		{			
			i++;
			
			if(i == 13)			
				continue;
				
			System.out.println(i);											
		}
		
		System.out.println("End of while loop....");
	}

	
	
}
