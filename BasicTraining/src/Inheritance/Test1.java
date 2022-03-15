package Inheritance;

class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}

class C extends B
{
	int p;
	int q;
	public void addition() {
		System.out.println(p+q);
	}
}

public class Test1 {
	
	
	public static void main(String[] args) {
		
		/*A aobj=new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();*/
		
		B bobj=new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		
		bobj.a=150;
		bobj.b=250;
		bobj.display();
		
		C cobj=new C(); //multilevel inheritance
		cobj.a=100;
		cobj.b=200;
		cobj.p=300;
		cobj.q=400;
		cobj.x=500;
		cobj.y=600;
		
		cobj.display();
		cobj.show();
		cobj.addition();
		

	}

}
