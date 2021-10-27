/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ListaCircularDoble {

    public static void main(String[] args) {
        lista lista1 = new lista();
        Scanner teclado = new Scanner(System.in);
        Logger logger;
        int opcion = 0;
        int buscar = 0;

        do {
            logger = Logger.getLogger("Menu");
            logger.log(Level.INFO, "1. Ingresar un nodo");
            logger.log(Level.INFO, "2. Mostrar la lista");
            logger.log(Level.INFO, "3. Buscar en la lista");
            logger.log(Level.INFO, "4. Modificcar");
            logger.log(Level.INFO, "5. salir");

            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese un dato");
                    int dato;
                    dato = teclado.nextInt();
                    lista1.ingresar(dato);
                    break;

                case 2:
                    System.out.println("Buscando");
                    lista1.mostrar();
                    break;

                case 3:
                    System.out.println("ingrese el dato a buscar");
                    buscar = teclado.nextInt();
                    lista1.buscar(buscar);
                    break;

            }
        } while (opcion != 5);
    }
}
