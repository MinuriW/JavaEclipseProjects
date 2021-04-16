import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println("Choose Stall Type");
    	System.out.println("1)Gold Stall");
    	System.out.println("2)Premium Stall");
    	System.out.println("3)Executive Stall");
        int t = Integer.parseInt(sc.readLine());;

    	if(t==1) {
    		System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
        	String str = sc.readLine();
        	String[] out = str.split(",");
        	
        	GoldStall g = new GoldStall(out[0],Integer.parseInt(out[1]),out[2],Integer.parseInt(out[3])); 	
        	g.display();
    	}
    	else if(t==2) {
    		System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
        	String str = sc.readLine();
        	String[] out = str.split(",");
        	
        	PremiumStall p = new PremiumStall(out[0],Integer.parseInt(out[1]),out[2],Integer.parseInt(out[3]));
        	p.display();
    	}
    	else if(t==3) {
    		System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
        	String str = sc.readLine();
        	String[] out = str.split(",");
        	
        	ExecutiveStall e = new ExecutiveStall(out[0],Integer.parseInt(out[1]),out[2],Integer.parseInt(out[3]));
        	e.display();
    	}
    	else {
    		System.out.println("Invalid Stall Type");
    	}
	}
}
