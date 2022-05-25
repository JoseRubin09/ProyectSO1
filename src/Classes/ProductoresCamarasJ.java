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
public class ProductoresCamarasJ extends Thread{
    
    public boolean stop;
    public int numero;
    public ProductoresCamarasJ (Semaphore semCamsJ, int numero){
        this.stop = true;
        
    }
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    @Override
    
    public void run(){
        while (this.stop){
            try {
                Main.semCamarasJ.acquire(1);
                Main.maxCamsJ--;
                Main.semCamarasJ.acquire(1);
                Main.maxCamsJ--;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresCamarasJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
