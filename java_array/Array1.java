import java.util.Scanner;
class Array1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scn.nextInt();
		
		int[] a1=new int[size];
		
		System.out.println("Enter value");
		for(int i=0;i<size;i++)
		{
			a1[i]=scn.nextInt();
		}
		
		System.out.println("result");
		for(int i=0;i<size;i++)
		{
			if(a1[i]%2!=0)
			{
				System.out.println(a1[i]);
			}
		}
	}
}