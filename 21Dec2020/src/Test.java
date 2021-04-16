import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
			if(str.equals("Two")) {
				list.add("Three");
			}
		}
	}
}
