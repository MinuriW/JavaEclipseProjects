import java.util.Random;

public class PasswordThread extends Thread{
	
	String pass;
	public PasswordThread(String pass) {
		this.pass = pass;
	}
	
	public void run() {
		int r = new Random().nextInt();
		pass=pass+r;
		System.out.println("Password is : "+pass);
	}
}
