class PhonePev1
{
	public void login()
	{
		System.out.println("login done");
	}
	public void sendMoney()
	{
		System.out.println("sendMoney Send/recieved");
	}
	public void checkBalance()
	{
		System.out.println("checkBalanc done");
	}
	public void recharge()
	{
		System.out.println("recharge done");
	}
	public void logout()
	{
		System.out.println("logout done");
	}
}
class PhonePev2 extends PhonePev1
	{
	public void payBills()
	{
		System.out.println("payBills done");
	}
	public void bookTicket()
	{
		System.out.println("bookTicket done");
	}
}		
class MainOfPhonePe
{
	public static void main(String []args)
	{
		PhonePev1 p1=new PhonePev1();
		p1.login();
		p1.sendMoney();
		p1.checkBalance();
		p1.recharge();
		p1.logout();
		System.out.println("----------------------");
		PhonePev2 p2=new PhonePev2();
		p2.payBills();
		p2.bookTicket();
	}
}
