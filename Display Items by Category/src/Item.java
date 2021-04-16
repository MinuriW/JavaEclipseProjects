public class Item {
	private Long id;
    private String name;
    private ItemType itemType;
    private String vendor;
    public Item(){}
    public Item(Long id, String name, ItemType itemType, String vendor){
        this.id=id;
        this.name=name;
        this.itemType=itemType;
        this.vendor=vendor;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public ItemType getItemType(){
        return this.itemType;
    }
    public String getVendor(){
        return this.vendor;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setItemType(ItemType itemType){
        this.itemType=itemType;
    }
    public void setVendor(String vendor){
        this.vendor=vendor;
    }
}
