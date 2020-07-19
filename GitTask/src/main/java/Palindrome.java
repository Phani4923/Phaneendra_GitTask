import java.util.*;
public class Palindrome {

	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean flag=true;
		int len=s.length();
		for(int i=0;i<len/2;i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
	}
}
