import java.util.Scanner;
class FacebookLogin
{
	public void login(String email, String pwd1)
	{
		System.out.println("Login done via email!!");
	}
	public void login(Long phono, String pwd2)
	{
		System.out.println("Login done via phno!!");
	}
}
class MainOfFacebook
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		FacebookLogin fb=new FacebookLogin();
		System.out.println("1.Login via email\n2.Login via phno");
		System.out.println("please make a choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: System.out.println("enter email");
				String email=scn.next();
				System.out.println("enter pwd1");
				String pwd1=scn.next();
				fb.login(email,pwd1);
			break;
			case 2: System.out.println("enter phno");
				String phno=scn.next();
				System.out.println("enter pwd2");
				String pwd2=scn.next();
				fb.login(phno,pwd2);
				break;
			default: System.out.println("invalid choice!!");
		}
	}
}	
			
			