import java.io.*;
public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException, ArrayIndexOutOfBoundsException, SeatNotAvailableException{ 
    	
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Enter the number of rows and columns of the show:");
        int n = Integer.parseInt(b.readLine());
        
        System.out.println("Enter the number of seats to be booked:");
        int seats = Integer.parseInt(b.readLine());

        int[] arr = new int[n*n];
        
        try {
            for(int i=1;i<=seats;i++) {
                
                System.out.println("Enter the seat number "+i);
                
                int seatNo = Integer.parseInt(b.readLine());
                
                if(arr[seatNo]!=1) {
                	
                    arr[seatNo] = 1;
                    
                } else {
                	
                    throw new SeatNotAvailableException("Already Booked");
                }     
            }  
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);    
        } 
        catch (SeatNotAvailableException e) {
            System.out.println("SeatNotAvailableException: Already Booked");
        } 
        finally {
            System.out.println("The seats booked are:");
            for(int j=0;j<n*n;j++) {
                System.out.print(arr[j]+" "); 
                if((j+1)%n==0) {
                    System.out.println();
                }
            }
        }
    }
}