import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
 
public class Main {
 
    		static TreeMap<Integer, Integer> tm = new TreeMap<>();
 
            public static void buyTickets(String price, String amount) {
 
                        int p = Integer.parseInt(price);
                        int amt = Integer.parseInt(amount);
                        Integer newAmt = 0;
                       
                        if(tm.containsKey(p)) {
                                    Integer existingBookedAmount = tm.get(p);
                                    newAmt = amt + existingBookedAmount;
                        }else {
                        	newAmt = amt;
                        }
                       
                        tm.put(p, newAmt);
 
            }
 
            public static void main(String[] args) throws IOException {
 
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
  
                    System.out.println("Enter the number of events:");
                    int noOfEvents = Integer.parseInt(reader.readLine());
 
                    System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
 
            	for (int i = 0; i < noOfEvents; i++) {
                    String CSV;
                    CSV = reader.readLine();
                    String[] eventDetails = CSV.split(",");
                    buyTickets(eventDetails[1], eventDetails[2]);
 
                }
 
                System.out.format("%-15s %s\n", "Ticket Price", "Tickets Booked");
   
                for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
                        System.out.format("%-15s %s\n", entry.getKey(), entry.getValue());
                    };
                   
       
        }
 
}