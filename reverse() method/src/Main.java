import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<User> list = new ArrayList<>();
		
		System.out.println("Enter the number of users:");
		int n = Integer.parseInt(br.readLine());
		
	
		for(int i=1; i<=n ; i++) {
			System.out.println("Enter the details of User " + i);
			String details = br.readLine();
			String[] ud = details.split(",");
			list.add(new User(ud[0],ud[1],ud[2],ud[3]));
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		System.out.println("The user details in reverse order:");
		System.out.format("%-15s%-15s\n", "Name", "Mobile number");
		
		for(User u:list) {
			System.out.println(u);
		}
	}
}
