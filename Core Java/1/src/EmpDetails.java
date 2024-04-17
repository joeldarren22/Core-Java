import java.util.ArrayList;
public class EmpDetails 
{
	ArrayList<Employee> arr=new ArrayList<Employee>();
	public void addEmployee(int EMPID,String EMPNAME,String DESIGNATION,double BASIC)
	{
		arr.add(new Employee(EMPID,EMPNAME,DESIGNATION,BASIC,this.CalculateHRA(BASIC, DESIGNATION)));
	}
	

public double CalculateHRA(double BASIC,String DESIGNATION)
{
	double HRA=0.0;
	if(DESIGNATION=="Manager")
	{
		HRA = 0.1*BASIC;
	}
	if(DESIGNATION=="Officer")
	{
		HRA = 0.12*BASIC;
	}
	if (DESIGNATION=="CLERK")
	{
		HRA = 0.05*BASIC;
	}
	return HRA;
}	

public void printDetails() {
	for(Employee e: arr) {
		e.PrintDET();
	}
}
	
}
