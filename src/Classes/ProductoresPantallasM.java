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

public class ProductoresPantallasM extends Thread{
    

   
    //public Semaphore mutexpantallas = new Semaphore(1);    
    //public Semaphore mutex;
    public boolean stop;
    //public int maxPantallas;
    
    private int threadNumber;
 
    
    
    public ProductoresPantallasM (int threadNumber, int maxPantallas){
        //this.mutexpantallas = mutexpantallas;
        this.stop = true;
        this.threadNumber = threadNumber;
        
    }

    ProductoresPantallasM(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    
    @Override
    public void run(){
        while (this.stop){
        try {
            
            
            Main.semPantallas.acquire();
            
//            mutex.acquire();

            Main.mutexPantallas.acquire();
            
            Main.almacenPantallasM++;
            
            InterfazPlantas.AlmacenPantallasP2.setText(Integer.toString(Main.almacenPantallasM));
            
            
            System.out.println("Productor " + threadNumber + " produjo pantalla " + Main.almacenPantallasM +"\n");
            
            Main.mutexPantallas.release();

    
            Thread.sleep(tiempoDia*500);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProductoresPantallasM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}