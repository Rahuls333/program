package pattern;

public class s28
{
	public static void main(String[] args) 
	{
		int no=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no;k++)
			{
				System.out.print(k);
			}
			no++;
			space--;
			System.out.println();
		}
		
	}

}
