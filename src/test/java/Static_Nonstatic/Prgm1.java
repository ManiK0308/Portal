	package Static_Nonstatic;
	
	public class Prgm1 {
		static Prgm1 s1 = new Prgm1();
	public static void main(String[] args) {
		System.out.println("main method starts here");
		s1.run();
		run1();
		System.out.println("main method ends");
	}
	public void run()
		{
			System.out.println("run 50 kms");
			walk();
			
	//		Prgm1 s1 = new Prgm1();
	//		s1.walk();
		}
	public static void walk()
		{
			System.out.println("walk 5 kms");
		}
	public static void run1()
	{
		System.out.println("run 10 kms");
	//	Prgm1 s2 = new Prgm1();
		s1.walk1();
	//	Prgm1 s1 = new Prgm1();
	//	s1.walk();
	}
	public void walk1()
	{
		System.out.println("walk 10 kms");
	}
	}
