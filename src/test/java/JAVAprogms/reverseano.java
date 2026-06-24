package JAVAprogms;

public class reverseano {

	public int reverse(int num)
	{
		int rev = 0;
		while(num != 0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		reverseano obj1 = new reverseano();
		System.out.println(obj1.reverse(12345));
		obj1.reverse(78956);
	}
}
