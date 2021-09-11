/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.HashSet;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class SeleccionColombia {
    Logger logger;
    HashSet<String> hset = new HashSet<String>();
  
    
    public static void main(String[] args) {
       SeleccionColombia equipo = new SeleccionColombia();        
        equipo.agregarJuagdores();
        equipo.ContieneJugador("James");
        equipo.MostrarJugarodres();
        
    }
    
    public void agregarJuagdores(){
     hset.add("James");
     hset.add("Falcao");
     hset.add("Cuadrado");
     hset.add("Ospina");
     hset.add("Edwin");
     
    }
    
    public void MostrarJugarodres(){
    for(int i =0; i<hset.size(); i++){
    logger =Logger.getLogger("Jugadores");
     }
     logger.log(Level.INFO, hset);
    }
    
    public void ContieneJugador(String n){
   
     logger =Logger.getLogger("Jugadores");
     if(hset.contains(n)){
       logger.log(Level.INFO,"EL jugador existe: "+n);
     }
     else{
       logger.log(Level.INFO, "Jugador no encontrado"); 
     }
    }
}
