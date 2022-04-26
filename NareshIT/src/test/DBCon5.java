package test;
import java.sql.*;
import java.util.Scanner;

public class DBCon5 {

	public static void main(String[] args) 
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the EId :");
			int eId = sc.nextInt();
			
			System.out.println("Enter the EmpName :");
			String eName = sc.next();
			
			System.out.println("Enter the EmpDesg :");
			String eDesg = sc.next();
			
			System.out.println("Enter the EmpSalary :");
			Long bsal = sc.nextLong();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp39", "root", "123456");
			
			PreparedStatement ps = con.prepareStatement("insert into Emp values(?,?,?,?)");
			ps.setInt(1, eId);
			ps.setString(2, eName);
			ps.setString(3, eDesg);
			ps.setLong(4, bsal);
			
			int k = ps.executeUpdate();
			if(k>0) 
			{
				System.out.println("Detail inserted Successfully ");
			}
			sc.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
