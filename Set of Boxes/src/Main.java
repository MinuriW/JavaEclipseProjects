import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Double> hs = new HashSet<Double>();
		
		System.out.println("Enter the number of Box");
		int n= Integer.parseInt(br.readLine());
		
		for(int i=1; i<n; i++){
			System.out.println("Enter the Box " + i+ " details");
			System.out.println("Enter Length");
			double length = Double.parseDouble(br.readLine());
			System.out.println("Enter Width");
			double width = Double.parseDouble(br.readLine());
			System.out.println("Enter Height");
			double height = Double.parseDouble(br.readLine());
			
			hs.addAll(hs);
			
		}
		System.out.println("Unique Boxes in the Set are");
	
	}
}