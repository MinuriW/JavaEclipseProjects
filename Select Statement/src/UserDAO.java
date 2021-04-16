import java.sql.*;
import java.util.*;
 
public class UserDAO {
	public List<User> getAllUsers(){
		Connection con = null;
		ResultSet rs = null;
		Statement stmt=null;
		List<User> list = new ArrayList<>();
		try {
			con=DbConnection.getConnection();
			stmt=con.createStatement();
			String query = "select * from \"user\"";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				User u = new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				list.add(u);
			}
		}//try
		catch(ClassNotFoundException ce) {ce.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
		
		finally
		{
			try {
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {se.printStackTrace();}
		}
		return list;
	}
}
