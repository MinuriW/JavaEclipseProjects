import java.sql.*;
import java.util.*;
public class AirportDAO {
    public void insertAirport(Airport airportIns) throws ClassNotFoundException, SQLException{
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps =null;
        
        try {
        	con=DBConnection.getConnection();
        	String query = "insert into airport (iata_airport_code,name,city,country_name) values (?,?,?,?) ";
        	ps=con.prepareStatement(query);
        	ps.setString(1, airportIns.getIataAirportCode());
        	ps.setString(2, airportIns.getName());
        	ps.setString(3, airportIns.getCity());
        	ps.setString(4, airportIns.getCountry());
        	ps.executeUpdate();
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }catch(SQLException se) {
        	se.printStackTrace();
        }finally {
        	try {
        		if(ps!=null) {
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
    
    
    }
    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException{
    	Connection con = null;
        ResultSet rs = null;
        Statement st =null;
        ArrayList<Airport> list = new ArrayList<>();
        try {
        	con=DBConnection.getConnection();
        	st=con.createStatement();
        	String query = "select iata_airport_code,name,city,country_name from airport";
        	rs= st.executeQuery(query);
        	
        	while(rs.next()) {
        		Airport a = new Airport(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
        		list.add(a);
        	}
        	
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }catch(SQLException se) {
        	se.printStackTrace();
        }finally {
        	try {
        		if(st!=null) {
        			st.close();
        		}
        		if(rs!=null) {
        			rs.close();
        		}
        		if(con!=null) {
        			con.close();
        		}
        	}catch(SQLException e) {e.printStackTrace();}
        }
        return list;
    }
}
