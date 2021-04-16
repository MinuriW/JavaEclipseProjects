import java.io.*;
public class Main { 
    public static void main(String[] args) throws IOException{ 
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter User Details(HolderName,Account Number,IFSC code,Contact Number)");        
    	String str=br.readLine();
    	
    	String[] out= str.split(",");
    	
    	System.out.println("Enter Account Type");
    	String type= br.readLine();
    	
    	if(type.equals("saving")) {
    		SavingAccount s = new SavingAccount(out[0],Long.parseLong(out[1]),out[2],Long.parseLong(out[3]), Double.parseDouble(out[4]));
    		double interest = Double.parseDouble(out[4]); 
    		System.out.println("Enter Interest Rate");
    		interest = Double.parseDouble(br.readLine());
    		s.display();
    		
    	}
    	else if(type== "current") {
    		CurrentAccount c = new CurrentAccount(out[0],Long.parseLong(out[1]),out[2],Long.parseLong(out[3]), out[4], Long.parseLong(out[5]));
    		System.out.println("Enter organization Name");
    		out[4] = br.readLine();
    		c.display();
    	}
    	else {
    		System.out.println("Enter valid Account Type");
    	}
    } 
}