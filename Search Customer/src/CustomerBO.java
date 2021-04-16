import java.util.List;

public class CustomerBO {
	
   public void createCustomer(String customerDetails,List<Customer> customerList) {
	   String [] custArr = customerDetails.split(",");
	   Customer c = new Customer(custArr[0],custArr[1],custArr[2]);
	   customerList.add(c);
    }
    public void display(List<Customer> customerList) {
        for(Customer k:customerList) {
        	System.out.println(k.getName()+"  "+k.getEmail()+"  "+k.getPhoneNO());
        }
    }
    public Customer searchCustomerFromList(String email,List<Customer> customerList){
    	for(Customer c:customerList) {
        if(c.getEmail().equals(email)) 
        	return c;
    }
    return null;
    }
}

