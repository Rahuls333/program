package pattern;

public class s32 
{
	public static void main(String[] args) 
	{
		int star=7;
		int space=0;
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