class test
{
	int x=10;
	int y=20;
	public void m1()
	{
		System.out.println("hii");
	}
	public void m2()
	{
		System.out.println("byee");
	}
}
class maintest3
{
	public static void main(String[] args)
	{
		test t1=new test();
		System.out.println(t1.x);	
		t1.m1();
		test t2=new test();	
		System.out.println(t2.y);
		t2.m2();
	}
}