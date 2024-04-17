
public class Employee 
{
	private int EMPID;
	private String EMPNAME;
	private String DESIGNATION;
	private double BASIC;
	private double HRA;
	
	public Employee(int EMPID, String EMPNAME, String DESIGNATION,double BASIC,double HRA) 
	{
		super();
		this.EMPID=EMPID;
		this.EMPNAME=EMPNAME;
		this.DESIGNATION=DESIGNATION;
		this.BASIC=BASIC;
		this.HRA=HRA;
	}

	public int getEMPID() {
		return EMPID;
	}

	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	}

	public String getEMPNAME() {
		return EMPNAME;
	}

	public void setEMPNAME(String eMPNAME) {
		EMPNAME = eMPNAME;
	}

	public String getDESIGNATION() {
		return DESIGNATION;
	}

	public void setDESIGNATION(String dESIGNATION) {
		DESIGNATION = dESIGNATION;
	}

	public double getBASIC() {
		return BASIC;
	}

	public void setBASIC(double bASIC) {
		BASIC = bASIC;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}
	
	public void PrintDET()
	{

		System.out.println(this.getEMPID()+" ");
		System.out.println(this.getEMPNAME()+" ");
		System.out.println(this.getDESIGNATION()+" ");
		System.out.println(this.getBASIC()+" ");
		System.out.println(this.getHRA()+" ");
	}
	

}
