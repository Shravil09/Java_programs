package staticprogram;

class Eeg{
	int i=10;
	static int j=20;
	void test(){
		System.out.println(i);
		}
	static void test1()
	{
		System.out.println(j);
	}
}
	public class E{
		public static void main(String...args){
			Eeg Eeg1 = new Eeg();
			System.out.println(Eeg1.i);
			Eeg1.test();
			Eeg.test1();
		}	
	}	
