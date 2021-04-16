public class ContactDetailBO {
    public static void validate(String mobile,String AlternateMobile) throws DuplicateMobileNumberException
    {
      if(mobile.equals(AlternateMobile)) {
          throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
      } 
    }
}