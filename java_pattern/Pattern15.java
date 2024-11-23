class Pattern15
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{
			int a=5;
		    char ch='d';
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					if(i%2==0)
					{
						System.out.print(ch+"\t");
					    ch--;
			        }
    		        else
					{
					    System.out.print(a+"\t");
					    a--;
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
				
				
			