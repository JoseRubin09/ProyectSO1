package Classes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Rubin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static volatile int countdownPlantaJ=30;
    public static volatile int countdownPlantaM=30;
    
    
   //Variables Rubin
    public static JefeJ jefeJ;
    public static GerenteJ gerenteJ;
    public static EnsambladoresJ assemblerJ;
    public static ProductoresBotonesJ producBotonesJ;
    public static ProductoresBotonesJ producBotonesJ2;
    public static ProductoresBotonesJ producBotonesJ3;
    public static ProductoresPinesJ producPins;
    public static ProductoresCamarasJ producCamsJ;
    public static ProductoresPantallasJ producPantJ;
    //Variables de Maximo Rubin
    public static Semaphore semBotonesJ = new Semaphore(45);
    public static Semaphore semCamarasJ = new Semaphore(20);
    public static Semaphore semPantJ = new Semaphore(40);
    public static Semaphore test = new Semaphore(1);
    public static volatile int maxBotonesJ = 45;
    public static volatile int maxCamsJ = 20;
    public static volatile int maxPantJ = 40;
    
    //Variables Massimo
//    public static JefeM jefeM;
//    public static GerenteM gerenteM;
//    public static EnsambladoresM assemblerM;
//    public static ProductoresBotonesM producBotonesM;
//    public static ProductoresPinesM producPinsM;
//    public static ProductoresCamarasM producCamsM;
//    public static ProductoresPantallasM producPantM;
    
    public static void main(String[] args) {
        // TODO code application logic here
        producBotonesJ = new ProductoresBotonesJ(semBotonesJ, maxBotonesJ);
        producBotonesJ2 = new ProductoresBotonesJ(semBotonesJ, maxBotonesJ);
        producBotonesJ3 = new ProductoresBotonesJ(semBotonesJ, maxBotonesJ);
        producPantJ = new ProductoresPantallasJ(semPantJ, maxPantJ);
        producCamsJ = new ProductoresCamarasJ(semCamarasJ, maxCamsJ);
        producBotonesJ.start();
        producCamsJ.start();
        producPantJ.start();
//        try {
//            test.acquire(1);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
