import java.io.*;

public class Main{
public static void main(String[] args) throws Exception {

BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));


System.out.println("Enter event name");
String name = sc.readLine();

System.out.println("Enter the cost per day");
double cost = Double.parseDouble(sc.readLine());
 

System.out.println("Enter the number of days");
int days = Integer.parseInt(sc.readLine());


System.out.println("Enter the type of event\n1.Exhibition\n2.Stage Event");
String type = sc.readLine();

int no = Integer.parseInt(type);

if(no == 1) {
System.out.println("Enter the number of stalls");
int noOfStalls = Integer.parseInt(sc.readLine());

Exhibition e = new Exhibition( name, "Exhibition", (double)cost,(int)days, (int)(noOfStalls));
System.out.println(e.toString());



} else if(no == 2) {
System.out.println("Enter the number of seats");
int seat = Integer.parseInt(sc.readLine());


StageEvent e=new StageEvent(name, "Stage Event", (double)cost, (int)days, (int)(seat));
System.out.println(e.toString());

}

else {
System.out.println("Invalid input");
}

}
}