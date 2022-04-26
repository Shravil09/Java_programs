package test;
import java.sql.*;

public class DBCon1 {

	public static void main(String[] args) throws Exception
	{
		/*Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/data");
		String username = "root";
		String password = "123456";
		String query = "select*from book38";
		*/
		try 
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book38", "root", "123456");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select*from book");
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+ "\t"+rs.getString(2) + "\t" +rs.getString(3)+ "\t" +rs.getInt(4) + "\t" +rs.getInt(5));
			}
		}
		catch (Exception e) 
		{
			System.out.println("e.getMessage()");
		}
	}
}
