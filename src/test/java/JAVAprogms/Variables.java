package JAVAprogms;

public class Variables {
	public static void main(String[] args) {
		int x = 12;
		System.out.println(x + 10);

		char system1 = 'A';
		char Sysem2 = 'B';
		System.out.println(system1 + Sysem2);

		String str = "curie";
		String rev = new StringBuilder("follow").reverse().toString();
		if (str.equals(rev)) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
