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
public class JefeJ extends Thread{
    
    public Semaphore semMain;
    public static Semaphore mutex = new Semaphore(1);
    public boolean stop;
    public JefeJ (){
        this.stop = true;
        
    }
    
    @Override
    public void run(){
        while(this.stop){
            try {
                mutex.acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(JefeJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
