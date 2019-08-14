public class Kata 
{
  public static boolean validPhoneNumber(String phoneNumber) 
  {
    boolean isValid = true;
    if( phoneNumber.length() != 14) //Required length for proper format
    {
      isValid = false;
    }
    else
    {
      //Golden Format: '(123) 678-0123'
      //Checks the string to see if it fits the golden format
      for(int i=0; i<phoneNumber.length(); i++)
      {
        char indexedChar=phoneNumber.charAt(i);
        switch(i)
        {
          case 0: isValid = indexedChar == '(';
          break;
          case 4: isValid = indexedChar == ')';
          break;
          case 5: isValid = indexedChar == ' ';
          break;
          case 9: isValid = indexedChar == '-';
          break;
          //Checks to see if all other cases are digits based on their ascii values
          default: isValid = ( 48<=(int)(indexedChar) && (int)(indexedChar) <= 57 );
        }
        if(!isValid) //if the format is wrong in any way, stop checking and return false
        {
          break;
        }
      }
    }
    return isValid;
  }
}
