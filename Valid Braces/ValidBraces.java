import java.lang.StringBuffer;
public class BraceChecker {

  public boolean isValid(String braces) 
  {
    boolean rtnval = true;
    StringBuffer bracesBuffer = new StringBuffer(braces);
    
    while(bracesBuffer.length() >0 )
    {
      int index=0;
      for(int i=0; i<bracesBuffer.length(); i++)
      {
        if( isRightBrace(bracesBuffer.charAt(i)) )
        {
          index=i;
          break;
        }
      }
      
      //Checks if the brace right before it ( if it exists) is the correct left brace
      if(index !=0 && isProperBracePair( bracesBuffer.charAt(index-1), bracesBuffer.charAt(index)) )
      {
        //Pops the correct pairing out of the string buffer
        bracesBuffer.delete(index-1,index+1);
      }
      else
      {
        rtnval = false;
        break;
      }
    }
    
    return rtnval;
  }
  
  private boolean isProperBracePair(char leftBrace, char rightBrace)
  {
    return ( (leftBrace == '(' && rightBrace == ')' ) ||
             (leftBrace == '[' && rightBrace == ']' ) ||
             (leftBrace == '{' && rightBrace == '}' ) );
  }
  
  private boolean isLeftBrace(char brace)
  {
    return ( brace == '(' || brace == '[' || brace == '{' );
  }
  
  private boolean isRightBrace(char brace)
  {
    return ( brace == ')' || brace == ']' || brace == '}' );
  }

}
