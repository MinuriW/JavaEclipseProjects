import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Details");
		System.out.println("Account No:");
		int ano = sc.nextInt();
		sc.nextLine(); //to take the enter
		System.out.println("Account Holder Name:");
		String name = sc.nextLine();
		System.out.println("Initial Balance:");
		double bal = sc.nextDouble();
		System.out.println("PIN:");
		int pin = sc.nextInt();
		
		Account acc = new Account(ano,name,bal,pin);
		int ans =1;
		while(ans==1)
		{
		System.out.println("1. Deposit\n2. Withdraw\n3. Balance Inquiry\n4. Account Details\n");
		
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("Enter amount to deposit:");
			  	double amt=sc.nextDouble();
			  	acc.deposit(amt);
			  	break;
		case 2:System.out.println("Enter Amount to withdraw:");
				amt=sc.nextDouble();
				double wa=acc.withdraw(amt);
				System.out.println("INR"+wa+" has been withdrawn.");
				break;
		case 3:acc.balEnq();
				break;
		//case 4:acc.
		case 4:System.exit(0);
		
		}
	  } //end of while loop
	}
}

