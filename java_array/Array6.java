import java.util.Scanner;
class Array6
{
	public static void main(String[] args)
	{
	    Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scn.nextInt();
		
		char[] ch=new char[size];
		
		System.out.println("Enter value");
		for(int i=0;i<size;i++)
		{
			ch[i]=scn.next().charAt(0);
		}
		System.out.println("result");
		for(int i=0;i<size;i++)
		{
			if(ch[i]=='A' || ch[i]=='a' || ch[i]=='E' ||
			   ch[i]=='e' || ch[i]=='I' || ch[i]=='i' ||
			   ch[i]=='O' || ch[i]=='o' || ch[i]=='U' || ch[i]=='u')                                                                                        
			{
			System.out.println(ch[i]);
			}
		}
		
	}
}