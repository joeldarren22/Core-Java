
public class MainApp 
{
	public static void main(String[] args) 
	{
		EmpDetails obj = new EmpDetails();
		obj.addEmployee(1,"Joe","Manager",40000);
		obj.addEmployee(2,"Joel","Officer",30000);
		obj.addEmployee(3,"Jo","Clerk",10000);
		obj.printDetails();
	}

}
