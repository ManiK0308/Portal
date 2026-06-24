package Static_Nonstatic;

public class S_NS_2 {

	static  int v =10;
public static void main(String[] args) {
	S_NS_2 obj1 = new S_NS_2();
	walk();
	obj1.run();
	
	
}
	public void run() {
		System.out.println("run 50 kms");
		v= v +10;
		System.out.println(v);
	}

	public static void walk() {
		System.out.println("walk 5 kms");
		v= v +20;
		System.out.println(v);
	}

	public static void run1() {
		System.out.println("run 10 kms");
		v= v +30;
		System.out.println(v);
	}

	public void walk1() {
		System.out.println("walk 10 kms");
		v= v +40;
		System.out.println(v);
				
	}
}
