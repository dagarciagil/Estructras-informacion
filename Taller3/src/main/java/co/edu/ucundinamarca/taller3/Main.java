
package co.edu.ucundinamarca.taller3;

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
     int num;
     log.debug("Digite un numero: ");
     num = sc.nextInt();
     log.info("El factorial del numero "+num+" es: "+factorial(num));
   
    }

    public static int factorial(int num){ 
     int factorial=1;
     if(num<=0){
     log.info("Error el valor ingresado es nulo");
     }else{
     while(num>1){
    
     factorial=factorial*num;
     num--;
      }
     
     }
     return factorial;  
    }
}

