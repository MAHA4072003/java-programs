class a
{
	static int x=10;
	public static void m1()
	{
		System.out.println("hii");
	}
}
class b
{
	static int y=20;
	public static void m2()
	{
		System.out.println("bye");
	}
}
class Maintest1
{
   public static void main(String[] args)
    {
		System.out.println(a.x);
		System.out.println(b.y);
        a.m1();		
		b.m2();
    }
}

	
	