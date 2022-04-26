import java.sql.*;
public class DemoClass 
{
	public static void main(String[] args) throws Exception 
	{
		String url= "jdbc:mysql://localhost:3306/alien";
		String uname = "local instance";
		String pass = "";
		String query = "slect Sname from student where rollno = 2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("Sname");
		
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
