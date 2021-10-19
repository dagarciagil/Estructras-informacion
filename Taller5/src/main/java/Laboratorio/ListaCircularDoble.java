
package Laboratorio;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ListaCircularDoble {
 

    private  int contador;
    class Nodo {

        Object dato;
        ListaCircularDoble.Nodo anterior, siguiente;
    }
    ListaCircularDoble.Nodo inicio;

    public void insertarInicio(Object v) {
        if (inicio == null) { // cuando no se ha creado ningun nodo
            inicio = new ListaCircularDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
            inicio.dato = v; // se inserta el dato
            inicio.siguiente = inicio;
            inicio.anterior = inicio;
            contador++;
        } else {
            //ingresar al final
            ListaCircularDoble.Nodo nuevo = new ListaCircularDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
            nuevo.dato = v;// se inserta el dato
            nuevo.siguiente = inicio; //nuevo en su .next apunta hacia nuestro nodo inicio
            nuevo.anterior = inicio.anterior; // nuevo en su .ant apunta al nodo que es el final
            inicio.anterior = nuevo; //nuevo en su .ant apunta hacia nuestro nodo nuevo
            nuevo.anterior.siguiente = nuevo; //nuevo en su nodo anterioir en su .next apunta hacia nuestro nodo nuevo
            inicio = nuevo; //ahora inicio apunta a nuestro nodo Nuevo
            contador++;
        }
    }

    public void insertarDatoInicio(Object v) {
        if (inicio != null) {
            ListaCircularDoble.Nodo nuevo = new ListaCircularDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
            nuevo.dato = v;// se inserta el dato
            ListaCircularDoble.Nodo aux = inicio.anterior;// creamos temportal para reposicionar la direccion de los nodos
            nuevo.anterior = aux;// enlazo el nuevo nodo con el ultimo nodo de la lista 
            aux.siguiente = nuevo; //el ultimo nodo lo apunto en su siguiente al nuevo nodo
            inicio.anterior=nuevo;// el primer nodo lo enlazon en su anterio con el nuevo nodo
            nuevo.siguiente = inicio;//el nuevo nodo en su siguiente lo enlazo con el primero
            inicio = nuevo;//ahora el nuevo nodo apunta al inicio   
            contador++;
        }
    }
   
    public void insertarEnmedio(Object v) {
        
        int cont = 1;
        ListaCircularDoble.Nodo auxiliar = inicio;
        while (auxiliar.siguiente != inicio) {
            int medio = (int) (contador / 2);
            if (cont == medio) {
                ListaCircularDoble.Nodo nuevo = new ListaCircularDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
                nuevo.dato = v;// se inserta el dato
                ListaCircularDoble.Nodo auxiliar2 = auxiliar.siguiente;
                auxiliar.siguiente = nuevo;
                nuevo.anterior = auxiliar;
                nuevo.siguiente = auxiliar2;
                auxiliar2.anterior = nuevo;
                contador++;
                break;
            }

            cont++;
            auxiliar = auxiliar.siguiente;
        }
    }
    public void insertarEnPosicion(Object v,int pos) {
        
        int cont = 1;
        ListaCircularDoble.Nodo auxiliar = inicio;
        while (auxiliar.siguiente != inicio) {
            if (cont == pos -1) {
                ListaCircularDoble.Nodo nuevo = new ListaCircularDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
                nuevo.dato = v;// se inserta el dato
                ListaCircularDoble.Nodo auxiliar2 = auxiliar.siguiente;
                auxiliar.siguiente = nuevo;
                nuevo.anterior = auxiliar;
                nuevo.siguiente = auxiliar2;
                auxiliar2.anterior = nuevo;
                contador++;
                break;
            }

            cont++;
            auxiliar = auxiliar.siguiente;
        }
    }

    public Object extraerInicio() {
        if (inicio != null) {
            Object v;
            if (inicio.siguiente != inicio) {
                v = inicio.dato; // se inserta el dato
                inicio.siguiente.anterior = inicio.anterior; // inicio en su nodo siguiente, en su .ant apunta al nodo anterior de inicio
                inicio.anterior.siguiente = inicio.siguiente; // inicio en su nodo anterior, en su .next apunta al nodo siguiente de inicio
                inicio = inicio.siguiente;
                contador--;
            } else {
                v = inicio.dato;
                inicio = null;
            }
            return v;
        }
        return -1;
    }

    public Object extraerFinal() {
        if (inicio != null) {
            Object v;
            if (inicio.siguiente != inicio) {
                v = inicio.anterior.dato;
                inicio.anterior.anterior.siguiente = inicio;//inicio en su nodo anterior, anterior, en su .next apunta a inicio
                inicio.anterior = inicio.anterior.anterior; //inicio en su .next apunta a inicio en su nodo anterior en su .ant
                contador--;
                return v;//se retorna el valo
            } else {
                return extraerInicio();//se llama a este metodo para extraer inicio, ya que solo tenemos un nodo 
                //el cual es inicio y final a la vez, y a traves de exte metodo se extrae :D
            }
        }
        return -1;
    }

    public void buscar(String palabra) {
        boolean estado = false;
        ListaCircularDoble.Nodo aux = inicio;
        if (aux != null) {
            while (aux.siguiente != inicio) {
                if (aux.dato.equals(palabra)) {
                    estado = true;
                    break;
                }
                aux = aux.siguiente;
            }
            if (estado) {
                JOptionPane.showMessageDialog(null, "si esta!");
            } else {
                JOptionPane.showMessageDialog(null, "No esta!", "Erorr", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void eliminar(String palabra) {
        boolean estado = false;
        ListaCircularDoble.Nodo aux = inicio;
        if (aux != null) {
            while (aux.siguiente != inicio) {
                if (aux.dato.equals(palabra)) {
                    inicio.siguiente.anterior = aux.anterior; // inicio en su nodo siguiente, en su .ant apunta al nodo anterior de inicio
                    inicio.anterior.siguiente = aux.siguiente; // inicio en su nodo anterior, en su .next apunta al nodo siguiente de inicio
                    inicio = inicio.siguiente;
                    estado = true;
                }
                aux = aux.siguiente;
            }
        }
    }
    /**
     * metodo para imprimir en jlist
     * @return 
     */
    public DefaultListModel<String> mostrarL() {
        DefaultListModel<String> l1 = new DefaultListModel<>();

        ListaCircularDoble.Nodo aux = inicio;
        if (aux != null) {
            l1.addElement(" dato | siguiente | anterior");
            while (aux.siguiente != inicio) {
                l1.addElement(
                        aux.dato + " | "
                        + aux.anterior.dato + " | "
                        + aux.siguiente.dato);
                aux = aux.siguiente;
            }
            l1.addElement(
                    aux.dato + " | "
                    + aux.anterior.dato + " | "
                    + aux.siguiente.dato);
        }
        return l1;
    }
}
