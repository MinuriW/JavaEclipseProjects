import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     List<Customer> list = new ArrayList<>();
     CustomerBO b = new CustomerBO();
     String ch;
     
     do {
    	 System.out.println("Menu\r\n" + "1.Add Customer\r\n" + "2.Display Customer\r\n" + "3.Search Customer");
         System.out.println("Enter your choice");
         int choice = Integer.parseInt(br.readLine());
    	
         if(choice==1) {
    		System.out.println("Enter the Customer details in CSV format");
    		String str = br.readLine();
    		b.createCustomer(str, list);
    		System.out.println("Customer created successfully");
    	}
    	else if(choice==2) {
    		System.out.println("Customer Details");
    		System.out.println("Name  Email  PhoneNO");
    		b.display(list);
    	}
    	else if(choice==3) {
    		System.out.println("Enter e-mail id to search");
    		String email=br.readLine();
    		Customer c = b.searchCustomerFromList(email, list);
    		if(c==null) {
    			System.out.println("No customer found with given e-mail id");
    		}
    		else {
    			System.out.println("Customer Details");
    			System.out.println("Name  Email  PhoneNO");
    			System.out.println(c.getName()+"  "+c.getEmail()+"  "+c.getPhoneNO());
    		}
    	}
    	else {
    		System.out.println("Invalid choice");
    	}
    	System.out.println("Do you want to continue(y/n)?:");
    	 ch = br.readLine();
    	 if(ch.equals("n")) {
    		 break;
    	 }
    	
     }while(ch.equals("y"));
     
    }
}
