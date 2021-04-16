package compare;
import java.util.*;

public class EmployeeSetTest {

	public static void main(String[] args) {
		//Set<Employee> set = new HashSet<>();
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(1,"Kathy",78000,"Chennai"));
		set.add(new Employee(2,"John",120000,"Noida"));
		set.add(new Employee(5,"Neha",90000,"Delhi"));
		set.add(new Employee(1,"Sunil",78000,"Chennai"));
		
		System.out.println(set);
	}

}
