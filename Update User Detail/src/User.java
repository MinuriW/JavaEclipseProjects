public class User {
	private Long id;
    private String name;
    private String contactDetail;
    private String username;
    private String password;
    public User(){}
    public User(Long id,String name, String contactDetail, String username, String password){
        this.id=id;
        this.name=name;
        this.contactDetail=contactDetail;
        this.username=username;
        this.password=password;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getContactDetail(){
        return this.contactDetail;
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
    public void setContactDetail(String contactDetail){
        this.contactDetail=contactDetail;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
