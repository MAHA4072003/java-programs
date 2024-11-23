class assign2
{
	public static void main(String[]args)
	{
		float a= 25.2;
		int b= 50;
		char c= 'A';
		System.out.println("Hi main");
		String x=m1(a, b, c);
		System.out.println("x= "+x);
		System.out.println("Byee main");
	}
	public static String m1(float a, int b, char c)
	{
		System.out.println("Hi m1");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		return "Hello";
	}
}