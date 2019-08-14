import java.util.List;
import java.util.ArrayList;
public class SqInRect
{
	public static List<Integer> sqInRect(int lng, int wdth) 
  {
	  List<Integer> rtnval = null;
    
    if(lng != wdth)
    {
      rtnval = new ArrayList<Integer>();
      int length = lng;
      int width = wdth;
      
      //While length or width are greater than 1 but not equal
      while( (length > 1 || width >1) && width != length)
      {
        //if length is longer, cut it. Else, cut width. Add the square to the array.
        if(length> width)
        { 
          rtnval.add(new Integer(width));
          length = length - width;
        }
        else
        {  
          rtnval.add(new Integer(length));
          width = width - length;
        }
      }
      if(length== width)
      {
        rtnval.add(new Integer(width));
      }
    }
		return rtnval;
	}
}
