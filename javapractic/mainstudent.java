class student
{
	int id;
	String name;
	int mark;
	static String cname;
	static String address;
}
class mainstudent
{
	public static void main (String[] arg)
	{
		student.cname="abc";
		student.address="addess12345";
		
		student student=new student();
		student.id=1;
		student.name="max";
		student.mark=80;
		System.out.println("print"+student.id);
		System.out.println("print"+student.name);
		System.out.println("print"+student.mark);
		System.out.println("print"+student.cname);
		
		System.out.println("------------");
	}
}
		
		
		
		
