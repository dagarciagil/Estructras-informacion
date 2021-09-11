/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.Objects;
        
public class Persona {

    private String nombre;
    private int edad;
    private int identificacion;

    public Persona(String nombre, int edad, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public static void main(String[] args) {

        Persona personaUno = new Persona("Hanner", 10, 20);
        Persona personaDos = new Persona("Hanner", 10, 40);

        if (personaUno.equals(personaDos)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }

    }

    @Override
    public String toString() {
        return "Persona [nombre : " + getNombre() + " edad : " + getEdad() + " Identificacion : " + getIdentificacion() + "]";
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

        Persona that = (Persona) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getIdentificacion();
        return result;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

