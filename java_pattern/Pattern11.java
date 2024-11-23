class Pattern11
{
	public static void main(String[] args)
	{
		int a=1;
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					if(j==i)
					{
						System.out.print(a+"\t");
					    a++;
			        }
    		        else
					{
					    System.out.print(ch+"\t");
					    ch++;
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
				
				
			