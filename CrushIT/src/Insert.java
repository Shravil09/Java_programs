import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/data");
		String username = "root";
		String password = "";
		String query = "insert into student values(1, 'Shravil Bhagwat')";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		
		int n = st.executeUpdate(query);
		
		System.out.println(n+ " Row Affected...");
		
		con.close();
	}

}
