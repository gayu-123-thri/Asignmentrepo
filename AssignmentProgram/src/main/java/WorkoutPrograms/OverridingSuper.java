package WorkoutPrograms;

public class OverridingSuper extends OverridingReturn 
{
  public int addition()
	{
	  super.addition();
		
		if(c%10==0)
		{
			System.out.println("Addition number is divisible by 10");
		}
		else
		{
			System.out.println("Addition number is not divisible by 10");
		}
		
		return c;
		
	}

	public static void main(String[] args) 
	{
			OverridingSuper obj=new OverridingSuper();
			System.out.println("Sum is " +obj.addition());

	}

}
