import java.util.Scanner;
class TrainSearch
{
	public void search(int trainNo)
	{
		System.out.println("train searching done successful via train no");
	}
	public void search(String trainName)
	{
		System.out.println("train searching done successful via train name");
	}
}
class MainOfTrainsearch
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		TrainSearch ts=new TrainSearch();
		System.out.println("1.Enter your trainno\n2.Enter your trainname");
		System.out.println("please make a choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Enter trainNo");
				int trainNo=scn.nextInt();
				ts.search(trainNo);
			    break;
			case 2: System.out.println("Enter trainName");
				String trainName=scn.next();
				ts.search(trainName);
				break;
			default: System.out.println("invalid choice!!");
		}
	}
}	
			
			