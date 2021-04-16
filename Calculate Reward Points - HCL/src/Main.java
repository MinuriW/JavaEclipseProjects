import java.util.Scanner;

public class Main { 
    public static void main(String[] args){ 
    	
    	boolean yes = true;
		Scanner sc = new Scanner(System.in);

		while(yes==true) {
			System.out.println("Enter the transaction detail");
			String str = sc.nextLine();
			String in[] = str.split(",");

			String type = in[0];
			double amount = Double.parseDouble( in[1]);
			String cardType = in[2];

			if(cardType.equals("VISA card")){

				VISACard v = new VISACard();
				System.out.format("Total reward points earned in this transaction is "+"%.2f\n",v.computeRewardPoints(type, amount));					

			} else if(cardType.equals("HPVISA card")) {

				HPVISACard h = new HPVISACard();
				System.out.format("Total reward points earned in this transaction is "+"%.2f\n",h.computeRewardPoints(type, amount));					
			}
			else {
				System.out.println("Invalid data");
			}
			System.out.println("Do you want to continue?(Yes/No)");
			String yn = sc.nextLine();

			if(yn.equals("Yes")) {
				yes=true;
			}
			else {
				yes=false;
				break;
			}
		}
    	
    } 
}
