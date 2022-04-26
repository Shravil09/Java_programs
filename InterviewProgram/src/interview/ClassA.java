package interview;
import java.util.Scanner;

public class ClassA {
	/* 1.
	 int avl_amount = 10000;
	
	void wd_amount(int amount) 
	{
		if(avl_amount<amount) 
		{
			throw new RuntimeException("Insuficient Amount");
		}
		else
			System.out.println("Transaction Successful....");
	}
	*/
	/* 2
	  void meth1()throws Exception

	{
		FileReader fr = new FileReader("E:\\Java Notes\\iostreams\\file1.txt");
		int i;
		while((i=fr.read())!=1)
		{
			System.out.println((char)i);
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		//aobj.wd_amount(40000);
		
		try 
		{
			aobj.meth1();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
*/
	public static void main(String[] args) {
		String yn;
		do
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number :");
	int n1 = sc.nextInt();
	System.out.println("Enter the Second Number :");
	int n2 = sc.nextInt();
	System.out.println("Select Operator(+,-,*,/)");
	String sys = sc.next();
	int res;
	
	switch (sys) {
	case "+" :res = n1+n2;
	System.out.println("Addition = "+res);
	break;
	
	case "-" :res = n1-n2;
	System.out.println("Substraction = "+res);
	break;

	case "*" :res = n1*n2;
	System.out.println("Multiplication = "+res);
	break;
	
	case "/" :res = n1/n2;
	System.out.println("Division = "+res);
	break;
	default: System.out.println("Invalid Symbol");
		break;
	}
	System.out.println("Do you want to continue(Press y for Yes and n for No)");
	yn = sc.next();
	}
	while(yn.equals("y") || yn.equals("y"));
	}
}