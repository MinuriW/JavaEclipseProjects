import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        UserDAO dao=new UserDAO();
        
        
        System.out.println("Enter the user detail in CSV format");
        String str=br.readLine();
        
        String [] s=str.split(",");
        String name=s[0];
        String contact=s[1];
        String username=s[2];
        String password=s[3];
        
        
        User us=new User(name,contact,username,password);
        dao.insertDetails(us);
        
        List<User> list=dao.getAllUser();
        
        
        System.out.format("%-5s %-10s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
        for(User u:list)
        {
            System.out.format("%-5s %-10s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
        }
        
        
    }   
        
        
 }

 

