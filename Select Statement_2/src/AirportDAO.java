
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AirportDAO {
    
    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException{
        
        Connection con=null;
        ResultSet rs=null;
        Statement stmt=null;
        
        ArrayList<Airport> list = new ArrayList<>();
        
        try {
        	con=DBConnection.getConnection();
        	stmt = con.createStatement();
        	String query="select iata_airport_code,name,city,country_name from airport";
        	rs=stmt.executeQuery(query);
        	
        	while(rs.next()) {
        		Airport a = new Airport(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
        		list.add(a);
        	}
        }
        finally{
        	try {
        		if(stmt!=null) {
        			stmt.close();
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
