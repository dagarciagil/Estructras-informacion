
package co.edu.ucundinamarca.tallern;


import co.edu.ucundinamarca.taller3.apartado2;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class apartado2Test {
     @Test
    public void testFactorial() {
    
    apartado2 fac = new apartado2();
    int res = fac.factorial(5);
    assertTrue(res == 120);
   
    }
}
