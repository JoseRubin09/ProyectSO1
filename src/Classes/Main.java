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
    
    public static volatile int countdown=30;
    public static volatile int maxCamaras=20;
    public static volatile int maxBotones=45;
    public static volatile int maxPantallas=40;
    
    
    
    public static Semaphore sem1 = new Semaphore(5);
    public static JefeJ jefeJ;
    public static GerenteJ gerenteJ;
    public static EnsambladoresJ assemblerJ;
    public static ProductoresBotonesJ producBotons;
    public static ProductoresPinesJ producPins;
    public static ProductoresCamarasJ producCams;
    public static ProductoresPantallasJ producScreens;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    
    
    }
    
}
