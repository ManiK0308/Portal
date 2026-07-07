package SDET;
//How to pass arguments to main method in java
public class session14 {
public static void main(String[] args) {
	
	
	// Check if any arguments are passed
	if (args.length > 0) {
		System.out.println("Arguments passed to main method:");
		for (String arg : args) {
			System.out.println(arg);
		}
	} else {
		System.out.println("No arguments passed to main method.");
}
}
}