import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        UserDAO userDao = new UserDAO();
        
        List<User> userList = userDao.getAllUsers();
        
        System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");  
        for(User u:userList) {
            System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
        }   
        System.out.println("Enter the username:");
        String username = sc.nextLine();
        
        User user = userDao.findUserByUsername(username);

        if(user!=null) {
            
            System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
            System.out.format("%-5s %-5s %-15s %-10s %s\n",user.getId(),user.getName(),user.getContactDetail(),user.getUsername(),user.getPassword());
            
            System.out.println("Enter the mobile number to be updated:");
            String mobileNumber = sc.nextLine();
            
            User updateUser = new User(user.getId(), user.getName(), mobileNumber, user.getUsername(), user.getPassword());
            
            userDao.updateUser(updateUser);
            user = userDao.findUserByUsername(updateUser.getUsername());
            
            System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
            System.out.format("%-5s %-5s %-15s %-10s %s\n",user.getId(),user.getName(),user.getContactDetail(),user.getUsername(),user.getPassword());
            
        }else {
            System.out.println("No such user is present");
        }
    }
}