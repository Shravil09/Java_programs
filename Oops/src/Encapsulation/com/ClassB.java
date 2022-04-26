package Encapsulation.com;

import java.util.Scanner;

public class ClassB extends ClassA{
	Scanner sc  = new Scanner(System.in);
	void assign() 
	{
		ClassA aobj = new ClassA();
		System.out.println("Enter the Student Roll Number ");
		aobj.setStudentRollNo(sc.nextInt());
		
		System.out.println("Enter the Student Name : ");
		aobj.setStudentName(sc.next());
		
		System.out.println("Roll Number : " +aobj.getStudentRollNo());
		System.out.println("Name : "+aobj.getStudentName());
	}
	public static void main(String[] args) {
		new ClassB().assign();
	}
}
