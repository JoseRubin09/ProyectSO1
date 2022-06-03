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
public class EnsambladoresJ extends Thread{
    
    public static Semaphore mutex = new Semaphore(1);
    public boolean stop;
    public int numero;
    public EnsambladoresJ (int num){
        this.numero = num;
        this.stop = true;
    }

    public void stopToggle(){
        this.stop = !this.stop;
    }
    
    @Override
    public void run(){
        while (this.stop){
        try {
            while(Main.countdownPlantaJ > 0){
                Main.mutexAssemb.acquire();
                if (Main.maxBotonesJ >= 2 && Main.maxCamsJ >= 2 && Main.maxPantJ >= 1 && Main.numPines >= 1){
                    
                    Main.mutexPins.acquire();
                    Main.numPines--;
                    InterfazPlantas.AlmacenPinesP1.setText(Integer.toString(Main.numPines));
                    Main.mutexPins.release();
                    
                    Main.maxBotonesJ = Main.maxBotonesJ - 2;
                    Main.semBotonesJ.release(2);
                    InterfazPlantas.AlmacenBotonesP1.setText(Integer.toString(Main.maxBotonesJ));
                    Main.mutexBotons.release();

                    Main.mutexCams.acquire();
                    Main.maxCamsJ = Main.maxCamsJ - 2;
                    Main.semCamarasJ.release(2);
                    InterfazPlantas.AlmacenCamsP1.setText(Integer.toString(Main.maxCamsJ));
                    Main.mutexCams.release();

                    Main.mutexPants.acquire();
                    Main.maxPantJ--;
                    Main.semPantJ.release(1);
                    InterfazPlantas.AlmacenPantallasP1.setText(Integer.toString(Main.maxPantJ));
                    Main.mutexPants.release();
                    
                    Main.mutexPhones.acquire();
                    Main.numTelef++;
                    InterfazPlantas.TelefonosPlanta1.setText(Integer.toString(Main.numTelef));
                    Main.mutexPhones.release();

                    Main.mutexAssemb.release();
                    Thread.sleep(2000);
                }
                else  Main.mutexAssemb.release();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(EnsambladoresJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
