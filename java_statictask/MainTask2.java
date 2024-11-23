import java.util.Scanner;//error
class Task2
{
	public void display(side, side)
	{
		double area=side*side;
		System.out.println("area="+area);
	}
}
class MainTask2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter side");
		side=scn.nextDouble();
		System.out.println("Enter side");
		side=scn.nextDouble();
		Task2 t=new Task2();
		t.display(side,side);
	}
}
