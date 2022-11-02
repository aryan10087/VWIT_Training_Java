package VW1;

//Java program to demonstrate try-catch-finally
//when exception doesn't occurred in try block
public class Exception
{
	public static void main (String[] args)
	{
		
	try
	{
		
		String str = "123";
			
		int num = Integer.parseInt(str);
			
		
		System.out.println("try block fully executed");
		
	}
	
	catch(NumberFormatException ex)
	{
			
		System.out.println("catch block executed...");
			
	}
	
	finally
	{
		System.out.println("finally block executed");
	}

	System.out.println("Outside try-catch-finally clause");
	}
}

