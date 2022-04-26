import java.io.FileInputStream;

public class ClassA {
	void fileoperations() throws Exception
	{
		System.out.println("----FileOperation 1----");
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Java Notes\\iostreams\\file1.txt");
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data is read");
		fis.close();
	}

	public static void main(String[] args) throws Exception
	{
		ClassA obj = new ClassA();
		obj.fileoperations();

	}

}
