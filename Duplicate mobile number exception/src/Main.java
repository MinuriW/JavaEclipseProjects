import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{
        //Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contact details");
        String st=br.readLine();
        String[] str=st.split(",");
       
        try {
            ContactDetailBO.validate(str[0],str[1]);
            ContactDetail cd = new ContactDetail(str[0],str[1],str[2],str[3],str[4]);
            System.out.println(cd.toString());
           
        } catch (DuplicateMobileNumberException e){
            System.out.println(e);
        }
       
       
       
       
       
   
    }
}