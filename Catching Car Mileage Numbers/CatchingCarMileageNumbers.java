import java.util.regex.Pattern;
import java.lang.StringBuffer;
public class CarMileage {

  public static int isInteresting(int number, int[] awesomePhrases) 
  {
    int rtnval =0;
    if( (firstRule(number) || secondRule(number) || thirdRule(number) ||
        fourthRule(number) || fifthRule(number) || sixthRule(number, awesomePhrases) ) 
        && (Integer.toString(number).length() >=3) )
    {
      rtnval =2;
    }
    else if( ( (firstRule(number + 1) || secondRule(number + 1) || thirdRule(number + 1) ||
        fourthRule(number + 1) || fifthRule(number + 1) || sixthRule(number + 1, awesomePhrases) ) 
        && (Integer.toString(number + 1).length() >=3) ) || 
        ( (firstRule(number + 2) || secondRule(number + 2) || thirdRule(number + 2) ||
        fourthRule(number + 2) || fifthRule(number + 2) || sixthRule(number + 2, awesomePhrases) ) 
        && (Integer.toString(number + 2).length() >=3) ) )
    {
      rtnval=1;
    } 
    
    return rtnval;
  }
  
  // Any digit followed by all zeros
  private static boolean firstRule(int number)
  {
    String numberString = Integer.toString(number);
    return Pattern.matches("[1-9]0+", numberString);
  }
  
  //Every Digit is the same number
  private static boolean secondRule(int number)
  {
    String numberString = Integer.toString(number);
    String replacedString = numberString.replaceAll( numberString.substring(0,1), "");
    return replacedString.length() ==0;
  }
  
  //The digits are sequential, incrementing
  private static boolean thirdRule(int number)
  {
    String numberString = Integer.toString(number);
    char currChar = numberString.charAt(0);
    for( int i=1; i<numberString.length(); i++)
    {
      if( ( currChar=='9' && numberString.charAt(i) == '0') || ( currChar == numberString.charAt(i)-1 ) )
      {
        currChar= numberString.charAt(i);
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  //The digits are sequential, decrementing
  private static boolean fourthRule(int number)
  {
    String numberString = Integer.toString(number);
    char currChar = numberString.charAt(0);
    for( int i=1; i<numberString.length(); i++)
    {
      if( ( currChar=='1' && numberString.charAt(i) == '0') || ( currChar - 1 == numberString.charAt(i) ) )
      {
        currChar= numberString.charAt(i);
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  //The digits are a palindrome
  private static boolean fifthRule(int number)
  {
    StringBuffer numberString = new StringBuffer(Integer.toString(number));
    
    return numberString.toString().equals(numberString.reverse().toString());
  }
  
  //The digits match one of the values in the awesomePhrases array
  private static boolean sixthRule(int number, int[] awesomePhrases)
  {
    for(int i=0; i< awesomePhrases.length; i++)
    {
      if( awesomePhrases[i] == number)
      {
        return true;
      }
    }
    return false;
  }
}
