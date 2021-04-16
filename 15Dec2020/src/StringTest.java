
public class StringTest {
	public static void main(String[] args) {
	String s1 = "HCL Technologies";
	String s2 = "Technologies";
	String s3 = "technologies";
	System.out.println(s1.length());
	System.out.println(s1.equals(s2));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s1.substring(4,8));
	System.out.println(s1.substring(4));
	System.out.println(s1.replace("o", "#"));
	System.out.println(s1);
	System.out.println(s1.indexOf('0')); //returns index of first occurence of o
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.endsWith("gie"));
	System.out.println(s1.startsWith("ABC"));
	
	String s4 = "   Java Full Stack   ";
	System.out.println(s4);
	System.out.println(s4.trim());
	
}
}
