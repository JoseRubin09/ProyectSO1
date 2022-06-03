/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Classes.Main.tiempoDia;
import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author massimo
 */
public class ProductoresCamarasM extends Thread{
    
    

   
    //public Semaphore mutexCamarasM = new Semaphore(1);
    //public Semaphore mutex;
    public boolean stop;
    //public int maxPantallas;
    
    private int threadNumber;
 
    
    
    public ProductoresCamarasM (int threadNumber, int maxCamaras){
        //this.mutexCamarasM = mutexCamarasM;
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
            
            
            Main.semCamaras.acquire();
            
//            mutex.acquire();
            Main.mutexCamaras.acquire();
            
            
            Main.almacenCamarasM++;
            
            InterfazPlantas.AlmacenCamsP2.setText(Integer.toString(Main.almacenCamarasM));
                    
            System.out.println("Productor camara " + threadNumber + " produjo Camara " + Main.almacenCamarasM +"\n");
            
            Main.mutexCamaras.release();

    
            Thread.sleep(tiempoDia*2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductoresCamarasM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
