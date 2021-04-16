import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Notification Setup");
		System.out.println("Please select your bank:");
		System.out.println("1)ICICI\r\n" + "2)HDFC"); 
		int bank = Integer.parseInt(reader.readLine());
		
		if(bank==1) {
			BankFactory b = new BankFactory();
			System.out.println("Enter the type of Notification you want to enter");
			System.out.println("1)SMS\r\n" + "2)Mail\r\n" + "3)Courier");
			int type = Integer.parseInt(reader.readLine());
			
			if(type==1) {
				b.getIcici().notificationBySms();}
			else if(type==2) {
				b.getIcici().notificationByEmail();}
			else if(type==3) {
				b.getIcici().notificationByCourier();	}
			else{
				System.out.println("Invalid Input");	}
		}
		else if(bank==2) {
			BankFactory b = new BankFactory();
			System.out.println("Enter the type of Notification you want to enter");
			System.out.println("1)SMS\r\n" + "2)Mail\r\n" + "3)Courier");
			int type = Integer.parseInt(reader.readLine());
			
			if(type==1) {
				b.getHdfc().notificationBySms();	}
			else if(type==2) {;
				b.getHdfc().notificationByEmail();}
			else if(type==3) {
				b.getHdfc().notificationByCourier();}
			else{
				System.out.println("Invalid Input");
			}
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}