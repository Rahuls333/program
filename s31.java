package pattern;

public class s31 
{
	public static void main(String[] args) 
	{
		int star=4;
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
			star--;
			space++;
			System.out.println();
		}
		
	}

}
