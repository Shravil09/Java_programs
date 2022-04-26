
public class Multi extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t = new Multi();
		t.start();

	}

}
