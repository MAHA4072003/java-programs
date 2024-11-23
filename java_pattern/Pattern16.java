class Pattern16
{
	public static void main(String[] args)
	{
		int a=1;
		char ch='a';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j<=i)
				{
					if(j==i)
					{
						System.out.print(ch+"\t");
					    ch++;
			        }
    		        else
					{
					    System.out.print(a+"\t");
					    a++;
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
				
				
			