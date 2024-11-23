class Pattern3
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			char x='a';
			char y='A';
			for(int j=1;j<=5;j++)
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
			        System.out.println();
		}
	}
}