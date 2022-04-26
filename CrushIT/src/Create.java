import java.sql.*;

public class Create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/data");
		String username = "root";
		String password = "";
		String query = "create table student(id int, name varchar(20))";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		
		st.execute(query);
		
		System.out.println("Table created Successfully");
		
		con.close();
	}

}
