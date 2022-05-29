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
public class EnsambladoresJ extends Thread{
    
    public Semaphore semMain;
    public Semaphore mutex;
    public boolean stop;
    public int numero;
    public EnsambladoresJ (Semaphore semMain, Semaphore semMutex){
        this.semMain = semMain;
        this.mutex = semMutex;
        this.stop = true;
        
    }
    @Override
    public void run(){
        while (this.stop){
        try {
            
            mutex.acquire();
            
            mutex.release();
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(EnsambladoresJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
