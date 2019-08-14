public class BouncingBall {
	public static int bouncingBall(double h, double bounce, double window) 
	{
		int rtnval =1; //Mother saw the ball once before hitting the floor
    if(h>window && bounce >0 && bounce <1)
    {
    	double apexOfBounce= h*bounce;
    	while(apexOfBounce >window) //The highest point of the ball's bounce passes the window
      {
      	rtnval = rtnval +2; //Mother saw the ball rise and fall
        apexOfBounce = apexOfBounce * bounce; // bounce
      }
		}
    else
    {
	    rtnval=-1;
    }
    return rtnval;
	}
}
