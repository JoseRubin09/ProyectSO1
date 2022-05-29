/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
    public ProductoresPantallasJ (Semaphore semPantJ, int numero){
        this.stop = true;
        
    }
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    @Override
    
    public void run(){
        while (this.stop){
            try {
                Main.semPantJ.acquire(1);
                Main.maxPantJ--;
                Main.semPantJ.acquire(1);
                Main.maxPantJ--;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresPantallasJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
