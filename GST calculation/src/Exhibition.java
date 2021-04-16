class Exhibition extends Event {

private static int gst = 5;
private int noOfStalls;



public Exhibition(String name, String type, double costPerDay, int noOfDays, int noOfStalls) {
super(name, type, costPerDay, noOfDays);

this.noOfStalls=noOfStalls;

}


public double totalCost() {

return (noOfDays*costPerDay*gst/100)+costPerDay*noOfDays;

}


public String toString() {

return "Event Details"+ "\nName:" + this.name +"\nType:" +this.type + "\nNumber of stalls:"+this.noOfStalls +"\nTotal amount:"+ String.format("%.2f",totalCost());


}
}