public class StockList { 	
  // 1st parameter is the stocklist (L in example), 
  // 2nd parameter is list of categories (M in example)
  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) 
  {
    String rtnval="";
    if(lstOfArt.length != 0 && lstOf1stLetter.length != 0)
    {
      //Process the summary based on the list of capital letters
      for(int i = 0; i < lstOf1stLetter.length; i++)
      {
        String currentLetter= lstOf1stLetter[i];
        int count =0;
      
        //loop through the list of art to find the matching book/stock
        for(int q = 0; q < lstOfArt.length; q++)
        {
          String currentArt = lstOfArt[q];
          if( currentArt.substring(0,1).equals(currentLetter) )
          {
            String[] artValues = currentArt.split(" ");
            count += Integer.parseInt(artValues[1]);
          }
        }
        //format the count of the book/stock
        String stock = "(" + currentLetter + " : " + count + ")";
        if(i != lstOf1stLetter.length - 1)
        {
          rtnval += stock + " - ";
        }
        else
        {
          rtnval += stock;
        }
      }
    }
    return rtnval;
  }
}
