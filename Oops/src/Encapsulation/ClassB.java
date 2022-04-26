package Encapsulation;

import java.util.Scanner;

public class ClassB {
	Scanner sc = new Scanner(System.in);
	void assign() {
		ClassA obj = new ClassA();
		System.out.println("Enter the Student RollNo ");
		obj.setStudentRollNo(sc.nextInt());
		
		System.out.println("Enter the Student Name ");
		obj.setStudetName(sc.next());
		
		System.out.println("Student Roll No :"+obj.getStudentRollNo());
		System.out.println("student Name :"+obj.getStudetName());
	}

	public static void main(String[] args) {
		new ClassB().assign();
	}

}
