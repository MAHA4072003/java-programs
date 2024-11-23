import java.util.Scanner;
class even
{
	public static void print(int n)
	{
		for(int i=n;i>=1;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class maineven
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a value");
		int n=scn.nextInt();
		even.print(n);
	}
}