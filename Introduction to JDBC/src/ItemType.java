class ItemType{
    
    long id;
    String name;
    double deposit;
    double costPerDay;
    
    
    ItemType(long id, String name, double deposit, double costPerDay){
        
    this.id = id;
    this.name = name;
    this.deposit = deposit;
    this.costPerDay = costPerDay;
    
    }
    
    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }
    
    
    public double getDeposit() {
    return deposit;
    }

    public void setDeposit(Double deposit) {
    this.deposit = deposit;
    }
    
    public long getId() {
    return id;
    }

    public void setId(long id) {
    this.id = id;
    }
    
    public double getCostPerDay() {
    return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
    this.costPerDay = costPerDay;
    }
    
}


