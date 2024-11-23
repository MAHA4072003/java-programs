class both
{
	static int a=10;
	       int b=20;
	public static void m1()
	{
		System.out.println("hii");
	}
	public void m2()
	{
		System.out.println("byee");
	}
}
class maintest4
{
	public static void main(String[] args)
	{
		
		System.out.println(both.a);
		both.m1();
		both b2=new both();
		System.out.println(b2.b);
		b2.m2();
	}
}

	
	
	