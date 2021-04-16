import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        boolean yn;
        
        List <String> list=new ArrayList<>();
        int i=1;
        String ch;
        
        do{
            System.out.println("Enter the username "+i);
            String name = sc.readLine();
        
            System.out.println("Do you want to continue?(y/n)");
             ch =sc.readLine();
            
            i++;
            list.add(name);
        }
        while(ch.equals("y"));
        
        System.out.println("The Names entered are:");
            for(String k:list)
            {
                System.out.println(k);
            }
        } 
}
 