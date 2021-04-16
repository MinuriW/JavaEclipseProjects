
class Password
	   {
	     public void testEligibility(String username, String password)throws PasswordException
	      {
	       if(password.length() >= 6 && password.charAt(0)>= 65 && password.charAt(0)<= 90 && password.charAt(0)>= 48 && password.charAt(0)<= 57){
	          System.out.println("Hello " + username + "! Your password is accepted");
	        }
	      else
	       {
	        throw new PasswordException("Password does not meet the standards");
	       }
	         
	      }
	   }
