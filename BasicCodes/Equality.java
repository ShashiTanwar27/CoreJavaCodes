package BasicCodes;

public class Equality 
{
	public static void main(String... g)
	{
		float a=9.9F;
		float b=4.5F;
		
		System.out.println(a == b);
		
		String str1 = "Java";
		String str2 = new String("Java");
		
		System.out.println("str1: "+str1.hashCode());
		System.out.println("str2: "+str2.hashCode());
		
		System.out.println((str1 == str2) ? "Equals" : "Not Equals");
		
							
	}

}
