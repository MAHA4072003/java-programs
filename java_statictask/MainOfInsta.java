class Instagramv1
{
	public void login()
	{
		System.out.println("login done...");
	}
	public void reels()
	{
		System.out.println("30 sec reels uploaded...");
	}
	public void sharePost()
	{
		System.out.println("shar Post via instagram... ");
	}
	public void message()
	{
		System.out.println("message sent/recieved...");
	}
	public void like()
	{
		System.out.println("liked done...");
	}
	public void logout()
	{
		System.out.println("logout done..");
	}
}
class Instagramv2 extends Instagramv1
{
    @Override
	public void reels()
	{
		System.out.println("90 sec reels uploades...");
	}
	@Override
	public void sharePost()
	{
		System.out.println("shar Post via instagram/whats app/gmail/twitter...");
	}
}
class MainOfInsta
{
	public static void main(String[] args)
	{
		Instagramv1 iv1=new Instagramv1();
		iv1.login();
		iv1.reels();
		iv1.sharePost();
		iv1.message();
		iv1.like();
		iv1.logout();
		System.out.println("-----------------");
		Instagramv2 iv2=new Instagramv2();
		iv2.login();
		iv2.reels();
		iv2.sharePost();
		iv2.message();
		iv2.like();
		iv2.logout();
	}
}

	
	
	
		