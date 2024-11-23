class A
{
	public static void m1()
	{
		System.out.println("Hi");
	}
	public static void m1()
	{
		System.out.println("hey");
		System.out.println(x);
	}
	public static void m1(double x, boolean y)
	{
		System.out.println("hello");
		System.out.println(x);
		System.out.println(y);
	}
}
class B
{
	public static void main(String[] args)
	{
		A.m1();
		A.m1(100);
		A.m1(10.1,true);
	}
}
