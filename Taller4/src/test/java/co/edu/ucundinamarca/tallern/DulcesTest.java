package co.edu.ucundinamarca.tallern;


import static co.edu.ucundinamarca.tallern.Dulces.Caramelos;
import static co.edu.ucundinamarca.tallern.Dulces.mostrar;
import static co.edu.ucundinamarca.tallern.Dulces.mostrarSinIterador;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;


public class DulcesTest {
 
 @Test    
 public void testLista(){
    mostrar();
   
   assertTrue("El arraylist si contiene los diez datos excatos",Caramelos.size()==10);
 }
 @Test    
 public void testListasinIterador(){
   mostrarSinIterador();
   String dulceprincipal = Caramelos.get(0);
   assertTrue("El chocorramo si se encuentra",dulceprincipal.equals(Caramelos.get(0)));
 }
}
