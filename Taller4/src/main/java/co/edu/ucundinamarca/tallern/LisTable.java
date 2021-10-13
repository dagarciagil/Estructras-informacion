/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

public class LisTable {
    private Nodo cabeza=null;
    private int longitud;
  
    private class Nodo{
     public Elementos elemento;   
     public Nodo siguiente = null;

        public Nodo(Elementos elemento) {
            this.elemento = elemento;
        }
    }
    
    public void Agreegar(Elementos elemento){
    Nodo nodo= new Nodo(elemento);
    nodo.siguiente=cabeza;
    cabeza = nodo;
    longitud ++;
    }
    
    public boolean contiene(int n){
     if(cabeza == null){
      return false;
     }else{
     Nodo puntero = cabeza;
      int contador =0;
       while(contador < n && puntero.siguiente != null){
       puntero=puntero.siguiente;
       contador++;
       }
        if(contador != n){
        return false;
        }else{
         return true;
        }
      }   
    }
     
     public void eliminarElemento(int n){
     if(cabeza != null){
        if(n==0){
            Nodo primer = cabeza;
             cabeza= cabeza.siguiente;
             primer.siguiente = null;
             longitud--;
        }else if(n< longitud){
             Nodo puntero = cabeza;
             int contador =0;
             while(contador<(n-1)){
               puntero= puntero.siguiente;
               contador++;
             }
             Nodo temp= puntero.siguiente;
             puntero.siguiente=temp.siguiente;
             temp.siguiente=null;
             longitud--;
            }
     }
    }
     
    public boolean EstaVacia(){
     if(cabeza == null){
      return true;
      }
     return false;
     }
     
    public void PrimeroElemento(int n, Elementos elemento){
    Nodo nodo= new Nodo(elemento);
     if(cabeza == null){
     cabeza= nodo;
     }else{
      Nodo puntero = cabeza;
      int contador =0;
      while(contador < n && puntero.siguiente != null){
      puntero=puntero.siguiente;
      contador++;
      }
      nodo.siguiente=puntero.siguiente;
      puntero.siguiente=nodo;
     }
     longitud ++;
    }
    
    public void vaciar(){
        cabeza=null;
    }   
}