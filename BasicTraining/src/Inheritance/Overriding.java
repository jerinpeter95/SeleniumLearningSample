package Inheritance;

class Bank
{
	int getRateofInterest() 
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateofInterest() //overriding
	{
		return 10;
	}
}

class ICICI extends Bank
{
	int getRateofInterest() //overriding
	{
		return 15;
	}
}

class AXIS extends Bank
{
	int getRateofInterest() //overriding
	{
		return 12;
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateofInterest()); //10
		
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getRateofInterest()); //15
		
		AXIS axisobj=new AXIS();
		System.out.println(axisobj.getRateofInterest()); //12
				
		

	}

}
