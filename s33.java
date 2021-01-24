package pattern;

public class s33
{
	public static void main(String[] args) 
	{
	int star1=1;
		int space1=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print("*");
			}
			star1=star1+2;
			space1--;
			System.out.println();
		}
		
	
	 
	
		int star=5;
		int space=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println();
		}
	}
}
		
	




