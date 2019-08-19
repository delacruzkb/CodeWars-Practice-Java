public class Max {
  public static int sequence(int[] arr)
  {
      int maxSum=0;
      // Find a positive number
      // The highest sum must start with a positive number
      for(int index=0; index < arr.length;index++)
      {
        if(  arr[index] > 0  ) //Finds the first positive number
        {
          int currentSum =0;
          //Processes the highest possible sum from a contiguous subsequence with the index as the start
          for(int i=index; i<arr.length; i++)
          {
            currentSum += arr[i];
            if(maxSum < currentSum)
            {
              maxSum = currentSum; // updates maxSum
            }
          }
        }
      }
      return maxSum;
  }
}
