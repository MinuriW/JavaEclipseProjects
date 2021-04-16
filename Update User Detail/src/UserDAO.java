import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class UserDAO {
    public void updateUser(User user){
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = DbConnection.getConnection();
            String query = "update \"user\" set contact_detail=? where id=?";
            
            ps = con.prepareStatement(query);
            ps.setString(1, user.getContactDetail());
            ps.setLong(2, user.getId());
            
            ps.executeUpdate();
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(con!=null) {
                    con.close();
                }if(ps!=null) {
                    ps.close();
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
 }
    public User findUserByUsername(String username){
        User user = null;
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try {
            con = DbConnection.getConnection();
            String query = "select * from \"user\" where username=?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                user = new User(rs.getLong(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(con!=null) {
                    con.close();
                }if(ps!=null) {
                    ps.close();
                }if(rs!=null) {
                    rs.close();
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return user;
    } 
    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<User>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        
        try {
            con = DbConnection.getConnection();
            st = con.createStatement();
            String query = "select * from \"user\"";
            rs = st.executeQuery(query);
            
            while(rs.next()) {
                User user = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                userList.add(user);
            }
            
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(con!=null) {
                    con.close();
                }if(st!=null) {
                    st.close();
                }if(rs!=null) {
                    rs.close();
                }
                
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return userList;
    }
}