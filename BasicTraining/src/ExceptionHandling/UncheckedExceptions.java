package ExceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		
		int a=20;
		// System.out.println(a/0); //ArithmeticException
		
		String s=null;
		// System.out.println(s.length()); // NullPointerException

		String st="abcdef";
		// int i=Integer.parseInt(st);  //NumberFormatException
		// System.out.println(i);  
		
		
		int arr[]=new int[5];
		arr[10]=100;  //ArrayIndexOutOfBoundsException
	}

}
