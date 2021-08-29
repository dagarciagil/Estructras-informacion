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
public class operacion {
private int sum1, sum2,res;

    public operacion(int sum1, int sum2, int res) {
        this.sum1 = sum1;
        this.sum2 = sum2;
        this.res = res;
    }
    
    
    public int getSum1() {
        return sum1;
    }

    public void setSum1(int sum1) {
        this.sum1 = sum1;
    }

    public int getSum2() {
        return sum2;
    }

    public void setSum2(int sum2) {
        this.sum2 = sum2;
    }

    public int getRes() {
        res=sum1+sum2;
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
