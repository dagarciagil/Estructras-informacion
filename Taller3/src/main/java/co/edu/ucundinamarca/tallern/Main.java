
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int fac;
    log.debug("Digite un numero: ");
     fac = sc.nextInt();
     Main objeto1 = new Main();
     objeto1.factorial(fac);
    log.info("El factorial del numero es: "+objeto1.factorial(fac));
    
    }

    int factorial(int num){ 
     int resultado = 0;
     
     for(int i =num; i<1; i--){
     resultado=num*i;
     
     }
     
    return resultado;
    }
    
}
