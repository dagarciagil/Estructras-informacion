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
public class Suma {
public static void main(String[] args) {
        
        int x = 0,y = 0,z = 0;
        Scanner teclado=new Scanner(System.in);
        operacion ob1 = new operacion(x,y,z);
        System.out.println("Digite un numero: ");
        x = teclado.nextInt();
        System.out.println("Digite otro numero:");
        y = teclado.nextInt();
        ob1.setSum1(x);
        ob1.setSum2(y);
        System.out.println("La suma es: "+ob1.getRes());
    }
}
