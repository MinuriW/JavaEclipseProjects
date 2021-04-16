import java.util.*;
public class Main {
	public static void main(String[] args)  {

		ItemTypeDAO itemDao = new ItemTypeDAO();
        List<ItemType> list = itemDao.getAllItemTypes(); 
        System.out.format("%-5s %-15s %-10s %s\n","ID","Name","Deposit","Cost per day");
        
        for(ItemType i:list)
        {
           
            System.out.format("%-5s %-15s %-10s %s\n",i.getId(),i.getName(),i.getDeposit(),i.getCostPerDay());
        }
       
    }
}