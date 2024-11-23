import java.util.Scanner;
class AmazonPayment
{
  public void payment()
  {
    System.out.println("Payment done via cash on delivery...");
  }
  public void payment(String upi)
  {
    System.out.println("Payment done via upi...");
  }
  public void payment(long cardno,int cvv)
  {
    System.out.println("Payment done via card...");
  }
  public void payment(String username,String password)
  {
    System.out.println("Payment done via internet banking...");
  }
}
class MainOfAmazon
{
  public static void main(String[] args)
  {
    Scanner scn=new Scanner(System.in);
    AmazonPayment ap=new AmazonPayment();
    System.out.println("1.payment via cash on delivery\n2.payment via upi\n3.payment via card\n4.payment via internet banking");
    System.out.println("if user choice=");
    int choice=scn.nextInt();
    switch(choice)
    {
      case 1:ap.payment();
           break;
           
      case 2:System.out.println("enter upi");
             String upi=scn.next();
             ap.payment(upi);
             break;
           
      case 3:System.out.println("enter card no");
             long cardno=scn.nextLong();
             System.out.println("enter cvv");
             int cvv=scn.nextInt();
             ap.payment(cardno,cvv);
            break;
           
      case 4:System.out.println("enter username");
             String username=scn.next();
             System.out.println("enter password");
             String password=scn.next();
             ap.payment(username, password);
             break;
        
      default:System.out.println("invalid choice!!");
    }
  }
}