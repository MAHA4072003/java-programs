class Pattern6
{
	public static void main(String[] args)
	{
		char ch = 'A';
		int x = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					{
				      System.out.print(ch+"\t");
				      ch++;
			        }
			    else
			        {
				      System.out.print(x+"\t");
					  x++;
					 
			        }
			}
			System.out.println();
		}
	}
}
			
			
		