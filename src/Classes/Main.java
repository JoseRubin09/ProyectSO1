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
    
    public static volatile int countdownPlantaJ=30;
    public static volatile int countdownPlantaM=30;
    
    
   //Variables Rubin

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
    
    //Rubin Variables
    public static Semaphore semBotonesJ = new Semaphore(45);
    public static Semaphore semCamarasJ = new Semaphore(20);
    public static Semaphore semPantJ = new Semaphore(40);
    public static Semaphore mutexBotons = new Semaphore(1);
    public static Semaphore mutexPants = new Semaphore(1);
    public static Semaphore mutexCams = new Semaphore(1);
    public static volatile int maxBotonesJ = 45;
    public static volatile int maxCamsJ = 20;
    public static volatile int maxPantJ = 40;

    public static volatile int countdown=30;
    public static volatile int maxCamaras=20;
    public static volatile int maxBotones=45;
    public static volatile int maxPantallas=40;
    
    
    public static Semaphore sem1 = new Semaphore(5);

    public static JefeJ jefeJ;
    public static GerenteJ gerenteJ;
    public static EnsambladoresJ assemblerJ;
    public static ProductoresBotonesJ producBotonesJ;
    public static ProductoresBotonesJ producBotonesJ2;
    public static ProductoresBotonesJ producBotonesJ3;
    public static ProductoresPinesJ producPins;

    public static ProductoresCamarasJ producCamsJ;
    public static ProductoresPantallasJ producPantJ;

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        producBotonesJ = new ProductoresBotonesJ(semBotonesJ, maxBotonesJ, mutexBotons);
        producPantJ = new ProductoresPantallasJ(semPantJ, maxPantJ, mutexPants);
        producCamsJ = new ProductoresCamarasJ(semCamarasJ, maxCamsJ, mutexCams);
        producBotonesJ.start();
        producCamsJ.start();
        producPantJ.start();
        
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
    
    

    }

    
    
}
