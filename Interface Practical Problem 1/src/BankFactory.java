public class BankFactory {
	
	public ICICI getIcici() {
		ICICI c = new ICICI();
		return c;
	}
	
	public HDFC getHdfc() {
		HDFC h = new HDFC();
		return h;
	} 
}