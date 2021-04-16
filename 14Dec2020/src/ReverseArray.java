import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		String[] names = new String[8];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 8 names");
		
		for(int i=0; i<8; i++) {
			names[i] = sc.nextLine();
		}
		for(int i=names.length-1; i>=0; i--) {
		System.out.println(names[i] + " ");
		}
	 }
  }

