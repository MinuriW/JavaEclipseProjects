public class Hall {
    private Long id;
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private User owner;
    public Hall(){}
   
    public Hall(String name, String contactNumber, Double costPerDay, User owner){
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.owner=owner;
    }
    public Long getId()
    {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getContactNumber(){
        return this.contactNumber;
    }
    public Double getCostPerDay(){
        return this.costPerDay;
    }
    public User getOwner(){
        return this.owner;
    }
    
    public void setId(Long id)
    {
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public void setCostPerDay(Double costPerDay){
        this.costPerDay=costPerDay;
    }
    public void setOwner(User owner){
        this.owner=owner;
    }

    @Override
    public String toString() {
        return String.format( "%-15s%-15s%-15s%-15s", name,contactNumber,costPerDay,owner.getName());
    }
    
}
 