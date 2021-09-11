/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Semana {
    Logger logger;
    ArrayList dias = new ArrayList();
  
    public static void main(String[] args) {
    Semana listaDias = new Semana();
    listaDias.CargarDias();
    listaDias.tamaño();
    listaDias.ObtenerDia();
    listaDias.MostrarDias();
        
    }
    
    public void CargarDias(){
    dias.add("Lunes");
    dias.add("Martes");
    dias.add("Miercoles");
    dias.add("Jueves");
    dias.add("Viernes");
    }
    
    public void tamaño(){
    int tamaño=dias.size();
    logger =Logger.getLogger("Semana");
    logger.log(Level.INFO, "Los datos del array list son: "+tamaño);
    }
    
    public void ObtenerDia(){
    if(dias.contains("Jueves")){
    logger =Logger.getLogger("Semana");
    logger.log(Level.INFO, "Dia encontrado: "+dias.get(3));    
    }else{
     logger.log(Level.INFO, "El dia no se encuentra");
     }    
    }
    
    public void MostrarDias(){
    for(int i=0; i<dias.size(); i++){
    logger =Logger.getLogger("Semana");
    
    }
    logger.log(Level.INFO, dias);
    }
}
