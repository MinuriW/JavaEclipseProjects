package compare;
import java.util.*;
public class ScoreTest {

	public static void main(String[] args) {
	
		List<Score> list=new LinkedList<>();
		
		list.add(new Score(88,"Nikita"));
		list.add(new Score(92,"Kathy"));
		list.add(new Score(76,"Atul"));
		list.add(new Score(94,"John"));
		list.add(new Score(98,"Manmeet"));
		
		System.out.println(list);
		
		//Collections.sort(list); //Will sort the list based on the Comparable.compareTo()
		Collections.sort(list,new NameSort()); //will sort the list based on Comparator implementation NameSort.compare()
		System.out.println(list);
	}

}
