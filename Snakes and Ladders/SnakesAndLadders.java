import java.util.HashMap;
public class SnakesLadders 
{
    HashMap<Integer, Integer> snakesAndLadders;
    boolean isPlayerOneTurn;
    boolean isGameOver;
    Player p1;
    Player p2;
    
    public SnakesLadders() 
    {
      isPlayerOneTurn = true;
      isGameOver = false;
      p1 = new Player("Player 1");
      p2 = new Player("Player 2");
      snakesAndLadders = new HashMap<Integer, Integer>();
      snakesAndLadders.put(2,38);
      snakesAndLadders.put(7,14);
      snakesAndLadders.put(8,31);
      snakesAndLadders.put(15,26);
      snakesAndLadders.put(16,6);
      snakesAndLadders.put(21,42);
      snakesAndLadders.put(28,84);
      snakesAndLadders.put(36,44);
      snakesAndLadders.put(46,25);
      snakesAndLadders.put(49,11);
      snakesAndLadders.put(51,67);
      snakesAndLadders.put(62,19);
      snakesAndLadders.put(64,60);
      snakesAndLadders.put(71,91);
      snakesAndLadders.put(74,53);
      snakesAndLadders.put(78,98);
      snakesAndLadders.put(87,94);
      snakesAndLadders.put(89,68);
      snakesAndLadders.put(92,88);
      snakesAndLadders.put(95,75);
      snakesAndLadders.put(99,80);
    }
    
    public String play(int die1, int die2) 
    {
        String ans="";
        
        if(isGameOver)
        {
          ans= "Game over!";
        }
        else
        {
          //Determine the current Player and their metrics
          Player currentPlayer;
          if(isPlayerOneTurn)
          {
            currentPlayer = p1;
          }
          else
          {
            currentPlayer = p2;
          }
          int currentPosition = currentPlayer.getPosition();
          int totalRoll= die1 + die2;
          int finalPosition = totalRoll + currentPosition;
          
          //Process the calculated finalPosition
          if( finalPosition == 100) //if current player wins
          {
            ans = currentPlayer.getName() + " Wins!";
            isGameOver=true;
          }
          else 
          {
            if(finalPosition >100) // if roll goes over 100
            {
              finalPosition = 100 - (finalPosition - 100);
            }
            if(snakesAndLadders.containsKey(finalPosition) ) // if there exists a snake or a ladder at the destined position
            {
              finalPosition = snakesAndLadders.get(finalPosition);
            }
            currentPlayer.setPosition(finalPosition);
            ans = currentPlayer.getName() + " is on square " + currentPlayer.getPosition();
            //hand over the turn if it isn't a double roll
            if(die1 != die2)
            {
              isPlayerOneTurn = !isPlayerOneTurn;
            }
          }
        }
        return ans;
    }
}

class Player
{
  int position;
  String name;
  public Player(String playerName)
  {
    position=0;
    name = playerName;
  }
  
  public int getPosition()
  {
    return position;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setPosition( int newPosition)
  {
    position= newPosition;
  }
  
  public void setName(String newName)
  {
    name = newName;
  }
}
