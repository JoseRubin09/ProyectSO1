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
public class ProductoresBotonesM extends Thread{
    
      
    public Semaphore semMain;
    public Semaphore mutex;
    public boolean stop;
    //public int maxPantallas;
    
    private int threadNumber;
 
    
    
    public ProductoresBotonesM (int threadNumber, Semaphore semMain, int maxPantallas){
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
            Main.mutexBotones.acquire();
            
            Main.almacenBotonesM++;
            System.out.println("Productor Boton " + threadNumber + " produjo Boton " + Main.almacenBotonesM+"\n");
            
            Main.mutexBotones.release();

    
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductoresPantallasM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
