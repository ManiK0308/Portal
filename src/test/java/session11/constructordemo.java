package session11;

public class constructordemo {

	int x, y,z;
	
	public constructordemo() {
	
		x= 100 ; 
		y = 200;
	}
	
	public constructordemo(int a , int b)
	{
		x= a;
		y= b;
		System.out.println(x + "" + y);
	}
	
	//constructor chaining
	public	 constructordemo(int a, int b ,  int c)
	{
		this(a,b);
		z=c;
		System.out.println(x + "" + y + "" + z);

	}
	public void sum(int x,  int y)
	{
		System.out.println(x+y);
	}
	public static void main(String[] args)
	{	
		constructordemo d1 = new constructordemo(20, 30);
		constructordemo d2 = new constructordemo(20, 30,40);
	}
}
