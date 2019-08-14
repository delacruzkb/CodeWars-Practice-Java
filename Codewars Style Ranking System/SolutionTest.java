import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
       
        System.out.println("Defaults");
        User user = new User();
        
        System.out.println("-rank");
        assertEquals(-8, user.rank);
        
        System.out.println("-progress");
        assertEquals(0, user.progress);
        
        System.out.println("Progress Calculations");
        
        System.out.println("-same rank");
        user.incProgress(-8);
        assertEquals(3,user.progress);
                
        System.out.println("-rank above");
        user = new User(); 
        user.incProgress(-7); //rank above
        assertEquals(10, user.progress);
                
        System.out.println("-rank up");
        user = new User(); 
        user.incProgress(-6);
        user.incProgress(-6);
        user.incProgress(-6);
        assertEquals(-7, user.rank);
        
        System.out.println("progress carry over");
        assertEquals(20,user.progress);
        
        System.out.println("rank up from negative to positive");
        user = new User();
        user.incProgress(2);
        assertEquals(1,user.rank);
        
        System.out.println("progress 1 tier below user");
        user.incProgress(-1);
        assertEquals(11,user.progress);
        
        System.out.println("progress >1 tiers below user");
        user.incProgress(-8);
        assertEquals(11,user.progress);
        
        System.out.println("invalid rank range");
        try
        {
          user.incProgress(-9);
          fail();
        }
        catch(Exception e)
        {
          //pass
        }
        try
        {
          user.incProgress(9);
          fail();
        }
        catch(Exception e)
        {
          //pass
        }
        try
        {
          user.incProgress(0);
          fail();
        }
        catch(Exception e)
        {
          //pass
        }
    }
}
