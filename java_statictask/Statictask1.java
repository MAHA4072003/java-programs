import java.util.Scanner;
class A
{
	public static void print(int n)
	{
		System.out.println("result");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
class Statictask1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scn.nextInt();
		A.print(n);
	}
}