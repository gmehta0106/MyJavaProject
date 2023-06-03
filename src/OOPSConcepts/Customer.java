package OOPSConcepts;

public class Customer {

	static final String CompName = "IBM";
	static final int SalaryProcessingDate = 15;
	int EmpID;
	String EmpName;
	byte Gender;
	int DOJ;
	String Department;
	String EmpType;
	int Salary;
	int ContactNum;
	String Address;

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.EmpID = 124578;
		c1.EmpName = "Peter";
		c1.Gender = 'M';
		c1.DOJ = 23012023;
		c1.Department = "Engineering";
		c1.EmpType = "Full Time";
		c1.Salary = 120000;
		c1.ContactNum = 1569874748;
		c1.Address = "43 house no, Toronto CA";

		System.out.println("Direct calling company name: " + CompName);
		System.out.println("Company name calling with class: " + Customer.CompName);
		System.out.println("Direct calling Salary processing date: " + SalaryProcessingDate);
		System.out.println("Salary processing date calling with class: " + SalaryProcessingDate);
		System.out.println("EmployeeID:" + c1.EmpID + " EmployeeName: " + c1.EmpName + " EmpGender: " + c1.Gender
				+ " EmpDOJ: " + c1.DOJ + " ContactNo.: " + c1.ContactNum + " Address: " + c1.Address);
		System.out.println(
				"EmployeeDepartment: " + c1.Department + " EmploymentType: " + c1.EmpType + " Salary: " + c1.Salary);

	}

}
