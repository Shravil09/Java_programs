package interview;

public class Multiplication {

	public static void main(String[] args) {
		int n = 2;
		for(int i=1; i<=10; i++) 
		{	
			//n = 2*i;
			if(i>2 && i<10) 
			{
				System.out.println(".");
			}
			else
			System.out.println(n+ "x" + i + "=" + n*i);
		}
	}

}
