
package co.edu.ucundinamarca.taller3;

import static co.edu.ucundinamarca.taller3.Main.factorial;
import static co.edu.ucundinamarca.taller3.apartado3_potencia.potenciaConRecursion;
import java.util.Scanner;
import org.apache.log4j.Logger;



public class Funciones {
  
    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
     int num,m,n;
     log.info("------------------FACTORIAL--------------------------");
     log.debug("Digite un numero: ");
     num = sc.nextInt();
   
     log.info("----------------------------------------------------");
     
     log.info("-------------------POTENCIAS-----------------------");
     
     log.debug("Digite un numero para sacar su potencia: ");
     m = sc.nextInt();
     log.debug("Digite un numero de potencia");
     n = sc.nextInt();
     log.info("La potencia del numero es: "+potenciaConRecursion(m,n));
     
     log.info("El factorial del numero "+num+" es: "+factorial(num));
    }  
}
