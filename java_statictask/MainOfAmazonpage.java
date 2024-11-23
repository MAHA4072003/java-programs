class Amazonv1
{
	public void login()
	{
		System.out.println("login done...");
	}
	public void pay()
	{
		System.out.println("you can pay phone bills...");
	}
	public void shop()
	{
		System.out.println("you can do shoping...");
	}
	public void logout()
	{
		System.out.println("logout done...");
	}
}
class Amazonv2 extends Amazonv1
{
	public void pay()
	{
		System.out.println("you can pay phone/gas/water bills...");
	}
	public void muxic()
	{
		System.out.println("you can listen to music...");
	}
	public void prime()
	{
		System.out.println("you can watch movies and series...");
	}
}
class MainOfAmazonpage
{
	public static void main(String[] args)
	{
		Amazonv1 a1=new Amazonv1();
		a1.login();
		a1.pay();
		a1.shop();
		a1.logout();
		System.out.println("-----------------");
		Amazonv2 a2=new Amazonv2();
		a2.login();
		a2.pay();
		a2.shop();
		a2.muxic();
		a2.prime();	
		a2.logout();
	}
}

	
	
	
		