package BasicCodes;

public class SwitchCaseExample1
{
	public static void main(String... g)
	{
		char ch = 'Z';
		
		switch(ch)
		{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':							
					System.out.println("Vowel!");
					break;
			default:
					System.out.println("Not Vowel!");
					break;
		}
	}

}
