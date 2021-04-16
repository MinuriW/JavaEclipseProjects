
public class Customer {
	private	String name;
	private	String address;
	private	Integer age;
	private	String mobileNumber;
	

	void displayCustomer() {
		System.out.println("Bill Details");
		System.out.println("Name " + getName());
		System.out.println("Mobile " + getMobileNumber());
		System.out.println("Age " + getAge());
		System.out.println("Address "+ getAddress());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
