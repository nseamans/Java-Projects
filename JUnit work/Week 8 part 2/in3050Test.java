import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** The test class in3050Test.
 * The test class in3050Test.
 *
 * @author  Nicholas A Seamans
 * @version 3/17/2017
 */
public class in3050Test
{
    /**
     * Default constructor for test class in3050Test
     */
    public in3050Test()
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
    
    /** tests (for in3050)
     *  test cases requested for hw 8
     */
    @Test
    public void tests()
    {
        in3050 in30501 = new in3050();
        // Coding bat test examples
        assertEquals(true, in30501.in3050(30, 31));
        assertEquals(false, in30501.in3050(30, 41));
        assertEquals(true, in30501.in3050(40, 50));
        assertEquals(false, in30501.in3050(40, 51));
        assertEquals(false, in30501.in3050(39, 50));
        assertEquals(false, in30501.in3050(50, 39));
        assertEquals(true, in30501.in3050(40, 39));
        assertEquals(true, in30501.in3050(49, 48));
        assertEquals(true, in30501.in3050(50, 40));
        assertEquals(false, in30501.in3050(50, 51));
        assertEquals(true, in30501.in3050(35, 36));
        assertEquals(false, in30501.in3050(35, 45));
    }
}

