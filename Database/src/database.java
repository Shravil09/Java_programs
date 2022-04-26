import java.sql.*;
public class database {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Success");
		String url = "jdbc:mysql://localhost:3306/data";
		String username = "root";
		String password = "";
		String query = "create table Student(sid int, sname varchar(100))";
	
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement();
		st.equals(query);
		
		conn.close();
		
		System.out.println("Connection created successfully");
	}

}
