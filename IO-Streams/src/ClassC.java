import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassC {
	void fileoperations3() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Java Notes\\iostreams\\pic1.png");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\Java Notes\\iostreams\\pic2.png");
		int i;
		while((i= fis.read()) != -1) 
		{
			fos.write(i);
		}
		fis.close();
		fos.close();
		System.out.println("Data Copied");
	}
	

	public static void main(String[] args) throws Exception
	{
		ClassC obj = new ClassC();
		obj.fileoperations3();
	}

}
