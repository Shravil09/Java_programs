package abstraction;

public class Student {
	int id;
	String name;
	
	Student(){
		System.out.println("This is default constructor");
	}
	Student(int i, String n)
	{
		id= i;
		name=n;
	}
	public static void main(String[] args) {
		Student obj =new Student();
		System.out.println("This Parameterized constructor");
	}

}
