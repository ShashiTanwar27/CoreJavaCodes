package BasicCodes;

public class SwitchCaseExample2 
{
	enum Days
	{
		SUN,MON,TUE,WED
	}
	
	public static void main(String... g)
	{
		String ch = "Hello";
		
		int i;
		
		switch(ch)
		{
			case "Hello":
			case "Hope":
			case "Good":
			case "Best":								
					System.out.println("Got a String");
					break;
			default:
					System.out.println("Not a searched String");
					break;
		}
	
		Days d;
		d=Days.MON;
		
		switch(d)		
		{
		case SUN:
					System.out.println("SUNDAY");
					break;
		
		case MON:
					System.out.println("Monday");
						break;

		case TUE:
					System.out.println("Tuesday");
						break;

		case WED:
					System.out.println("Wednesday");
						break;

		default:
					System.out.println("Any Other Day...");
						break;		
		}	
			
	}
}


