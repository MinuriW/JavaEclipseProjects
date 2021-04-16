import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Item<Integer> i_int = new Item<>();
		System.out.println("Enter a integer :");
		
		int n = sc.nextInt();
		i_int.set(n);
		
		Item<String> i_str = new Item<>();
		System.out.println("Enter a string :");
		sc.nextLine();
		
		String str = sc.nextLine();
		i_str.set(str);
		
		System.out.println("Integer Value :"+ i_int.get());
		System.out.println("String Value :"+i_str.get());
		
		
	}
}