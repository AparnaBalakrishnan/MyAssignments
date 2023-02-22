package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student Name : Aparna");
	}
	public void studentDept()
	{
		System.out.println("Student Department : MCA");
	}
	public void studentId()
	{
		System.out.println("Student Id : 200282601007");
	}
	public static void main(String[] args) {
		Student ob = new Student();
		ob.collegeName();
		ob.collegeCode();
		ob.collegeRank();
		ob.deptName();
		ob.studentName();
		ob.studentDept();
		ob.studentId();
		
	}

}
