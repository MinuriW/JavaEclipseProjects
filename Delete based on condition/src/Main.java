import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

 

public class Main {
    public static void main(String args[])throws Exception {
        
        UserDAO udao=new UserDAO();
        List<User>userList=new ArrayList<>();
        List<User>userList2=new ArrayList<>();
        
        User u=new User();
        Boolean isDelete;
        
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Username","Password");
        userList=udao.getAllUser();
        for(User u1:userList)
        {
            System.out.println(u1);
        }
        
        System.out.println("Enter the username to be deleted:");
        String username=br.readLine();
        isDelete=udao.deleteUser(username);
        if(isDelete==true)
        {
            System.out.println("User deleted successfully");
        }else {
            System.out.println("User not found");
        }
        
        System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Username","Password");
        userList2=udao.getAllUser();
        for(User u2:userList2)
        {
            System.out.println(u2);
        }
        
    
        
        
    }
}
 