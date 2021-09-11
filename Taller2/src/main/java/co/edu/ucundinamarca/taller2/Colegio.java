/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Colegio {
    Logger logger;
  
 
   HashMap<String,alumnos> personal = new HashMap<String, alumnos>();
    
    public static void main(String[] args) {
    Logger logger;
    logger =Logger.getLogger("HashMap");
    
    Colegio instancia = new Colegio();
    instancia.agregarAlumnos();
    instancia.mosraralumnos();
    instancia.removerAlumnos();
    instancia.mosraralumnos();
    logger.log(Level.INFO, "Se ha agregado correctamente");
    instancia.agregarAlumnos();
    instancia.mosraralumnos();
    }
  
   public void agregarAlumnos(){
 
   personal.put("1", new alumnos("POLONIA"));
   personal.put("2", new alumnos("SUIZA"));
   personal.put("3", new alumnos("ARGENTINA"));
   }  
   
   public void mosraralumnos(){
   logger =Logger.getLogger("HashMap");
   logger.log(Level.INFO, personal.entrySet());    
   }
   
   public void removerAlumnos(){
   logger =Logger.getLogger("HashMap");
   personal.remove("2");
   logger.log(Level.INFO, "Se ha elminado correctamente");
   }
   
    static class alumnos{
    private String Nacionalidad;
    private String grupo;
     
    public alumnos(String Na){
    Nacionalidad=Na;
    grupo="401";
    }
    
      public String toString(){
  return "[Nacionalidad: "+Nacionalidad+"],el grupo del alumno es: ["+grupo+"]";
  }
  }   
}
