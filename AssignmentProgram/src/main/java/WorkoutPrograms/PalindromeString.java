package WorkoutPrograms;

public class PalindromeString 
{

		public static void main(String[] args) 
		{
			String str="ugjhwbd";
			String rev="";
			char ch;
			
			
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i); //
				rev=ch+rev;
			}
			if(str.equals(rev))
			{
				System.out.println("String is Palindrome :"+str);
			}
			else
			{
	             System.out.println("String is not Palindrome:" +rev);
	    	}

	}

}
