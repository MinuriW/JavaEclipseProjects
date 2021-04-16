
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
    	AirportDAO dao = new AirportDAO();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName,airportCode,airportName,city;
        System.out.println("Enter the Airport Code :");
        airportCode = br.readLine();
        System.out.println("Enter the Airport name :");
        airportName = br.readLine();
        System.out.println("Enter the City :");
        city = br.readLine();
        System.out.println("Enter the Country name :");
        countryName = br.readLine();
        
        Airport air = new Airport(airportCode,airportName,city,countryName);
        dao.insertAirport(air);
        ArrayList<Airport> list = dao.listAirport();
        
        System.out.format("%-10s %-40s %-10s %s\n","IATA Code","Name","City","Country");
        
        for(Airport a:list) {
        	 System.out.format("%-10s %-40s %-10s %s\n",a.getIataAirportCode(),a.getName(),a.getCity(),a.getCountry());
        }
          
    }
}

