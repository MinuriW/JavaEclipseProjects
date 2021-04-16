import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {
	public Event getEventById(Long id) {
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		try {
			con=DbConnection.getConnection();
			String query="select * from event where id=?";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Event e = new Event(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getDate(5),rs.getString(6));
				return e;
			}
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		
		catch(SQLException e) {e.printStackTrace();}
		
		finally {
			try {
				if(ps!=null){
					ps.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(con!=null) {
					con.close();
				}
				}catch(SQLException e) {e.printStackTrace();}
		}
		return null;
		}

	public void updateEvent(Event e) {
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		try {
			con=DbConnection.getConnection();
			String query="update event set id where id=?";
			ps = con.prepareStatement(query);
			ps.setLong(1, e.getId());
			ps.executeUpdate();
		
		}
		catch(ClassNotFoundException ce) {ce.printStackTrace();}
		
		catch(SQLException se) {se.printStackTrace();}
		
		finally {
			try {
				if(ps!=null){
					ps.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(con!=null) {
					con.close();
				}
				}catch(SQLException se) {se.printStackTrace();}
			}
		}
	
	public List<Event> getAllEvents(){
		List<Event> eventList = new ArrayList<Event>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con=DbConnection.getConnection();
			st=con.createStatement();
			String query="select * from event";
			rs= st.executeQuery(query);
			
			while(rs.next()) {
				Event e = new Event(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getDate(5),rs.getString(6));
				eventList.add(e);
			}
		
		}
		catch(ClassNotFoundException ce) {ce.printStackTrace();}
		
		catch(SQLException se) {se.printStackTrace();}
		
		finally {
			try {
				if(st!=null){
					st.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(con!=null) {
					con.close();
				}
				}catch(SQLException se) {se.printStackTrace();}
			}
		
		return eventList;
	}
}