package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		try
		{
		arr[4]=100;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is 'finally' block");
		}

	}

}
