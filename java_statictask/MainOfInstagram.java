class Instagramv1
{
	public void login()
	{
		System.out.println("login done");
	}
	public void message()
	{
		System.out.println("message Send/recieved");
	}
	public void like()
	{
		System.out.println("like done");
	}
	public void reels()
	{
		System.out.println("reels done");
	}
	public void logout()
	{
		System.out.println("logout done");
	}
}
class Instagramv2 extends Instagramv1
	{
	public void sharePost()
	{
		System.out.println("sharePost done");
	}
	public void uploadPost()
	{
		System.out.println("uploadPost done");
	}
}		
class MainOfInstagram
{
	public static void main(String []args)
	{
		Instagramv1 iv1=new Instagramv1();
		iv1.login();
		iv1.message();
		iv1.like();
		iv1.reels();
		iv1.logout();
		System.out.println("----------------------");
		Instagramv2 iv2=new Instagramv2();
		iv2.sharePost();
		iv2.uploadPost();
	}
}
