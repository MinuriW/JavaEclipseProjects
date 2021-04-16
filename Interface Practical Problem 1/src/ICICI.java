public class ICICI implements Notification{

	public void notificationBySms() {
		System.out.println("ICICI - Notification By SMS");
	}

	@Override
	public void notificationByEmail() {
		System.out.println("ICICI - Notification By Mail");
		
	}

	@Override
	public void notificationByCourier() {
		System.out.println("ICICI - Notification By Courier");
		
	}

}