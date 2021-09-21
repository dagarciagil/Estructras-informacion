
package co.edu.ucundinamarca.taller3;

import static co.edu.ucundinamarca.taller3.Main.log;
import java.util.Scanner;


public class apartado3_potencia {
    

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int m, n;
     log.debug("Digite un numero para sacar su potencia: ");
     m = sc.nextInt();
     
     log.debug("Digite un numero de potencia");
     n = sc.nextInt();
     
     log.info(potenciaConRecursion(m,n));
    }
    
    public static int potenciaConRecursion (int m, int n) {

        if (n==0) { 
        return 1;

        } else{ 
        return m * potenciaConRecursion (m, n-1); 
        }
    }
}