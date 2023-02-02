package BasicCodes;

public class WHILEExample 
{	
		public static void main(String... g)
		{
			int i=1;
			
			while(i<10)
			{
				System.out.println(i);
				i++;
			}
			
			// reverse of a number
			
			long num =897867L;  // 768798
			long temp=0;
			int rem;
			
			while( num>0 )
			{
				rem = (int)num % 10;
				num = num / 10;
				temp = temp*10+(long)rem;										
			}
			
			System.out.println("Reverse : "+temp);
					
		}		
}

/* while loop
 *  * 
 *      while(condition)  if true
 *      {
 *      	logic *      
 *      }

		

		do    // will run at least once.
			{
				logic        // logic will get executed first
				
			}while(condition); // afterwards condition get checked
*/
