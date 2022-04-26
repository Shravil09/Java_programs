package encapsulatoion;

import java.util.Scanner;

public class ClassB {
	Scanner sc = new Scanner(System.in);
	void assign() 
	{
		try{
			ClassA aobj = new ClassA();
		
		System.out.println("Please Enter your Roll No: ");
		aobj.setStudentRollNo(sc.nextInt());
		
		System.out.println("Please Ente  your Name: ");
		aobj.setStudentRollName(sc.next());
		
		System.out.println("Studnt Roll No :"+ aobj.getStudentRollNo());
		System.out.println("Student Name :"+ aobj.getStudentRollName());
		}
		catch (Exception e) {
			System.out.println("Enter only integer values");
		}
		
	}
	
	public static void main(String[] args) {
		ClassB bobj = new ClassB();
		bobj.assign();
		

	}

}
