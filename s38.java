package pattern;

public class s38
{
	public static void main(String[] args) 
	{
		String s1="abc1233@#$$#976";
		String s2="";
		String s3="";
		String s4="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
			{
				s2=s2+s1.charAt(i);
			}
			else if(Character.isDigit(s1.charAt(i)))
			{
				s3=s3+s1.charAt(i);
			}
			else
			{
				s4=s4+s1.charAt(i);
			}
		}
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		String s5="";
		
		for(int i=s2.length()-1;i>=0;i--)
		{
		s5=s5+s2.charAt(i);	
		}
		System.out.println(s5);
	
		int no=Integer.parseInt(s3);
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}
	

}
