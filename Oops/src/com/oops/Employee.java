package com.oops;
import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	public void Emp() 
	{
		EmployeeInfo obj = new EmployeeInfo();
		System.out.println("Employee Name is: ");
		obj.setEmpName(sc.next());
		System.out.println("Employee Id is: ");
		obj.setEmpId(sc.nextInt());
		System.out.println("Employee Department is: ");
		obj.setEmpDept(sc.next());
		System.out.println("Employee Salary is: ");
		obj.setEmpSalary(sc.nextInt());
	}
	public static void main(String[] args) {
		new Employee().Emp();
	}

}
