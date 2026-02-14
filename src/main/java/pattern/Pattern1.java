package pattern;

public class Pattern1 {
	public static void main(String[] args) {

		Pattern1 p1 = new Pattern1();
		p1.pat1();
		System.out.println();
		p1.pat2();
		System.out.println();
		p1.pat3();

	}

	public void pat1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pat2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pat3() {
		int Stars = 0;
		int Gaps = 5;
		for (int b = 1; b <= 5; b++) {
			Stars += 1;
			Gaps -= 1;
			for (int c = 1; c <= Gaps; c++) {
				System.out.print(" ");
			}
			for (int d = 1; d <= Stars; d++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
