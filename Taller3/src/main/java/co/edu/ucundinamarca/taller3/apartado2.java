
package co.edu.ucundinamarca.taller3;

import static co.edu.ucundinamarca.taller3.Main.log;
import java.util.Scanner;

public class apartado2 {
  
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    int num;
    log.debug("Introduce un valor: ");
    num = sc.nextInt();
           
    log.info("El factorial del numero "+num+" es: "+factorial(num));
    }
     
    public static int factorial(int num){
        if(num <= 1){
        return 1;
        
        }
        return num*factorial(num-1);   
    }
}   


