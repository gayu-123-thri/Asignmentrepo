package WorkoutPrograms;

public class InheritanceEmployeeSalary2 extends InheritanceEmployeeSalary1
{
	double hra=basicpay*0.05;
	double pf=basicpay*0.20;
	public void calcution()
	{
		System.out.println("HRA is "  +hra);
		System.out.println("PF is"  +pf);
	}
}
