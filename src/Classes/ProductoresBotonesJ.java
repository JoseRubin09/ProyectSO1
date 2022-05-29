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
public class ProductoresBotonesJ extends Thread{
    
    public boolean stop;
    public int numero;
    public Semaphore mutex;
    public ProductoresBotonesJ (Semaphore semBotonesJ, int numero, Semaphore semBotonsMutex){
        this.stop = true;
        this.mutex = semBotonsMutex;
    }
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    @Override
    
    public void run(){
        while (this.stop){
            try {
                mutex.acquire();
                Main.semBotonesJ.acquire(1);
                Main.maxBotonesJ--;
                mutex.release();
                mutex.acquire();
                Main.semBotonesJ.acquire(1);
                Main.maxBotonesJ--;
                mutex.release();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresBotonesJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
