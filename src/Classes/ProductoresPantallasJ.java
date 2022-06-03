/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Rubin
 */
public class ProductoresPantallasJ extends Thread{
    
    public boolean stop;
    public int numero;
    public ProductoresPantallasJ (int threadNum){
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
                Main.semPantJ.acquire(1);
                Main.mutexPants.acquire();
                Main.maxPantJ++;
                InterfazPlantas.AlmacenPantallasP1.setText(Integer.toString(Main.maxPantJ));
                Main.mutexPants.release();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresPantallasJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
