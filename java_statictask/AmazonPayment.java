import java.util.Scanner;
class AmazonPayment
{
	public void amazon(int payment)
	{
		System.out.println("Make a payment");
	}
	public void amazon(String upi)
	{
		System.out.println("make a upi");
	}
	public void amazon(long cardno, int cvv)
	{
		System.out.println("Make a cardno");
	}
	public void amazon(String username, String pwd)
	{
		System.out.println("Payment done via internet banking...");
	}
}
class MainOfAmazonPayment
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		AmazonPayment ap=new AmazonPayment();
		System.out.println("1.Enter via payment\n2.Enter via upi\n3.Enter via cvv\n4.Enter via username\n5.Enter via password");
		System.out.println("please make a choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Enter username");
				String username=scn.next();
				ap.amazon(trainNo);
			    break;
			case 2: System.out.println("Enter password");
				int pwd=scn.nextInt();
				ap.amazon(trainName);
				break;
			default: System.out.println("invalid choice!!");
		}
	}
}	
			
			