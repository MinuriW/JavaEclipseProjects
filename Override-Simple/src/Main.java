import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the event:");
		String name = sc.readLine();
		
		System.out.println("Enter the detail of the event:");
		String detail = sc.readLine();
		
		System.out.println("Enter the owner name of the event:");
		String ownerName = sc.readLine();
		
		System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");
		int type = Integer.parseInt(sc.readLine());
		
		if(type == 1) {
		System.out.println("Enter the number of stalls:");
		int noOfStalls = Integer.parseInt(sc.readLine());
		
		Exhibition e = new Exhibition(name,detail,ownerName,noOfStalls);
		System.out.printf("The projected revenue of the event is %.1f",e.projectRevenue());

		} else if(type == 2) {
		System.out.println("Enter the number of shows:");
		int noOfShows = Integer.parseInt(sc.readLine());
		
		System.out.println("Enter the number of seats per show:");
		int noOfSeatsPerShow = Integer.parseInt(sc.readLine());
		
		StageEvent e=new StageEvent(name,detail,ownerName,noOfShows,noOfSeatsPerShow);
		
		System.out.printf("The projected revenue of the event is %.1f",e.projectRevenue());
		}	
		else {
		System.out.println("Invalid input");
		}		
	}
}