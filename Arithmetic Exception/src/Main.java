import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the cost of the item for n days");
		int cost = sc.nextInt();

		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		System.out.println("Cost per day of the item is " + (cost/n));
		}catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		
	}

}
