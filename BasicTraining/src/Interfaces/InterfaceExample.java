package Interfaces;

interface Testinter
{
	int a=10; // by default variable is static and final
	void display(); // abstract method
	
}


public class InterfaceExample implements Testinter
{
 
	public void display() //public is to avoid access modifier error
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		InterfaceExample ie=new InterfaceExample();
		ie.display();

	}

}
