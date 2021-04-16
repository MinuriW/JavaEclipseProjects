import java.sql.*;
import java.util.*;
public class ItemTypeDAO {
	
	public List<ItemType> getAllItemTypes(){
		List<ItemType> itemList = new ArrayList<ItemType>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			con=DbConnection.getConnection();
			st=con.createStatement();
			String query="select * from item_type";
			rs=st.executeQuery(query);
			
			while(rs.next()) {
				ItemType i = new ItemType(rs.getLong(1), rs.getString(2),rs.getDouble(3),rs.getDouble(4));
				itemList.add(i);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(st!=null){
					st.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return itemList;
		
	}
}