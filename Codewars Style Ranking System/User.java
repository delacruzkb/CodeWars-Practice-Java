// TODO: create the User class/object
// it must support rank, progress, and the incProgress(int rank) method
public class User
{
  int rank;
  int progress;
  public User()
  {
    rank = -8;
    progress= 0;
  }
  public void incProgress(int activityRank)
  {
    if(isRank(activityRank) && rank !=8)
    {
      if(activityRank == rank)
      {
        progress +=3;
      }
      else if(activityRank< rank)
      {
        if( (rank == 1 && activityRank == -1) || (rank-1 == activityRank))
        {
          progress +=1;
        }
      }
      else if(activityRank > rank)
      {
        int difference=0;
        if(activityRank >0 && 0>rank)
        {
          difference = activityRank - rank -1;
        }
        else
        {
          difference = activityRank - rank;
        }
        progress += 10 * difference * difference;
      }
    
      while(progress >=100)
      {
        if(rank == -1)
        {
          rank += 2;
        }
        else
        {
          rank++;
        }
        progress -=100;
      }
    }
    else
    {
      throw new IllegalArgumentException("Must be between -8 and 8, but not 0);
    }
  }
  
  private boolean isRank(int rank)
  {
    boolean rtnval = true;
    if( rank >8 || rank<-8 || rank == 0)
    {
      rtnval=false;
    }
    return rtnval;
  }
}
