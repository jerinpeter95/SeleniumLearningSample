package ArrayExample2;

public class ObjectPractice {

	public static void main(String[] args) {
		
		Object a[]=new Object[5];
		
		a[0]=10;
		a[1]=12.54;
		a[2]="welcome";
		a[3]='G';
		a[4]=true;
		
		for(Object i:a)
		{
			System.out.println(i);
		}

	}

}
