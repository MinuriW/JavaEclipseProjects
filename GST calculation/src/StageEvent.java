class StageEvent extends Event{
 
private static int gst = 15;
private int noOfSeats;


public StageEvent(String name, String type, double costPerDay, int noOfDays, int noOfSeats) {
super(name, type, costPerDay, noOfDays);

this.noOfSeats= noOfSeats;
}


public double totalCost() {

double totalCost = noOfDays*costPerDay*gst/100 + costPerDay*noOfDays;
 

return totalCost;

}

public String toString() {
return "Event Details" + "\nName:" + this.name +"\nType:" +this.type + "\nNumber of seats:"+this.noOfSeats + "\nTotal amount:"+String.format( "%.2f",totalCost());

}
}