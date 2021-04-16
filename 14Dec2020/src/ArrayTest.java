import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers");
		
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The values entered are: ");
		int sum=0;
		for(int i=0; i<5;i++) {
			System.out.println(a[i]+"\t");
			sum+=a[i];
		}
		System.out.println("\nSum : "+sum);
	}
}

