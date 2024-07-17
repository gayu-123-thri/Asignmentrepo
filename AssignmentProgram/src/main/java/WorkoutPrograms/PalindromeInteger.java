package WorkoutPrograms;

public class PalindromeInteger 
{

	public static void main(String[] args) 
	{
		int num=122;
		int rev=0;
		int num1=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
		    num=num/10;
		}
		if(num1==rev)
		{
			System.out.println("Integer is Palindrome :"+num1);
		}
		else
		{
             System.out.println("Integer is not Palindrome:" +rev);
    	}
	}
}

