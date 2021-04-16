package compare;
import java.util.Comparator;

public class NameSort implements Comparator<Score>
{
 @Override
 public int compare(Score s1,Score s2)      
   {
     return s1.getName().compareTo(s2.getName());
   }

}
 
