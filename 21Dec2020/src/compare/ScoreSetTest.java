package compare;

import java.util.*;
public class ScoreSetTest {

	public static void main(String[] args) {
		
		//Set<Score> set=new TreeSet<>(); //sorting on basis of Comparable
		 Set<Score> set=new TreeSet<>(new NameSort()); //will sort on basis of Comparator 
		
		set.add(new Score(88,"Nikita"));
		set.add(new Score(92,"Kathy"));
		set.add(new Score(76,"Atul"));
		set.add(new Score(94,"John"));
		set.add(new Score(98,"Manmeet"));
		
		System.out.println(set);
		

	}

}
