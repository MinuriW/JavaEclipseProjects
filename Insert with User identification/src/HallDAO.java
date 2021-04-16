import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HallDAO {
    
    public void saveHall(Hall hall) {
        Connection con=null;
        PreparedStatement pmt=null;
        
        try {
            con=DbConnection.getConnection();
            String query="insert into hall(name,contact_detail,cost_per_day,owner_id) values (?,?,?,?)";
            pmt=con.prepareStatement(query);
            pmt.setString(1,hall.getName());
            pmt.setString(2,hall.getContactNumber());
            pmt.setDouble(3,hall.getCostPerDay());
            pmt.setLong(4,hall.getOwner().getId());
            
            pmt.executeUpdate();
     
        }catch(ClassNotFoundException ce) {ce.printStackTrace();}
        catch(SQLException se){se.printStackTrace();}
        finally
        {
            try {
                if(pmt!=null)
                {
                    pmt.close();
                }
            
                if(con!=null)
                {
                    con.close();
                }         
            }catch(SQLException se){se.printStackTrace();}
        }
    
    }
    
    public List<Hall> getAllHall() {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        List<Hall> list=new ArrayList<>();
        UserDAO userDao=new UserDAO();
        User user=new User();
        
        try {
            con=DbConnection.getConnection();
            stmt=con.createStatement();
            String query="select hall.id,hall.name,hall.contact_detail,hall.cost_per_day,\"user\".username from hall,\"user\" WHERE hall.owner_id=\"user\".id";                         ;
            rs=stmt.executeQuery(query);
            
            while(rs.next())
            {
                Hall h=new Hall();
                h.setId(rs.getLong(1));
                h.setName(rs.getString(2));
                h.setContactNumber(rs.getString(3));
                h.setCostPerDay(Double.parseDouble(rs.getString(4)));
                user =userDao.getUser(rs.getString(5));
                
                h.setOwner(user);
                
                list.add(h);
            
                
            }//while
            
        }//end try
        
        catch(ClassNotFoundException ce) {ce.printStackTrace();}
        catch(SQLException se) {se.printStackTrace();}
        
        finally {
            try 
            {
                if(stmt!=null)
                {
                    stmt.close();
                }
                if(rs!=null)
                {
                    rs.close();
                }
                if(con!=null)
                {
                    con.close();
                }
                
            
            }catch(SQLException se) {se.printStackTrace();}
        }
        
        return list;
    
    }    
    
}
 