import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Choose Event type");
        System.out.println("1.Exhibition");
        System.out.println("2.Stage Event");
        int choice= Integer.parseInt(br.readLine());
        
        if(choice==1) {
        	 System.out.println("Enter the details of Exhibition in CSV format");
             String str = br.readLine();
             String[] out = str.split(",");
             
             Exhibition e = new Exhibition(out[0], out[1], out[2], out[3], Integer.parseInt(out[4]));
             e.display();
        }
        else if(choice==2) {
       	 System.out.println("Enter the details of Stage Event in CSV format");
            String str = br.readLine();
            String[] out = str.split(",");
            
            StageEvent s = new StageEvent(out[0], out[1], out[2], out[3], Integer.parseInt(out[4]));
            s.display();
       }
        else {
        	System.out.println("Invalid choice");
        }
    }
}
