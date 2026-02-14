package pattern;

public class Star1 {
	public static void main(String[] args) {

		int stars = -1;
		int gaps = 4;
		for (int i = 1; i <= 4; i++) {
			stars += 2;
			gaps -= 1;
			{
				for (int j = 1; j <= gaps; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= stars; k++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}
}
