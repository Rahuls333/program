package pattern;

public class s17 
{
	public static void main(String[] args)
	{
		int start=1;
		int space=3;
		
		
		for(int i=1;i<=4;i++)
		{
			int a=4;
			for( int j = 1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=start;k++)
			{
				System.out.print(a);
				a--;
				
			}
			space--;
			start++;
			
			
			System.out.println();
		}
		
		
	}

}
