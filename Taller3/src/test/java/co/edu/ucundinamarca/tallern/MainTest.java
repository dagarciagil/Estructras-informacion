
package co.edu.ucundinamarca.tallern;



import co.edu.ucundinamarca.taller3.Main;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class MainTest {

    @Test
    public void testFactorial() {
    
    Main fac = new Main();
    int res = fac.factorial(5);
    assertTrue(res == 120);
   
    }

   

}
