import java.io.FileOutputStream;
import java.util.Scanner;

public class ClassB {
	void fileoperations2() throws Exception{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\Java Notes\\iostreams\\file2.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection Created");
		String data = sc.nextLine();
		byte arr[] = data.getBytes();
		fos.write(arr);
		System.out.println("Data Written");
		fos.close();
		sc.close();
	}

	public static void main(String[] args) throws Exception 
	{
		ClassB obj = new ClassB();
		obj.fileoperations2();
	}

}
