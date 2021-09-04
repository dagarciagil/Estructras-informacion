/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import juego.juego;

/**
 *
 * @author AsusTek
 */
public class Main2 {
    public static void main(String[] args) {
        juego instancia1 = new juego(5);
        instancia1.QuitaVida(0);
        instancia1.MuestraVidasRestantes();
        instancia1.Reiniciar_partida(5);
        instancia1.MuestraVidasRestantes();
        instancia1.Actualizar_record();
        juego segunda_instancia=new juego(5);
        segunda_instancia.Actualizar_record();
         
    }
   
}
