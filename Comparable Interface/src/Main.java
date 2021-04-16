import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		ArrayList<Address> ad = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of users:");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		
		for(int i=1; i<n+1;i++) {
			String details = br.readLine();
			String [] str = details.split(",");
			ad.add(new Address(str[0],str[1],str[2],Integer.parseInt(str[3])));

		}
		
		Collections.sort(ad);
	
		System.out.println("User Details:");
		
		for(Address a:ad) {
			System.out.println(a.getUsername()+","+a.getAddressLine1()+","+a.getAddressLine2()+","+a.getPinCode());
		}
	}
}
