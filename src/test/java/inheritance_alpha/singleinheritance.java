package inheritance_alpha;

class Animals
{
	String color = "white";
	String breed = "persian";
	String name = "cat";
	
	public void eat()
	{
		System.out.println("eating");
	}
		
	public void feed()
	{
		System.out.println("feed milk");
	}																	
	
}

class Dog extends Animals
{
	String eyecolor = "black";
	void bark()
	{
		System.out.println("barking");
	}
	
	public void feed()
	{
		System.out.println("feed grass");
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		Animals d = new Dog();
		System.out.println(d.color);
		System.out.println(d.breed);
		System.out.println(d.name);
		d.eat();
		d.feed();
		
	}
}
