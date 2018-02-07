

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class In3050Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class In3050Test
{
    /**
     * Default constructor for test class In3050Test
     */
    public In3050Test()
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
    public void tests()
    {
        In3050 in3050 = new In3050();
        in3050.in3050defa29(30, 31);
        in3050.in3050defa29(30, 41);
        in3050.in3050defa29(40, 50);
        in3050.in3050defa29(40, 51);
        in3050.in3050defa29(39, 50);
        in3050.in3050defa29(50, 39);
        in3050.in3050defa29(40, 39);
        in3050.in3050defa29(49, 48);
        in3050.in3050defa29(50, 40);
        in3050.in3050defa29(50, 51);
        in3050.in3050defa29(35, 36);
        in3050.in3050defa29(35, 45);
        in3050.in3050defa39(30, 31);
    }
}

