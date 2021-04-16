
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("HCL");
		
		sb.append(" Technologies");
		System.out.println(sb);
		System.out.println(sb.substring(4));
		sb.reverse();
		System.out.println(sb);
		
		//add all the alphabets in a string
		StringBuffer sb1 = new StringBuffer("");
		for(int i=65; i<=90; i++) {
			sb1.append((char)i);
		}
		System.out.println(sb1);
	}
}
