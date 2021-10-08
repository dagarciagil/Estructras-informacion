
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Dulces {
    
    static ArrayList<String> Dulces = new ArrayList<String>();
    
    public static void main(String[] args) {
        
       Dulces.add("Chocorramo");
       Dulces.add("Bombombun");
       Dulces.add("Pera dulce");
       Dulces.add("chicle");
       Dulces.add("Goma");
       Dulces.add("Bianchi");
       Dulces.add("Arequipe");
       Dulces.add("Merengon");
       Dulces.add("quipitos");
       Dulces.add("bubaloo");
       Dulces Array = new Dulces();
       Array.mostrar();
    }
    
    public void mostrar(){
     Logger logger;
     logger =Logger.getLogger("Iterador arrayList");
     logger.log(Level.INFO, Dulces);
     
    }
}
