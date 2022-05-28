package Classes;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
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
    
    //Productor Pantalla
    public static Semaphore semPantallas = new Semaphore(40);
    public static ProductoresPantallasM ThreadPantallas;
    public static Semaphore mutexPantallas = new Semaphore(1);
    public static volatile int almacenPantallasM =0;
    public static int numProductoresPantallas=5;
    
    //Productor Botones
    public static Semaphore semBotones = new Semaphore(45);
    public static ProductoresBotonesM ThreadBotones;
    public static Semaphore mutexBotones = new Semaphore(1);
    public static volatile int almacenBotonesM = 0;
    public static int numProductoresBotones=5;
    
    //Productor Camaras
    public static Semaphore semCamaras = new Semaphore(20);
    public static ProductoresCamarasM ThreadCamaras;
    public static Semaphore mutexCamaras = new Semaphore(1);
    public static volatile int almacenCamarasM = 0;
    public static int numProductoresCamaras=5;
    
    //Productor Pin
    public static Semaphore semPines = new Semaphore(15);
    public static ProductoresPinesM ThreadPines;
    public static Semaphore mutexPines = new Semaphore(1);
    public static volatile int almacenPinesM = 0;
    public static int numProductoresPines=5;
    
    
    //Productor Camara
    /*
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
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    
            
        for (int i = 0; i < numProductoresBotones; i++) {
            
 
            ThreadBotones = new ProductoresBotonesM(i,semBotones, almacenBotonesM);
            ThreadBotones.start();

            
        }
        
        for (int i = 0; i < numProductoresPantallas; i++) {
            
 
            ThreadPantallas = new ProductoresPantallasM(i,semPantallas, almacenPantallasM);
            ThreadPantallas.start();

            
        }
        
        for (int i = 0; i < numProductoresCamaras; i++) {
            
 
            ThreadCamaras = new ProductoresCamarasM(i,semCamaras, almacenCamarasM);
            ThreadCamaras.start();

            
        }
        
        
        for (int i = 0; i < numProductoresPines; i++) {
            
 
            ThreadPines = new ProductoresPinesM(i,semPines, almacenPinesM);
            ThreadPines.start();

            
        }
            /*
        System.out.println("hola");

        while (maxPantallas>1 && true){
            maxPantallas--;
            System.out.println("Quito pantalla");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        }    
    */
    
    
    }

    
    
}
