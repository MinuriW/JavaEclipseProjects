public class User {
    private Long id;
    private String name;
    private String mobileNumber;
    private String username;
    private String password;
    public User(){}
    public User(Long id,String name,String mobileNumber,String username,String password){
        this.id=id;
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.username=username;
        this.password=password;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getMobileNumber(){
        return this.mobileNumber;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
   
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s",name, mobileNumber,username,password);
   
}
    }