package session15;

class Parent {
	static void show() {
		System.out.println("Parent");
	}
	void display() {
		System.out.println("Parent display");
	}
	final static void salary(int salary) {
		System.out.println("salary is:"  + salary);
	}
}

class Child extends Parent {
	static void show() {
		System.out.println("Child");
	}
	@Override
	void display() {
		System.out.println("Child display");
	}
}

public class finaldemo {
	public static void main(String[] args) {

//        Child.show();      // inherited from Parent
//        Child.show(100);   // Child's overloaded method

		Parent p = new Parent();
		Child c = new Child();
		p.salary(20000);
		Parent p1 = new Child();
		p.show(); // This will call the static method from Child class
		c.show();
		
		p1.show(); // This will call the static method from Child class
	}
}