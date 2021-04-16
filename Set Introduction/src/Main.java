import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
    	Boolean yes;
    	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    	Set<String> hs  = new HashSet<String>();
    	
    	do{
		System.out.println("Enter the username");
		String uname = sc.readLine();
		System.out.println("Do you want to continue?(Y/N)");
		String yn = sc.readLine();
		
		hs.add(uname);
		if(yn.equals("Y")) {
			yes = true;
		}
		else {
			yes = false;
		}
	
    	}while(yes == true) ;
    	
		System.out.println("The unique number of usernames is "+ hs.size());
    
	}

}
