import java.util.Scanner;

public class MaxMin {
		public static void main(String[] args) {
			int[] a = new int[5];
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 5 integers");
			
			for(int i=0; i<5; i++) {
				a[i] = sc.nextInt();
			}
			 int max = a[0];
			 for(int i=1; i < a.length; i++){
			    if(a[i] > max){
			      max = a[i];
			    }
			  }
			
			  int min = a[0];
			  for(int i=1;i<a.length;i++){
			    if(a[i] < min){
			      min = a[i];
			    }
			  }  
			System.out.println("Maximum : "+max);
			System.out.println("Minimum : "+min);
		
		}
}
