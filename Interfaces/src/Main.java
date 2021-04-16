import java.util.*;

public class Main
{
 public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.Current Account");
		System.out.println("2.Savings Account");
		int n=s.nextInt();
		
		System.out.println("Name");
		String name=s.next();
		
		System.out.println("Account Number");
		int account=s.nextInt();
		
		System.out.println("Account Balance");
		int accountBalance=s.nextInt();
		
		System.out.println("Enter the Start Date(yyyy-mm-dd)");
		String sdate=s.next();
		
		System.out.println("Enter the Years");
		int years=s.nextInt();
		
		CurrentAccount c = new CurrentAccount();
		SavingsAccount sa = new SavingsAccount();
		
		if(n == 1) {
		System.out.printf("Maintenance Charge For Current Account %.2f", c.computeMaintainanceCharge(years));
		}
		else if(n == 2) {
		System.out.printf("Maintenance Charge For Savings Account %.2f", sa.computeMaintainanceCharge(years));	
		}
	}  
}
