/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.InterfazPlantas;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jose Rubin
 */
public class ProductoresBotonesJ extends Thread{
    
    public boolean stop;
    public int numero;
    public ProductoresBotonesJ (int threadNum){
        this.stop = true;
        this.numero = threadNum;
    }
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    @Override
    
    public void run(){
        while (this.stop){
            try {
                Main.mutexBotons.acquire();
                Main.semBotonesJ.acquire();
                Main.maxBotonesJ++;
                InterfazPlantas.AlmacenBotonesP1.setText(Integer.toString(Main.maxBotonesJ));
                Main.mutexBotons.release();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresBotonesJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
