package week2.day1;

public class EmployeeDetails {
	public void printEmployeeDetails(String empName,int empId){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId);
	}
	public void getEmployeeAddress(String empAddress){
		System.out.println("Employee Address = "+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee Salary = "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Phone Number = "+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails ob = new EmployeeDetails();
		ob.printEmployeeDetails("Aparna.B", 1007);
		ob.getEmployeeAddress("Ramapuram,chennai");
		ob.printEmployeeSalary(30.000);
		ob.printEmployeeMobileNumber(6756700008L);
			
	}
}
