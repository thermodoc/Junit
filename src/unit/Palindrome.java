package unit;

public class Palindrome
{
public boolean palindrome(String s)
	{
	
		for(int i =0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				return false;
			}
			
		}
	return true;
			
		
		
	}
}
