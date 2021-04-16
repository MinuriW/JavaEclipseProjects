abstract class Test {
	
	int x;
	Test(){}
	Test(int x){
		this.x = x;
	}
	void sayHi() {
		System.out.println("Hi how r u?");
	}
	abstract void sayBye();
}

abstract class SubTest extends Test{
	int y;
	public SubTest() {}
	public SubTest(int x, int y) {
		super(x);
		this.y=y;
	}
	void sayBye() {
		System.out.println("bye");
	}
}

public class AbstractTest{
	public static void main(String[] args) {
		//Test t=new Test()   //Abstract class can not be instantiated
		
		Test t = new SubTest();
		t.sayHi();
		t.sayBye();
	}
}
