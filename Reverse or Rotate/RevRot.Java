class RevRot 
{
    public static String revRot(String strng, int sz) 
    {
        String rtnval="";
        if( (strng.length() >= sz) && (sz != 0) )
        {
          int index=0;
          //Process the string chunk by chunk
          while( index+sz < strng.length())
          {
            //Grabs the current chunk to be processed
            StringBuffer chunk = new StringBuffer(strng.substring(index, index+sz));
            char[] chunkArray = chunk.toString().toCharArray();
            
            //Calculates the sum of cubes of the digits in the chunk
            int sumOfCubes=0;
            for(int i =0; i<chunkArray.length;i++) //Parses the chunk
            {
              int digit = Character.getNumericValue(chunkArray[i]);
              sumOfCubes += (int)(Math.pow(digit,3));
            }
            
            //Processes the chunk
            if(sumOfCubes % 2 ==0)
            {
              chunk.reverse();
            }
            else
            {
              chunk.append(chunk.charAt(0));
              chunk.deleteCharAt(0);
            }
            rtnval += chunk.toString();
            index = index + sz;
          }
        }
        return rtnval;
    }
}
