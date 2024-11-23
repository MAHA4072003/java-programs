class Pattern5
{
	public static void main(String[] args)
	{
		char ch='a';
		int x=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
					{
				      System.out.print(x+"\t");
				      x++;
			        }
			    else
			        {
				      System.out.print(ch+"\t");
					  ch++;
			        }
			}
			System.out.println();
		}
	}
}
			
			
		