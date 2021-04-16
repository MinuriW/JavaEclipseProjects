import java.io.*;

 public class Main { 
    public static void main(String[] args) throws NumberFormatException, IOException{ 
       
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
     
    System.out.println("Enter your choice");
    System.out.println("1.Exhibition");
    System.out.println("2.StageEvent");
    int choice = Integer.parseInt(sc.readLine());
    
    if(choice == 1) {
        System.out.println("Enter the details in CSV format");
        String str = sc.readLine();
        
        String[] output = str.split(",");
        
        Exhibition e = new Exhibition(output[0],output[1],output[2],output[3],Integer.parseInt(output[4]),Double.parseDouble(output[5]));
        
        System.out.println("Exhibition Details");
        System.out.println("Event Name:"+e.name);
        System.out.println("Detail:"+e.detail);
        System.out.println("Type:"+e.type);
        System.out.println("Organiser Name:"+e.organiser);
        System.out.println("Total Cost:"+e.calculateAmount());
        
    } else if(choice == 2) {
        System.out.println("Enter the details in CSV format");
        String str = sc.readLine();
        
        String[] output = str.split(",");
        
        StageEvent e = new StageEvent(output[0],output[1],output[2],output[3],Integer.parseInt(output[4]),Double.parseDouble(output[5]));
        sc.readLine();
        System.out.println("Stage Event Details");
        System.out.println("Event Name:"+e.name);
        System.out.println("Detail:"+e.detail);
        System.out.println("Type:"+e.type);
        System.out.println("Organiser Name:"+e.organiser);
        System.out.println("Total Cost:"+e.calculateAmount());
        
    } else {
        System.out.println("Invalid choice");
        return;
    }
  
    } 
}