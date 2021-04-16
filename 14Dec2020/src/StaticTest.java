
public class StaticTest {
	int a;
	static int b;
	
	public StaticTest() {} //no argument constructor
	
	public StaticTest(int a) {
		this.a =a;
		b=b+a-3;
	}
	public void display() { //non static method, can access both instance as well as class variables
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static void dispB() {
		System.out.println("b="+b);
	}
	static void changeB() {
		b=b-5;
	}
	
	public static void main(String[] args) {
		StaticTest s1 = new StaticTest(10);
		StaticTest s2 = new StaticTest(15);
		s1.display(); //a=10 b=19
		s1.dispB(); //b=19
		s2.display(); //a=15 b=19
		s2.dispB();  //b=19
		dispB();//in a class from one method, you can call other method by writing name.
		StaticTest s3 = new StaticTest(25); //b=19+25-3 =41
		s3.changeB(); //b=b-5  b=41-5=36
		changeB(); //b=36-5=31
		
		s1.display(); //a=10 b=31
		s2.display(); //a=10 b=31
		s3.display(); //a=10 b=31
	}
}
