package ArrayExample2;

public class ArrayExample {

	public static void main(String[] args) {
		
		String s[]=new String[3];
		
		s[0]="welcome";
		s[1]="to";
		s[2]="string";
		
		System.out.println(s.length);
		
		for(String i:s)
		{
			System.out.println(i);
		}

	}

}
