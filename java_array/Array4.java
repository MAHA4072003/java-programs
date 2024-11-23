import java.util.Scanner;
class Array4
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
		double sum=0.0;
		System.out.println("result");
		for(int i=0;i<size;i++)
		{
			if(d1[i]<13.2)
			{
				sum=sum+d1[i];
			}
		}
			System.out.println(sum);
		
	}
}