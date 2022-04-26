package Encapsulation;

public class ClassA {
	private int studentRollNo;
	private String studetName;
	
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		System.out.println("Setter Method of Roll No Called");
		this.studentRollNo = studentRollNo;
	}
	public String getStudetName() {
		return studetName;
	}
	public void setStudetName(String studetName) {
		System.out.println("Setter method of Name Called");
		this.studetName = studetName;
	}
}
