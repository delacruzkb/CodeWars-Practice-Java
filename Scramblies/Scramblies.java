import java.lang.StringBuffer;
public class Scramblies {
    public static boolean scramble(String str1, String str2) 
    {
      boolean isValid=true;
      StringBuffer s1 = new StringBuffer(str1);
      StringBuffer s2 = new StringBuffer(str2);
      
      while(s2.length() > 0)
      {
        String charToBePopped = String.valueOf(s2.charAt(0));
        if(s1.indexOf(charToBePopped) > -1)
        {
          s1.deleteCharAt(s1.indexOf(charToBePopped));
          s2.deleteCharAt(0);
        }
        else
        {
          isValid = false;
          break;
        }
      }
      return isValid;
    }
}
