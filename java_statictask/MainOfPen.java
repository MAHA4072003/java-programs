class Pen
{
	String name;
	int price;
	String color;
	int yom;
	public Pen(String a, int b, String c, int d)
		{
			name=a;
			price=b;
			color=c;
			yom=d;
		}
	}
	class MainOfPen
	{
		public static void main(String[] args)
		{
			Pen p1=new Pen("Currer Ball",10,"blue",2020);
			Pen p2=new Pen("Move",10,"black",2022);
			Pen p3=new Pen("Carbonix",10,"blue",2021);
			Pen p4=new Pen("Dan Crow",20,"blue",2015);
			Pen p5=new Pen("Pantonic",15,"black",2022);
			Pen p6=new Pen("Trymax",50,"blue",2000);
			
			System.out.println("name\t\tprice\t\tcolor\t\tyom");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(p1.name+"\t"+p1.price+"\t\t"+p1.color+"\t\t"+p1.yom);
			System.out.println(p2.name+"\t\t"+p2.price+"\t\t"+p2.color+"\t\t"+p2.yom);
			System.out.println(p3.name+"\t"+p3.price+"\t\t"+p3.color+"\t\t"+p3.yom);
			System.out.println(p4.name+"\t"+p4.price+"\t\t"+p4.color+"\t\t"+p4.yom);
			System.out.println(p5.name+"\t"+p5.price+"\t\t"+p5.color+"\t\t"+p5.yom);
			System.out.println(p6.name+"\t\t"+p6.price+"\t\t"+p6.color+"\t\t"+p6.yom);
		}
	}

			 