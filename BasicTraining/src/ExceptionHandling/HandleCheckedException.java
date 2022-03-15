package ExceptionHandling;

public class HandleCheckedException {

	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("Program started");
		System.out.println("Program running");
		
		/* try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		} */
		
		Thread.sleep(4000);
	
		System.out.println("Program ended");
		System.out.println("Program exit");
		

	}

}
