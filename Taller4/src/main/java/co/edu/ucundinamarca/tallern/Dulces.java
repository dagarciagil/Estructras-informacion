
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Dulces {
    
    static ArrayList<String> Caramelos = new ArrayList<String>();

    
    
    public static void main(String[] args) {
        
       mostrar();
       mostrarSinIterador();
    }
    
    public static void ingresar(){
     Caramelos.add("Chocorramo");
     Caramelos.add("Bombombun");
     Caramelos.add("Pera dulce");
     Caramelos.add("chicle");
     Caramelos.add("Goma");
     Caramelos.add("Bianchi");
     Caramelos.add("Arequipe");
     Caramelos.add("Merengo");
     Caramelos.add("quipitos");
     Caramelos.add("bubaloo");
    }
    
    public static void  mostrar(){
     ingresar();
     Logger logger;
     logger =Logger.getLogger("Iterador arrayList");
     for(int i=0; i<Caramelos.size();i++){
     logger.log(Level.INFO, Caramelos.get(i));
     }
    }
    
    public static void mostrarSinIterador(){
     ingresar();
     Logger logger;
     logger =Logger.getLogger("Iterador arrayList");
     logger.log(Level.INFO, Caramelos);
    }
}
