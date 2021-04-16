import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 

public class UserDAO {
    public List<User> getAllUser() {

    	Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        List<User> ulist=new ArrayList<>();  
        try {
            con=DbConnection.getConnection();
            stmt=con.createStatement();
            String query="select *from \"user\"";
            rs=stmt.executeQuery(query);
            
            while(rs.next())
            {
                User u=new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                ulist.add(u);
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
        
        return ulist;
    }    
    
    public Boolean deleteUser(String username) {

        Connection con=null;
        PreparedStatement pmt=null;
         
        try {
            con=DbConnection.getConnection();
            
            String query="delete from \"user\" where username=?";
            pmt=con.prepareStatement(query);
            pmt.setString(1,username);
            int n=pmt.executeUpdate();

            if(n>0)
            {
                return true;
            }else {
                return false;
            }
            
        }//end try
        
        catch(ClassNotFoundException ce) { }
        catch(SQLException se) {}
        
        finally {
            try 
            {
                if(pmt!=null)
                {
                    pmt.close();
                }
                
                if(con!=null)
                {
                    con.close();
                }
                
            
            }catch(SQLException se) {se.printStackTrace();}
        }
        
        return false;
    
    }    
    
}