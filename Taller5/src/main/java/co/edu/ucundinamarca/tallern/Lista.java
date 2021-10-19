/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Lista {

    nodo ultimo;
    Logger logger;

    public Lista() {
        ultimo = null;
    }

    //se sabe cuando la lista esta vacia
    public boolean EstaVacia() {
        return ultimo == null;
    }

    //insertar nodos
    public Lista insertar(int elemento) {
        nodo nuevo = new nodo(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    //recorrer o mostrar la lista
    public void mostrarLista() {

        nodo aux = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "{" + aux.dato + "}->";
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena,
                "Mostrando la lista circular", JOptionPane.INFORMATION_MESSAGE);
    }

    //eliminar un nodo de la lista circular
    public boolean Eliminar(int elemento) {
        nodo actual;
        boolean encontrado = false;
        actual = ultimo;
        while (actual.siguiente != ultimo && !encontrado) {
            encontrado = (actual.siguiente.dato == elemento);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.dato == elemento);
        if (encontrado) {
            nodo aux;
            aux = actual.siguiente;
            if (ultimo == ultimo.siguiente) {
                ultimo = null;
            } else {
                if (aux == ultimo) {
                    ultimo = actual;
                }
                actual.siguiente = aux.siguiente;
            }
            aux=null;
        }
        return encontrado==true;
    }
}
