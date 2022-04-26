package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBCon3 {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the EmpId :");
			int eId = s.nextInt();
			
			System.out.println("Enter the EmpName :");
			String eName = s.next();
			
			System.out.println("Enter the EmpDesg :");
			String eDesg = s.next();
			
			System.out.println("Enter the EmpSal :");
			int bSal = s.nextInt();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp38", "root", "123456");
			Statement stm = con.createStatement();
			
			int k = stm.executeUpdate("insert into Emp values('"+eId+"', '"+eName+"', '"+eDesg+"', '"+bSal+"')");
			
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
