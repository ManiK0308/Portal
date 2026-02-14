package Loops;

public class Jspiders {
	public static void main(String[] args) {
		Jspiders.Squarematrix();

		Jspiders s1 = new Jspiders();
		s1.lefttriangle();
		s1.rightriangle_r();
	}

	// Program to print 5*5 matrix.
	// Below program is a static method.
	public static void Squarematrix() {
		System.out.println("I am running program 5 * 5 matrix");
		for (int x = 1; x <= 5; x++) {
			for (int j = 1; j <= 5; j++) {
				if (x % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("^");
				}
			}
			System.out.println();
			// i am making
		}
	}

	public void lefttriangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void rightriangle_r() {
		for (int j = 5; j >= 1; j--) {
			for (int i = 5; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}