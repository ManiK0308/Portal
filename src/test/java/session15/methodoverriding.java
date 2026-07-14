package session15;

class Bank{
	static int accountnumber = 123456;
	public double getRateOfInterest()
	{
		System.out.println("Rate of interest is 5%");
		return 5;
	}
}

class SBI extends Bank{
	
	@Override
	public double getRateOfInterest()
	{
		System.out.println("Rate of interest is 6%");
		return 6;
	}
}
class ICICI extends Bank{
	
	public double acccountaccess()
	{
		System.out.println("Rate of interest is 7%");
		return 7;
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		Bank b = new SBI();
		b.getRateOfInterest(); // method overriding
		b = new ICICI();
		b.getRateOfInterest(); // method overriding
		
		ICICI i = new ICICI();
		i.acccountaccess();
		i.getRateOfInterest();
		
	}
}
