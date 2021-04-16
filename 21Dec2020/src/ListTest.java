import java.util.*;
public class ListTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Amit");
		list.add("Sumit");
		list.add("Kathy");
		list.add("Java");
		list.add("HCL");
		list.add("Amit");
		
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.contains("HCL"));
//		List<String> l1 = new ArrayList<>();
//		l1.add("Amit");
//		l1.add("Kathy");
//		l1.add("HCL");
//		l1.add("Priya");
//		System.out.println(list.containsAll(l1));
////		list.retainAll(l1);
//		list.addAll(l1);
//		System.out.println(list);
		
		//Iterating a collection using iterator
		Iterator<String> itr = list.iterator();
		
//		while(itr.hasNext()) {
//			String str = itr.next();
//			System.out.println(str + "\t" + str.length() + "\t" + new StringBuffer(str).reverse());
//			
//		}
//		
//		//Iterating a collection using enhanced for loop
//		System.out.println("-----------using enhanced for loop----------");
//		
//		for(String k:list) {
//			System.out.println(k+"\t"+k.length()+"\t"+k.toUpperCase());
//		}
		
		System.out.println(list);
		System.out.println(list.get(3)); //output the 3rd element
		list.add(3,"DotNet"); //list.add(index, element) - replace an element
		System.out.println(list);
		list.set(3, "Cloud Computing"); //will add a new element as the 3rd element
		System.out.println(list);
	}
}
