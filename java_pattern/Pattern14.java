class Pattern14
{
	public static void main(String[] args)
	{
		int x=15;
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(x+"\t");
				x--;					
			}
			System.out.println();
		}			
	}
}
				
				
			