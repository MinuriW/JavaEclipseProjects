import java.sql.*;
import java.util.*;

public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes() {
			Connection con = null;
			ResultSet rs = null;
			Statement stmt=null;
			List<ItemType> list = new ArrayList<>();
			try {
				con=DbConnection.getConnection();
				stmt=con.createStatement();
				String query = "select * from item_type";
				rs = stmt.executeQuery(query);
				
				while(rs.next()) {
					ItemType i = new ItemType(rs.getLong(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
					list.add(i);
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