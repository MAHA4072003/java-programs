class Actor
{
	String name;
	int age;
	int nom;
	int noh;
	int nof;
	public Actor(String a, int b, int c, int d, int e)
		{
			name=a;
			age=b;
			nom=c;
			noh=d;
			nof=e;
		}
	}
	class MainOfActor
	{
		public static void main(String[] args)
		{
			Actor a1=new Actor("Vijay",60,60,40,20);
			Actor a2=new Actor("Suriya",48,40,15,8);
			Actor a3=new Actor("Sethupathi",46,30,10,15);
			Actor a4=new Actor("Dhanush",40,52,6,7);
			Actor a5=new Actor("karthick",47,12,5,4);
			
			System.out.println("name\t\tage\t\tnom\t\tnoh\t\tnof");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(a1.name+"\t\t"+a1.age+"\t\t"+a1.nom+"\t\t"+a1.noh+"\t\t"+a1.nof);
			System.out.println(a2.name+"\t\t"+a2.age+"\t\t"+a2.nom+"\t\t"+a2.noh+"\t\t"+a2.nof);
			System.out.println(a3.name+"\t"+a3.age+"\t\t"+a3.nom+"\t\t"+a3.noh+"\t\t"+a3.nof);
			System.out.println(a4.name+"\t\t"+a4.age+"\t\t"+a4.nom+"\t\t"+a4.noh+"\t\t"+a4.nof);
			System.out.println(a5.name+"\t"+a5.age+"\t\t"+a5.nom+"\t\t"+a5.noh+"\t\t"+a5.nof);
		}
	}

			