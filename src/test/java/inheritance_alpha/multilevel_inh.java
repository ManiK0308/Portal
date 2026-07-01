package inheritance_alpha;


class alpha
{
	int tempa;
	
	public void vegetables()
	{
		System.out.println("alpha vegetables");
	}
	
	public static void vehicle()
	{
		System.out.println("alpha vehicle");
	}
}	


class beta extends alpha
{
	public void vegetables()
	{
		System.out.println("beta vegetables");
	}
	
	public static void vehicle()
	{
		System.out.println("beta vehicle");
	}
}

class gamma extends beta
{
	public void vegetables()
	{
		System.out.println("gamma vegetables");
	}
	
	public static void vehicle()
	{
		System.out.println("gamma vehicle");
	}
}
public class multilevel_inh {

	public static void main(String[] args) {
		alpha a = new alpha();
		beta b = new beta();
		gamma g = new gamma();
		
		System.out.println("--- alpha object ---");
		a.vegetables(); // instance method
		a.vehicle();    // static method
		
		System.out.println("--- beta object ---");
		b.vegetables(); // instance method (overridden)
		b.vehicle();    // static method (hidden)
		
		System.out.println("--- gamma object ---");
		g.vegetables(); // instance method (overridden)
		g.vehicle();    // static method (hidden)

		// Upcasting
		System.out.println("--- Upcasting: alpha ref = new beta() ---");
		alpha ab = new beta();
		ab.vegetables(); // Should call beta's vegetables (dynamic binding)
		ab.vehicle();    // Should call alpha's vehicle (static method, reference type)

		System.out.println("--- Upcasting: alpha ref = new gamma() ---");
		alpha ag = new gamma();
		ag.vegetables(); // Should call gamma's vegetables
		ag.vehicle();    // Should call alpha's vehicle

		System.out.println("--- Upcasting: beta ref = new gamma() ---");
		beta bg = new gamma();
		bg.vegetables(); // Should call gamma's vegetables
		bg.vehicle();    // Should call beta's vehicle

		// Downcasting
		System.out.println("--- Downcasting: (gamma)ag ---");
		if (ag instanceof gamma) {
			gamma g2 = (gamma) ag;
			g2.vegetables(); // gamma's vegetables
			g2.vehicle();    // gamma's vehicle
		}
	}
}