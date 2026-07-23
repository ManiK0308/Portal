package session15;

class Avengers {
	void Captainamerica11() {
		System.out.println("Parent");
	}

	void blackwidow11() {
		System.out.println("Parent display");
	}}

class Spiders extends Avengers{

	void Captainamerica1() {
		System.out.println("Child");
	}

	@Override
	void blackwidow11() {
		System.out.println("Child display");
		super.blackwidow11();
	}
}

public class superkeyword {

	public static void main(String[] args) {

		Avengers p = new Avengers();
		Spiders c = new Spiders();
		p.Captainamerica11();
		Avengers p1 = new Spiders();
		p.Captainamerica11(); // This will call the static method from Child class
		c.Captainamerica1();
		c.blackwidow11();
		p1.Captainamerica11(); // This will call the static method from Child class
	}
}
