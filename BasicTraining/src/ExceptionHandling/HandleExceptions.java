package ExceptionHandling;

public class HandleExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		int a=20;
		try
		{System.out.println(a/0);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is running");
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program is ended");

	}

}
