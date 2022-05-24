package Classes;

import java.util.concurrent.Semaphore;

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
    public static Semaphore sem1 = new Semaphore(5);
    
   //Variables Rubin
    public static JefeJ jefeJ;
    public static GerenteJ gerenteJ;
    public static EnsambladoresJ assemblerJ;
    public static ProductoresBotonesJ producBotonesJ;
    public static ProductoresPinesJ producPins;
    public static ProductoresCamarasJ producCamsJ;
    public static ProductoresPantallasJ producPantJ;
    
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
    }
    
}
