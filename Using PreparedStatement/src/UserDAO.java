import java.sql.*;
import java.util.*;
public class UserDAO {
   
    public void insertDetails(User u)   
    {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement pmt=null;
        
        try {
            con=DbConnection.getConnection();
           
            String query= "insert into \"user\" (name,contact_detail,username,password) values(?,?,?,?)";
            pmt=con.prepareStatement(query);
            pmt.setString(1, u.getName());
            pmt.setString(2, u.getContactDetail());
            pmt.setString(3, u.getUsername());
            pmt.setString(4, u.getPassword());      
            pmt.execute();           
        }catch(ClassNotFoundException ce) {ce.printStackTrace();}
        catch(SQLException se){se.printStackTrace();}
        finally
        {
            try {
                if(pmt!=null)
                {
                    pmt.close(); }
                if(rs!=null)
                {
                    rs.close();      }
                if(con!=null)
                {
                    con.close();          }
               
            }catch(SQLException se){se.printStackTrace();}
        }
    }

    public List<User> getAllUser() {
       
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        List<User> list=new ArrayList<>();
       
        try {
            con=DbConnection.getConnection();
            stmt=con.createStatement();
            String query="select *from \"user\"";
            rs=stmt.executeQuery(query);
           
            while(rs.next())
            {
                User u=new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                list.add(u);
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
       
   
 