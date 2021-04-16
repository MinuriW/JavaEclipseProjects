import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        try {
            
            boolean []arr=new boolean[100];
            
            System.out.print("Enter the number of seats to be booked:");
            int n = sc.nextInt();
            
            
            for (int i = 1; i <=n; i++)
            {
              System.out.println("Enter the seat number " + i );
              int seat=sc.nextInt();
              
              arr[seat-1] =true;
              
            }
            
            System.out.println("The seats booked are:");
            
            for(int i=0; i<arr.length;i++)
            {
                if(arr[i])
                {
                    System.out.println(i+1);
                }
                
                
            }
                                            
        }catch(ArrayIndexOutOfBoundsException e)
            {
                
                System.out.println(e.toString());
            }
                
            
        
   }
    
}