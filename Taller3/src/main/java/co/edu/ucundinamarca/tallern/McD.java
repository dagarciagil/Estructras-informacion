
package co.edu.ucundinamarca.tallern;

import static co.edu.ucundinamarca.tallern.Main.log;

public class McD {
    
    public static int mcd(int a, int b){
      
      if(b==0){
      return a; // el valor de a es mayor que el de b, por lo tanto hasta ah termina el programa
      }
      return mcd(b, a%b);
    }
    
    public static void main(String[] args) {
       int a = 96; int b= 36; 
       log.info("mcd("+a+","+b+")="+mcd(a,b));
    }
}
