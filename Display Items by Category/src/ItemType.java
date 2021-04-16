public class ItemType {
	private Long id;
    private String name;
    private Double deposit;
    private Double costPerDay;
    public ItemType(){}
    public ItemType(Long id, String name, Double deposit, Double costPerDay){
        this.id=id;
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=costPerDay;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Double getDeposit(){
        return this.deposit;
    }
    public Double getCostPerDay(){
        return this.costPerDay;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDeposit(Double deposit){
        this.deposit=deposit;
    }
    public void setCostPerDay(Double costPerDay){
        this.costPerDay=costPerDay;
    }
}
