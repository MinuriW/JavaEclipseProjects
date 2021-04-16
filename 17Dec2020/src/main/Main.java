package main;
import static inter.PhysicalConstant.*;

public class Main {
	static void emc(double m) {
		double e = m*C*C;
		System.out.println("e="+e);
	}
	
	static void fg(double m1, double m2, double r) {
		double f = G*(m1*m2)/r*r;
		System.out.println("f="+f);
	}
	public static void main(String[] args) {
		
	}
}
