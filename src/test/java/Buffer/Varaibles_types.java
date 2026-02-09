package Buffer;

public class Varaibles_types {
	static int g = 23;
	public static void main(String[] args) {
		Varaibles_types vt1 = new Varaibles_types();
		vt1.run();
		Varaibles_types vt2 = new Varaibles_types();
		System.out.println(vt1.g);
		System.out.println(vt2.g);
	}
	public void run()
	{
		g+=56;
		System.out.println(g);
	}
	
}
