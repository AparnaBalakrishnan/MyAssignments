package org.student;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student Id = "+id);
	}
	public void getStudentInfo(String name)
	{
		System.out.println("Student Name = "+name);
	}
	public void getStudentInfo(char email)
	{
		System.out.println("Email = "+email);
	}
	public void getStudentInfo(long phonenumber)
	{
		System.out.println("Phone Number = "+phonenumber);
	}
	public static void main(String[] args) {
		Students ob = new Students();
		ob.getStudentInfo(1007);
		ob.getStudentInfo("Srimathi");
		ob.getStudentInfo("sri@gmail.com");
		ob.getStudentInfo(7835679086L);
	}

}
