import java.sql.*;
import java.util.*;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
		ResourceBundle rb = ResourceBundle.getBundle("oracle");
		String url = rb.getString("db.url");
		String user = rb.getString("db.username");
		String pass = rb.getString("db.password");
        
        Connection con= DriverManager.getConnection(url,user,pass);
        return con;
    }
}
