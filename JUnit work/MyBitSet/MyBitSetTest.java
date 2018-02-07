

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyBitSetTest.
 *
 * @author  Nicholas Seamans
 * @version 4/1/2017
 */
public class MyBitSetTest
{
    /**
     * Default constructor for test class MyBitSetTest
     */
    public MyBitSetTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void bits1()
    {
        MyBitSet bits1 = new MyBitSet();
        bits1.set(0);
        bits1.get(0);
        bits1.set(1);
        bits1.get(1);
        bits1.set(2);
        bits1.get(2);
        bits1.flip(2);
        bits1.get(2);
        bits1.flip(1);
        bits1.get(1);
        bits1.flip(0);
        bits1.get(0);
        bits1.set(3);
        bits1.flip(3);
        
    }
}

