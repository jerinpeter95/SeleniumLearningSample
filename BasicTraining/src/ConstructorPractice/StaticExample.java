package ConstructorPractice;

public class StaticExample {
	
	int a;
	static int b;
	
	static void m1()
	{
		System.out.println("This is m1 static method");	
	}
	void m2()
	{
		System.out.println("This is m2 non static");
	}

	public static void main(String[] args) 
	{
		b=100;
		System.out.println(b);
		m1();
		
		// a=200; not accessible since non static
		// m2();not accessible since non static
		
		StaticExample se=new StaticExample();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		

	}

}
