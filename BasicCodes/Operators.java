package BasicCodes;

public class Operators 
{
	public static void main(String... g)
	{
		int a=1,b=8,c=4,d=90;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);
		
		System.out.println(!(a>b || a>c));
		
		
		System.out.println(a+(++d));
		
		a=1;
		d=90;
		
		System.out.println(a+d++);
		
		a=1;
		d=90;
		
		System.out.println(a-++d);
		
		a=1;
		d=90;
		
		
		System.out.println(++d+a);
		
		a=1;
		d=90;
		
		System.out.println(++d-a);
		
		a=1;
		d=90;
		
		System.out.println(d+++a);
		
		a=1;
		d=90;
		
		System.out.println(d++-a);
			
		
	}	
}
