
public class Test extends Thread {
	public void run() {
		System.out.println("Child Thread");
		System.out.println("Child Thraed Priority: "+ Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread New Priority: "+Thread.currentThread().getPriority());
		Test t =new Test();
		t.start();
	}
}
