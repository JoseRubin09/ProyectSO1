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
public class ProductoresBotonesM extends Thread{
    
    //public Semaphore mutexBotonesM = new Semaphore(1);  
    public Semaphore semMain;
    //public Semaphore mutex;
    public boolean stop;
    //public int maxPantallas;
    
    private int threadNumber;
 
    
    
    public ProductoresBotonesM (int threadNumber, int maxPantallas){
        //this.mutexBotonesM = mutexBotonesM;
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
            
            
            Main.semBotones.acquire();
            
//            mutex.acquire();
            
            Main.mutexBotones.acquire();
            
            Main.almacenBotonesM++;
            
            InterfazPlantas.AlmacenBotonesP2.setText(Integer.toString(Main.almacenBotonesM));       
            System.out.println("Productor Boton " + threadNumber + " produjo Boton " + Main.almacenBotonesM+"\n");
            
            Main.mutexBotones.release();

    
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductoresBotonesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
