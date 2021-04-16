import java.sql.*;
public class UserDAO {
    User getUser(String username)
    {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement pmt=null;
        
        try {
            
            con=DbConnection.getConnection();
            String query="select * from \"user\"where username=?";
            pmt=con.prepareStatement(query);
            pmt.setString(1,username);
            rs=pmt.executeQuery();
            
            while(rs.next())
            {
                User user=new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                return user;
            }  
            
        }
        
        catch(SQLException se) {se.printStackTrace();}
        catch(ClassNotFoundException e) {e.printStackTrace();}
        
        finally
        {
            try {

                if(pmt!=null)
                {
                    pmt.close();
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
        
        return null;
    }
}
 