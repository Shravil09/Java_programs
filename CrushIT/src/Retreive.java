import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retreive {

	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/data");
		String username = "root";
		String password = "";
		String query = "select * from student where id=1";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) 
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			System.out.println(id +" : " + name);
		}
		con.close();
		
		
	}

}
