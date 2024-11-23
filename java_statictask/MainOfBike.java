class Bike
{
	String name;   
	int price;
	String color;
	int yom;
	String brand;
	public Bike(String a, int b, String c, int d, String e)
		{
			name=a;
			price=b;
			color=c;
			yom=d;
			brand=e;
		}
	}
	class MainOfBike
	{
		public static void main(String[] args)
		{
			Bike b1=new Bike("Hero Honda",80000,"black",1995,"Hero");
			Bike b2=new Bike("Royal Enfield",150000,"black",1999,"RE");
			Bike b3=new Bike("Pulser",120000,"black",1998,"Bajaji");
			Bike b4=new Bike("Fasino",110000,"black",2020,"Fasino");
			
			System.out.println("name\t\tprice\t\tcolor\t\tyom\t\tbrand");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(b1.name+"\t"+b1.price+"\t\t"+b1.color+"\t\t"+b1.yom+"\t\t"+b1.brand);
			System.out.println(b2.name+"\t"+b2.price+"\t\t"+b2.color+"\t\t"+b2.yom+"\t\t"+b2.brand);
			System.out.println(b3.name+"\t\t"+b3.price+"\t\t"+b3.color+"\t\t"+b3.yom+"\t\t"+b3.brand);
			System.out.println(b4.name+"\t\t"+b4.price+"\t\t"+b4.color+"\t\t"+b4.yom+"\t\t"+b4.brand);
		}
	}

			