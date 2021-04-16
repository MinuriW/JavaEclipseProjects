import java.util.Scanner;

public class Main { 
    public static void main(String[] args){ 
       
    Scanner sc=new Scanner(System.in);
    
    
    System.out.println("Enter the name :");
    String name = sc.nextLine();
            
    System.out.println("Enter Date of Birth :");
    String dateOfBirth = sc.nextLine();
    
    System.out.println("Enter Gender :");
    String gender = sc.nextLine();
    
    System.out.println("Enter Mobile Number :");
    String mobileNumber = sc.nextLine();
    
    System.out.println("Enter Blood Group :");
    String bloodGroup = sc.nextLine();
    
    System.out.println("Enter Blood Bank Name :");
    String bloodBankName = sc.nextLine();
    
    System.out.println("Enter Donor Type :");
    String donorType = sc.nextLine();
    
    System.out.println("Enter Donation Date :");
    String donationDate = sc.nextLine();
    
    Donor d = new Donor();
    d.setName(name);
    d.setDateOfBirth(dateOfBirth);
    d.setGender(gender);
    d.setMobileNumber(mobileNumber);
    d.setBloodGroup(bloodGroup);
    d.setBloodBankName(bloodBankName);
    d.setDonorType(donorType);
    d.setDonationDate(donationDate);
    
    d.displayDonationDetails();
    } 
}