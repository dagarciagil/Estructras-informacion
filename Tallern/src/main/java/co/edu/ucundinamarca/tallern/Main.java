
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import juego.juego;
import static juego.juego.vidas_quedan;


public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
       // log.debug("Hello World : this is a debug message");
        //log.info("Hello World : this is an info message");
        
      juego primera_instancia = new juego(vidas_quedan);//instaciar las vidas
      primera_instancia.MuestraVidasRestantes();
      
      juego segunda_instancia=new juego(5);
      segunda_instancia.MuestraVidasRestantes();
      primera_instancia.QuitaVida(5);
      
    }
}
