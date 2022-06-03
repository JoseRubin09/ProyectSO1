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
public class ProductoresPinesJ extends Thread{
    
    public boolean stop;
    public int numero;
    public ProductoresPinesJ (int threadNum){
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
                Main.semPinesJ.acquire();
                Main.mutexPins.acquire();
                Main.numPines++;
                InterfazPlantas.AlmacenPinesP1.setText(Integer.toString(Main.numPines));
                Main.mutexPins.release();
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductoresPantallasJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
