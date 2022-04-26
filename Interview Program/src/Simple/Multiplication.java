package Simple;

public class Multiplication {

	public static void main(String[] args) {
		int t =  2;
		for(int i= 1; i<=10; i++) 
		{
			if(i>2 && i<10) 
			{
				System.out.println(".");
			}
			else
			System.out.println(t +"x" + i +"=" + t*i);
		}
	}

}
