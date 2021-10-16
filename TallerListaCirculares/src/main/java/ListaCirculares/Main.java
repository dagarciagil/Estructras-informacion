/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCirculares;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author AsusTek
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ListaCircular listaCircular = new ListaCircular();
        Logger logger;
        logger = Logger.getLogger("Lista circulares");

        logger.log(Level.INFO, "<<-- Ejemplo de lista circular simple -->>\n");

        // Agregar al final de la lista circular
        listaCircular.agregarAlFinal(12);
        listaCircular.agregarAlFinal(15);
        listaCircular.agregarAlFinal(9);
        // Agregar in inicio de la lista circular
        listaCircular.agregarAlInicio(41);
        listaCircular.agregarAlInicio(6);

        logger.log(Level.INFO, "<<-- Lista Circular -->>");
        listaCircular.listar();

        logger.log(Level.INFO, "<<-- Tamaño -->>");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\n<<-- Obtener el valor del nodo en la posicion 3 -->>");
        logger.log(Level.INFO, listaCircular.getValor(3));

        logger.log(Level.INFO, "\nInsrta un nodo con valor 16 despues del 15");
        listaCircular.insertarPorReferencia(15, 16);
        listaCircular.listar();
        logger.log(Level.INFO, " | Tamaño: ");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\n\nInsrta un nodo con valor 44 en la posición 5");
        listaCircular.insrtarPorPosicion(5, 44);
        listaCircular.listar();
        logger.log(Level.INFO, " | Tamaño: ");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\nActualiza el valor 12 del tercer nodo por 13");
        listaCircular.editarPorReferencia(12, 13);
        listaCircular.listar();
        logger.log(Level.INFO, " | Tamaño: ");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\nActualiza el valor nodo en la posición 0 por 17");
        listaCircular.editarPorPosicion(0, 17);
        listaCircular.listar();
        logger.log(Level.INFO, " | Tamaño: ");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\nElimina el nodo con el valor 41");
        listaCircular.removerPorReferencia(41);
        listaCircular.listar();
        logger.log(Level.INFO, " | Tamaño: ");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\nElimina el nodo en la posición 4");
        listaCircular.removerPorPosicion(4);
        listaCircular.listar();
        logger.log(Level.INFO, " | Tamaño: ");
        logger.log(Level.INFO, listaCircular.getTamanio());

        logger.log(Level.INFO, "\nConsulta si existe el valor 30");
        logger.log(Level.INFO, listaCircular.buscar(30));

        logger.log(Level.INFO, "\nConsulta la posicion del valor 16");
        logger.log(Level.INFO, listaCircular.getPosicion(16));

        logger.log(Level.INFO, "\nElimina la lista");
        listaCircular.eliminar();

        logger.log(Level.INFO, "\nConsulta si la lista está vacia");
        logger.log(Level.INFO, listaCircular.esVacia());

        logger.log(Level.INFO, "\n\n<<-- Fin de ejemplo lista simple -->>");
    }
}
