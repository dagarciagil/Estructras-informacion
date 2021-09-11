/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Animal {
    
    private String nombre;
    private int patas;
    private String especie;
    private int edad;
    private int identificacion;
    
    public static void main(String[] args) {
        Logger logger;
        logger =Logger.getLogger("HasCode & equals");
        
        Animal animal1= new Animal("Natacha", 4," perro ",3, 123);
        Animal animal2= new Animal("Peter", 8," Araña ",1, 123);
        
        if (animal1.equals(animal2)) {
             logger.log(Level.INFO, "*** Mismo animal ***");
        } else {
              logger.log(Level.INFO, "*** Distinto animal ***");
        }
    }

    public Animal(String nombre, int patas, String especie, int edad, int identificacion) {
        this.nombre = nombre;
        this.patas = patas;
        this.especie = especie;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    
    
    @Override
    public String toString() {
        return "nombre"+nombre+" patas"+patas+""
                + "especie "+especie+ " edad "+edad+ ""
                + "id "+identificacion; 
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.identificacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        if(this.identificacion != other.identificacion) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
}
