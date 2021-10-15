/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author AsusTek
 */
public class Lista {
    nodo ultimo;
    
    public Lista(){
    ultimo=null;
    }
    
    //se sabe cuando la lista esta vacia
    public boolean EstaVacia(){
     return ultimo==null;
    }
    
    //insertar nodos
    public Lista insertar(int elemento){
    nodo nuevo=new nodo(elemento);
     if(ultimo!= null){
     nuevo.siguiente=ultimo.siguiente;
     ultimo.siguiente=nuevo;
     }
     ultimo=nuevo;
     return this;
    }
    
    //recorrer o mostrar la lista
    public void mostrarLista(){
    nodo aux=ultimo.siguiente;
    
    }
}
