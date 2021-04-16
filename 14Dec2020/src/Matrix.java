import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements in 3X3 matrix");
		
		for(int i=0; i<3; i++) { //rows
			for(int j=0; i<3; j++) { //columns
				a[i][j] = sc.nextInt();
			}
		}
	   
		System.out.println("Enter matrix elements are: ");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	   
	}
}
