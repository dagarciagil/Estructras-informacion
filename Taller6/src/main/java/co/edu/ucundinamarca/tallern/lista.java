package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class lista {

    nodo primero;
    nodo ultimo;
    Logger logger;
    int dato;

    public lista() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(int x) {
        nodo nuevo = new nodo();
        nuevo.datos = x;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }

    public void mostrar() {
        nodo actual = new nodo();
        actual = primero;
        do {
            
            System.out.println(actual.datos);
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public void buscar(int x) {
        nodo actual = new nodo();
        actual = ultimo;
        boolean encontrado = false;
 
        do {
            if (actual.datos == x) {
                encontrado = true;
                dato = actual.datos;
            }
            actual = actual.anterior;
        } while (actual!= ultimo);
        if (encontrado==true) {
            System.out.println("nodo encontrado");
            System.out.println(dato);
        } else {
           System.out.println("nodo no encontrado");
        }
    }
}
