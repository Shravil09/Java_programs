public class ClassA implements Runnable {  
   
    public void run() { 
    	for(int i=1; i<=5;i++)
        System.out.println("Thread has ended"+i);  
    }  
   
    public static void main(String[] args) throws Exception {  
        ClassA ex = new ClassA();  
        Thread t1= new Thread(ex);  
        t1.start();
        Thread.sleep(20000);
//        System.out.println("Hi");  
    }  
}  