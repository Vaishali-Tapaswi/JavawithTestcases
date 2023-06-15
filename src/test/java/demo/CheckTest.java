package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckTest {

    public Check check;

    @Before
    public void setUp() {
    	check = new Check();
    }

    
    @Test
    public void testNumber() {
        String fizzBuzz = check.play(1);
        assertTrue(fizzBuzz.equals("1"));
    }

    
    @Test
    public void testFizz() {
        String fizzBuzz = check.play(3);
       assertTrue(fizzBuzz.equals("Fizz"));
    }

    
    @Test
    public void testBuzz() {
        String fizzBuzz = check.play(5);
        assertTrue(fizzBuzz.equals("Buzz"));
    }

 

}
