/**
 * Homework 13 assignment 
 * @author Nicholas Seamans
 * @version 4/21/2017
 */
    import org.junit.*;
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;
    import static net.sourceforge.jwebunit.junit.JWebUnit.*;

/** Test plan and criteria for http://www.radford.edu/itec100/
 *      Test coverage types: Edge coverage, Call coverage
 *  The radford ITEC 100 page is fairly simple and lacks forms and
 *  web technologies besides html. Because of this, I have chosen
 *  to view each attribute as a node to a task or display. Each element
 *  functions as a node to another task in otherwords. The path, or edge, 
 *  will be represented by testing with xpath. 
 *  This assesment will be done by:
 *     1) assesing if the different paths for each element type is present 
 *     2) assesing if the begining text for each expected instanoce of that 
 *        element is present in the case of paragraphs and lists. 
 *     3) testing if the provided images are present
 *     
 *  After this some aspects of call coverage will be tested on provided 
 *  links to ensure that the function to link to other pages works correctly
 *  and that the given links can be trusted. 
 *      Note: Upon further testing I have found that Junits method of testing 
 *      only works with certain links so I have provided 3 links it works with.
 *      This means I could not fully cover calls. 
 */ 

public class test100
{
    @Before
    public void prepare() {
        setBaseUrl("http://www.radford.edu/itec100/");
    }
    
    @Test
   public void test_Title() {
       beginAt("");
       assertTitleEquals("Radford University - ITEC 100");
   }
   
   @Test
       public void test_Images() {
           beginAt("");
           assertImagePresent("http://fds.asp.radford.edu/images/itecheader.jpg", 
                                "Radford Department of Information Technology");
           assertImagePresent("http://www-fp.pearsonhighered.com/bigcovers/0132091259.jpg", 
                                "Digital Planet: Introductory, 10th edition");
           assertImagePresent("texts/swt4/swt4cover.jpg", 
                                "Succeeding With Technology, 4th edition");
           assertImagePresent("texts/office2010/office2010cover.jpg", 
                                "New Perspectives on Microsoft Office 2010, Radford custom");     
       }
       
    /** test_paragraphs
    *  Test to see if paraphs provided by the web page is in place
    *   ensures that needed text is provided for each paragraph by asserting the beginning text
    *   in each paragraph
    */
    @Test
        public void test_paragraphs() {
            beginAt("");
            
            /* Tests if paragraphs are present. 
             * Starting text from each paragraph is then checked to 
             * see if the needed text fields are present*/
            assertElementPresentByXPath("//p");
            assertElementPresentByXPath("//p/img");
                assertTextPresent("ITEC 100 at Radford University");
                assertTextPresent("based on this course");
                assertTextPresent("ITEC 100 qualifies for 3 credits");
                assertTextPresent("For 2016-2017 and later years");
                assertTextPresent("The following texts and online tools correspond to 2015-2016");
                assertTextPresent("The following texts and online tools correspond to 2014-2015");
                assertTextPresent("The following texts and online tools correspond to 2013-2014");
                assertTextPresent("The following texts and online tools were used during 2011-2013");
                assertTextPresent("The following texts and online tools were used during 2009-2011");
                assertTextPresent("The following texts and online tools were used during 2008-2009");
                assertTextPresent("The following texts and online tools were used during 2006-2008");
                
                // Note: I did not see a method that tests for footer text so it's been included here 
                assertTextPresent("Revised: 03-Jan-2017");            
        }
       
       
       
   /** test_lists
    *  Test to see if the stucture of the lists provided by the web page is in place
    *   ensures that needed text is provided for each list by asserting the beginning text
    *   in each list
    */
   @Test
        public void test_lists() {
            beginAt("");
            
            /* Tests to see if unordered lists are present in their respective path types. 
             * Tests to see if each element is present */
            assertElementPresentByXPath("//ul/li");
            assertElementPresentByXPath("//div/ul/li");
            assertElementPresentByXPath("//div/ul/li/a"); 
                assertTextPresent("Computer Concepts");
                assertTextPresent("Information Technology Radford University");
                assertTextPresent("Digital Planet: Introductory");
                assertTextPresent("Succeeding with Technology");
                assertTextPresent("2012-2013");
                assertTextPresent("Custom Courseware");
                assertTextPresent("2010-2011");
                assertTextPresent("ISBN: 1428392432/9781428392434");
                assertTextPresent("2008-2009");
                assertTextPresent("2007-2008");
                assertTextPresent("2006-2007");
        }
            
  /** test_links for presence
   *  Tests the web page links to make sure that the web page links are present
   */
    @Test
        public void test_links() {
            beginAt("");
            
            /* description links */
            assertLinkPresentWithExactText("description");
            
            /* course links */
            assertLinkPresentWithExactText("ITEC 109");
            assertLinkPresentWithExactText("ITEC 120");
            assertLinkPresentWithExactText("ITEC 112");
            
            /* minors detail link */
            assertLinkPresentWithExactText("here");
            
            /* checks if a bookstore link is presnt */
            assertLinkPresentWithExactText("website");
            
            /* checks if a Desire2Learn link is presnt */
            assertLinkPresentWithExactText("website");
            
            /* checks if links are present for semesters */
            assertLinkPresentWithExactText("Fall");
            assertLinkPresentWithExactText("Spring");
            assertLinkPresentWithExactText("Maymester");
            assertLinkPresentWithExactText("Summer I");
            assertLinkPresentWithExactText("Summer II");
            assertLinkPresentWithExactText("Summer III");
            
            /* Checks if links aree present for 03-Jan-2017 Revision */
            assertLinkPresentWithExactText("ITEC Home");
            assertLinkPresentWithExactText("CSAT Home");
            assertLinkPresentWithExactText("RU Home");
        }
        
   /** Link Call Coverage
    *  The next three methods attempt to verrify that the requested webpage 
    *  is present and accounted for. As stated above complete link coverage want not
    *  obtainable for reasons beyond the scope of Jwebunit (or my knowledge anyways).
    *  I consider it on good faith that if these links are correct, it's safe to
    *  presume that the other 15 or so are also.
    */ 
   
    @Test
        public void test_link_Fall15() {
            beginAt("");
            clickLinkWithText("Fall");
            assertTitleEquals("Radford University - ITEC 100 Fall 2015 Schedule");
        }
    @Test
        public void test_link_Spring16() {
            beginAt("");
            clickLinkWithText("Spring");
            assertTitleEquals("Radford University - ITEC 100 Spring 2016 Schedule");
        }
    @Test
        public void test_link_Maymester() {
            beginAt("");
            clickLinkWithText("Maymester");
            assertTitleEquals("Radford University - ITEC 100 Maymester 2009 Schedule");
        } 
      
    
    @After
    public void close() {
        closeBrowser();
    }
}