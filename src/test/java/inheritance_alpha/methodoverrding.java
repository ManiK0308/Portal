package inheritance_alpha;

class vegetables
{
	public void eat()
	{
		System.out.println("eat vegetables");
	}
	public void feed()
	{
		System.out.println("feed vegetables ");
	}
}
class fruits extends vegetables
{
	@Override
	public void eat()
	{
		System.out.println("eat fruits");
	}
	public void run()
	{
		System.out.println("feed fruits");
	}
}

public class methodoverrding {
public static void main(String[] args) {
	
	vegetables v = new fruits();
	v.eat(); // method overriding
	v.feed(); // method from parent classs
}
	}
