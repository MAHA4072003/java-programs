class Employee
{
	String name;
	int age;
	double salary;
	static String cname;
	static String caddress;
}
class MainOfEmployee
{
	public static void main(String[] args)
	{
		Employee.cname="qspider";
		Employee.caddress="velacerry";
		
		Employee s1=new Employee();
		s1.name="max";
		s1.age=20;
		s1.salary=15000;
		System.out.println("name ->"+s1.name);
		System.out.println("age ->"+s1.age);
		System.out.println("salary ->"+s1.salary);
		System.out.println("cname ->"+Employee.cname);
		System.out.println("caddress ->"+Employee.caddress);
		System.out.println("______________");
		Employee s2=new Employee();
		s2.name="lax";
		s2.age=21;
		s2.salary=17000;
		System.out.println("name ->"+s2.name);
		System.out.println("age ->"+s2.age);
		System.out.println("salary ->"+s2.salary);
		System.out.println("cname ->"+Employee.cname);
		System.out.println("caddress ->"+Employee.caddress);
	}
}
		
		
		