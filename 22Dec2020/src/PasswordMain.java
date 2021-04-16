import java.io.*;
public class PasswordMain {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("Enter String to generate password");
		String str = br.readLine();
		
		PasswordThread p = new PasswordThread(str);
		p.start();
	}

}
