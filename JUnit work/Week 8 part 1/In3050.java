/** In3050
 * I want to note that I have included seperate methods each showing the requested 
 * defect to make it easier to display the tests needed. The method "in3050sol" is
 * included as the base solution given through code academy while the methods:
 * "in3050defa39" and "in3050defa29"
 * are included as 
 * 
 * @author Nicholas Seamans 
 * @version 2/17/2017
 */
public class In3050
{
    //Method 1
    /** in3050sol
     *  This is the solution to the coding bat assignment provided as
     *  a baselione for the defect testing
     */
    public boolean in3050sol(int a, int b) {
      if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
        return true;
      }
      if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
        return true;
      }
      return false;
    
    }
    
    //Method 2
    /** in3050defa39
     *  This method illustrates the change fof the clause:
     *      a >= 40 to a >= 39
     *  to enact a defect in the coding
     */
    public boolean in3050defa39(int a, int b) {
      if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
        return true;
      }
      if (a >= 39 && a <= 50 && b >= 40 && b <= 50) {
        return true;
      }
      return false;
      // This could be written as one very large expression,
      // connecting the two main parts with ||
    }
    
    //Method 3
    /** in3050defa29
     *  This method illustrates the change fof the clause:
     *      a >= 30 to a >= 29
     *  to enact a defect in the coding
     */
    public boolean in3050defa29(int a, int b) {
      if (a >= 29 && a <= 40 && b >= 30 && b <= 40) {
        return true;
      }
      if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
        return true;
      }
      return false;
      // This could be written as one very large expression,
      // connecting the two main parts with ||
    }
}
