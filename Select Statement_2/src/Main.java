import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
                
        AirportDAO dao=new AirportDAO();
        ArrayList<Airport> Arraylist = dao.listAirport();
        System.out.println("Airport details");
        
        System.out.format("%-10s %-40s %-10s %s\n","IATA Code","Name","City","Country");
        
        for(Airport a: Arraylist) {
        	 System.out.format("%-10s %-40s %-10s %s\n",a.getIataAirportCode(),a.getName(),a.getCity(),a.getCountry());        }
        
    }
}

