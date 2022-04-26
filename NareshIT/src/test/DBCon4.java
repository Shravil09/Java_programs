package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBCon4 {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Roll No :");
			int rollNo = s.nextInt();
			
			System.out.println("Enter the Std Name :");
			String stdName = s.next();
			
			System.out.println("Enter the Std Branch :");
			String stdBranch = s.next();
			
			System.out.println("Enter the std Address :");
			var stdAddress = s.nextInt();
			
			System.out.println("Enter the std Mail ID :");
			var stdMailId = s.nextInt();
			
			System.out.println("Enter the std Phone No :");
			int stdNO = s.nextInt();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp38", "root", "123456");
			Statement stm = con.createStatement();
			
			int k = stm.executeUpdate("insert into Emp values('"+rollNo+"', '"+stdName+"', '"+stdBranch+"', '"+stdAddress+"', '"+stdMailId+"', '"+stdNO+"')");
			
			if(k>0) 
			{
				System.out.println("Employee Detail Enter Successfully");
			}
			s.close();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
	}
	}
}
