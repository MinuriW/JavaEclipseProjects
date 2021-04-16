import java.util.*;

public class Main {
    public static void main(String args[]){
        
        UserDAO userDao = new UserDAO();
        List<User> list = userDao.getAllUsers();       
        System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");    
        for(User u: list){
           System.out.format("%-5s %-5s %-15s %-10s %s\n", u.getId(), u.getName(), u.getContactDetail(), u.getUsername(), u.getPassword());
        }
 
    }                                                          
}