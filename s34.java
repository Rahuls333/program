package pattern;

public class s34 
{
	public static void main(String[] args)
	{
		int n=3;
		System.out.print(n+" ");
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
				System.out.print(n+" ");
			}
			else
			{
				n=3*n+1;
				System.out.print(n+" ");
			}
		}
		
	}

}
