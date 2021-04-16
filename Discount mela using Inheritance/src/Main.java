import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Privilege Customer\r\n" + "2)SeniorCitizen Customer");
		System.out.println("Enter Customer Type");
		int type = sc.nextInt();	
		//sc.nextLine();
		
		if(type==1) {
			sc.nextLine();
			System.out.println("Enter The Name");
			String name = sc.nextLine();
			System.out.println("Enter The Age");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter The Address");
			String ad = sc.nextLine();
			System.out.println("Enter The Mobile Number");
			String mobile = sc.nextLine();
			System.out.println("Enter The Purchased Amount");
			double amount = sc.nextDouble();
			PrivilegeCustomer p = new PrivilegeCustomer();
			p.setName(name);
			p.setAge(age);
			p.setAddress(ad);
			p.setMobileNumber(mobile);
			
			p.displayCustomer();
			System.out.format("Your bill amount is Rs %.1f. Your bill amount is discount under privilege customer\n",amount);
			System.out.format("You have to pay Rs %.2f", p.generateBillAmount(amount));
			
		}
		else if(type==2) {
			sc.nextLine();
			System.out.println("Enter The Name");
			String name = sc.nextLine();
			System.out.println("Enter The Age");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter The Address");
			String ad = sc.nextLine();
			System.out.println("Enter The Mobile Number");
			String mobile = sc.nextLine();
			System.out.println("Enter The Purchased Amount");
			double amount = sc.nextDouble();
			SeniorCitizenCustomer s = new SeniorCitizenCustomer();
			s.setName(name);
			s.setAge(age);
			s.setAddress(ad);
			s.setMobileNumber(mobile);
			
			s.displayCustomer();
			System.out.format("Your bill amount is Rs %.1f. Your bill amount is discount under senior citizen customer\n",amount);
			System.out.format("You have to pay Rs %.2f", s.generateBillAmount(amount));
			
		}
		else {
			System.out.println("Invalid Customer Type");
		}
	}

}
