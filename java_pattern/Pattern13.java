class Pattern13
{
	public static void main(String[] args)
	{
		char x='a';
		char y='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					if(i%2==0)
					{
						System.out.print(x+"\t");
					    x++;
			        }
    		        else
					{
					    System.out.print(y+"\t");
					    y++;
			        }
				}
				else
				{
				   System.out.print("\t");
				}
			}
			System.out.println();
			
		}
	}
}
				
				
			