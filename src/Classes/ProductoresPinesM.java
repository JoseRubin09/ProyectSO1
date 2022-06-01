/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author massimo
 */
public class ProductoresPinesM extends Thread {
    

    //public Semaphore mutexPinesM = new Semaphore(1);
    public Semaphore semMain;
    //public Semaphore mutex;
    public boolean stop;
    //public int maxPantallas;
    
    private int threadNumber;
 
    
    
    public ProductoresPinesM (int threadNumber, int maxPines){
        //this.mutexPinesM = mutexPinesM;
        this.stop = true;
        this.threadNumber = threadNumber;
        
    }
    
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    
    @Override
    public void run(){
        while (this.stop){
        try {
            
            
            Main.semPines.acquire();
            
//            mutex.acquire();

            Main.mutexPines.acquire();
            
            Main.almacenPinesM++;
            
            InterfazPlantas.AlmacenPinesP2.setText(Integer.toString(Main.almacenPinesM));       
            System.out.println("Productor Pin " + threadNumber + " produjo Pin " + Main.almacenPinesM +"\n");
            
            Main.mutexPines.release();

    
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductoresPinesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
