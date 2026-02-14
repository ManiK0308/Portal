package Loops;

import java.util.Scanner;

public class loop_If {
	public static void main(String[] args) {

		System.out.println("Please provide input1");
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please provide input2");
		Scanner input2 = new Scanner(System.in);

		int x = input1.nextInt();
		int y = input2.nextInt();

		if (x > y) {
			System.out.println("create a new block");
		} else if (x < y) {
			System.out.println("shawn pollock");
		} else {
			System.out.println("We are in default system");
		}
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub

	}
}
