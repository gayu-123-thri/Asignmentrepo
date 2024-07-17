package WorkoutPrograms;

public class InheritanceEmployeeSalary3 extends InheritanceEmployeeSalary2
{
	public void totalsalary()
	{
		double sal=basicpay+hra-pf-deduction+bonus;
		System.out.println("Total salary is " +sal);
		
	}

	public static void main(String[] args) 
	{
		InheritanceEmployeeSalary3 obj=new InheritanceEmployeeSalary3();
		obj.getsalary();
		obj.calcution();
		obj.totalsalary();		
	}

}
