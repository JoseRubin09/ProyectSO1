/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author massimo
 */
public class ProductoresCamarasM extends Thread{
    
    

   
    public Semaphore semMain;
    public Semaphore mutex;
    public boolean stop;
    //public int maxPantallas;
    
    private int threadNumber;
 
    
    
    public ProductoresCamarasM (int threadNumber, Semaphore semMain, int maxCamaras){
        this.semMain = semMain;
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
            
            
            semMain.acquire();
            
//            mutex.acquire();

            Main.mutexCamaras.acquire();
            
            Main.almacenCamarasM++;
            
            System.out.println("Productor " + threadNumber + " produjo Camara " + Main.almacenCamarasM +"\n");
            
            Main.mutexCamaras.release();

    
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductoresCamarasM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
