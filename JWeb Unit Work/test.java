/**
 * Homework 12 assignment designed to catch errors for backpaacks1-4.html
 * Set to backpacks2 in code but all errors have been caught in 3 and 4
 * @author Nicholas Seamans
 * @version 4/14/2017
 */
    import org.junit.*;
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;
    import static net.sourceforge.jwebunit.junit.JWebUnit.*;
    
public class test
{
    @Before
    public void prepare() {
        setBaseUrl("http://www.radford.edu/~dbraffitt/itec335/2017/spring/class/");
        beginAt("backpacks2.html");
    }
     
    /** testimg_present
     *  tests if images are present for the id's 1,2, and 3
     */
    @Test
    public void testimgs_present() {
        assertElementPresentByXPath("//img[@id='image1']");
        assertElementPresentByXPath("//img[@id='image2']");
        assertElementPresentByXPath("//img[@id='image3']");
    }
    
    /** test_descriptions
     *  tests if descriptions are present for the id's 1,2, and 3
     */
    @Test
    public void test_descriptions() {
        assertElementPresentByXPath("//p[@id='description1']");
        assertElementPresentByXPath("//p[@id='description2']");
        assertElementPresentByXPath("//p[@id='description3']");
    }
    
    /** testlist1_listsandtablespresent
     *  tests if unorderedList1, orderedList1m and table1 are present
     */
    @Test
    public void testlist1_listsandtablespresent() {
        assertElementPresentByXPath("//ul[@id='unorderedList1']");
        assertElementPresentByXPath("//ol[@id='orderedList1']");
        assertElementPresentByXPath("//table[@id='table1']");
    }
    
    /** testlist2_nest
     *  Tests if the unorderedList1 --> orderedList1 relationship exists 
     */
    @Test
    public void testlist2_nest() {
        assertElementPresentByXPath("//ul[@id='unorderedList1']/li/ol[@id='orderedList1']");
        
    }
    
    /** testimglink
     *  tests if a document is linked to for image1
     */
    @Test
    public void testimglink() {
        assertElementPresentByXPath("//a[@id='link1']/img[@id='image1'][starts-with(@href, '')]");

    }
    
    /** testhyperlink4
     *  tests if a absolute hyperlink exists for link4
     */
    @Test
    public void testhyperlink4() {
        assertElementPresentByXPath("//a[@id='link4']");
    }
    
    /** testtbhyplink
     *  tests if the imbeded link3 is present
     */
    @Test
    public void testtbhyplink() {
        assertElementPresentByXPath("//a[@id='link3'][starts-with(@href, '')]");
    }
    
    /** testtcopyright
     *  tests if the copyright paragraph exists. 
     */
    @Test
    public void testtcopyright() {
        assertElementPresentByXPath("//p[@id='copyright1']");
        
    }
    
    @After
    public void close() {
        closeBrowser();
    }
    
}
