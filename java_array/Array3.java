import java.util.Scanner;
class Array3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scn.nextInt();
		
		double[] d1=new double[size];
		
		System.out.println("Enter value");
		for(int i=0;i<size;i++)
		{
			d1[i]=scn.nextDouble();
		}
		System.out.println("result");
		for(int i=0;i<size;i++)
		{
			if(d1[i]>20.2)
			{
			System.out.println(d1[i]);
			}
		}
		
	}
}