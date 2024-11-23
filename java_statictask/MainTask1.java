import java.util.Scanner;
class Task1
{
	public void display(double length, double breadth)
	{
		double area=length*breadth;
		System.out.println("area="+area);
	}
}
class MainTask1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length");
		double length=scn.nextDouble();
		System.out.println("Enter breadth");
		double breadth=scn.nextDouble();
		Task1 t=new Task1();
		t.display(length,breadth);
	}
}
