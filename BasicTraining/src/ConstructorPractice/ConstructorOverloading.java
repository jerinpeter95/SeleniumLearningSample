package ConstructorPractice;

public class ConstructorOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading()  //first
	{
		a=10;
		b=20;
		c=20.5;
	}
	
	ConstructorOverloading(int x, int y) //second
	{
		a=x;
		b=y;
	}
	
	ConstructorOverloading(int x, double y) //third
	{
		a=x;
		c=y;
	}
	
	ConstructorOverloading(int x, int y, double z) //fourth
	{
		a=x;
		b=y;
		c=z;
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		// ConstructorOverloading co=new ConstructorOverloading(); //first constructor
		
		// ConstructorOverloading co=new ConstructorOverloading(10,20); //second constructor
		
		// ConstructorOverloading co=new ConstructorOverloading(10,20.5); //third constructor
		
		ConstructorOverloading co=new ConstructorOverloading(10,20,20.5); // fourth constructor
		co.display();
		

	}

}
