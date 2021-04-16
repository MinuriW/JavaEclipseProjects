import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        

        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat ft=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        try {
            
             
             System.out.println("Enter the stage event start date and end date");
             Date d1=ft.parse(sc.readLine());
             Date d2=ft.parse(sc.readLine());
             
             String date1=ft.format(d1);
             String date2=ft.format(d2);
             
             System.out.println("Start date:"+date1);
             System.out.println("End date:"+date2);
           
        }
        
        catch(ParseException e)
        {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
            
        }
        
        
    }
}

 