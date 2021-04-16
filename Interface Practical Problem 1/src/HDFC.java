public class HDFC implements Notification{

	@Override
	public void notificationBySms() {
		System.out.println("HDFC - Notification By SMS");
		
	}

	@Override
	public void notificationByEmail() {
		System.out.println("HDFC - Notification By Mail");
		
	}

	@Override
	public void notificationByCourier() {
		System.out.println("HDFC - Notification By Courier");
		
	}
}