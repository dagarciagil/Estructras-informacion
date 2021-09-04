
package juego;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class juego {
    
    static public int vidas_quedan=5-1;
    private int vidas=5;
    private int record=0;
    
    public juego(int vidas_iniciales){
     
        vidas_quedan= vidas_iniciales;
        vidas=vidas_iniciales;
     }
     
    public void MuestraVidasRestantes(){
       
       Logger logger;
       logger =Logger.getLogger("Juego");
       logger.log(Level.INFO, "vidas que quedan: "+vidas_quedan);
     }
    
    public boolean QuitaVida(int Bvidas){
      vidas_quedan=Bvidas-1;
      Logger logger;
      logger =Logger.getLogger("Quita vida");
      if(vidas_quedan<1){
      logger.log(Level.INFO, "Juego terminado");
      } 
      else{
      logger.log(Level.INFO, "Las vidas restantes son: "+vidas_quedan);
      }
     return false;
    }
    
    public void Reiniciar_partida(int reinicio_vidas){
    reinicio_vidas=vidas;
    }
    
    public void Actualizar_record(){
      Logger logger;
      logger =Logger.getLogger("Quita vida");
        if(vidas_quedan==record){
          logger.log(Level.INFO, "alcanza nuevo record");
        }else if(vidas_quedan>record){
          logger.log(Level.INFO, "ha batido un nuevo record: "+vidas_quedan);
        }          
    }
}
