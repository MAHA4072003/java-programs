import java.util.Scanner;
class Task1
{
	Public void display(double base, double height)
	{
		double area=length*breadth;
		System.out.println("area="+area);
	}
}
class MainTask1
{
	public static void main(String[] args)
	{
		Scanner.scn=new Scanner(System.in);
		System.out.println("Enter base");
		dpuble length=scn.nextDouble();
		System.out.println("Enter height");
		double breadth=scn.nextDoubble();
		Task1 t=new Task1();
		t.dsiplay(length,breadth);
	}
}
