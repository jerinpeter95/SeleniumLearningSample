package ArrayExample2;

public class ArraySumPractice {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500};
		
		int sum=0;
		
		for(int i:a)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The sum of numbers" + sum);

	}

}
