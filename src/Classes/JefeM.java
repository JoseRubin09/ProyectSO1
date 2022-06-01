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
public class JefeM extends Thread {
    public boolean stop;
    
    
    private int threadNumber;

    public JefeM (int threadNumber){
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
            
            
            
            
//            mutex.acquire();

            Main.mutexContadorM.acquire();

            Thread.sleep(208,3);
            
            
            Main.contadorMassimo--;
            
            InterfazPlantas.TextJefePlanta5.setText(Integer.toString(Main.contadorMassimo));       
            
            
            Main.mutexContadorM.release();
            
            for (int i = 0; i < 29; i++) {
                Main.stadoJefeM = "Jugando";
                InterfazPlantas.TextJefePlanta3.setText(Main.stadoJefeM); 
                Thread.sleep(13,2);
                Main.stadoJefeM = "Haciendo papeleo";
                InterfazPlantas.TextJefePlanta3.setText(Main.stadoJefeM); 
                Thread.sleep(13,2);
                
                
                
            }

    
            
        } catch (InterruptedException ex) {
            Logger.getLogger(JefeM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }    
}
