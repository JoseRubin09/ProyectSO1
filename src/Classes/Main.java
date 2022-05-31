package Classes;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.InterfazPlantas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
    public static InterfazPlantas InterfazGrafica = new InterfazPlantas();
    public static int tiempoDia;
    public static int despachoDias;
    
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
    public static Semaphore semCamarasJ = new Semaphore(20);
    public static Semaphore semPantJ = new Semaphore(40);
    public static Semaphore semBotonesJ = new Semaphore(45);
    public static Semaphore mutexBotons = new Semaphore(1);
    public static Semaphore mutexPants = new Semaphore(1);
    public static Semaphore mutexCams = new Semaphore(1);
    public static Semaphore mutexPins = new Semaphore(1);
    public static Semaphore mutexPhones = new Semaphore(1);
    public static Semaphore mutexAssemb = new Semaphore(1);
    public static volatile int maxBotonesJ = 0;
    public static volatile int maxCamsJ = 0;
    public static volatile int maxPantJ = 0;
    public static volatile int numPines = 0;
    public static volatile int numTelef = 0;
    public static volatile int almcenMaxBotonesJ;
    public static volatile int almcenMaxPantJ;
    public static volatile int almcenMaxCamsJ;

    public static volatile int countdown=30;
    
    public static JefeJ jefeJ;
    public static GerenteJ gerenteJ;
    public static EnsambladoresJ ensamblador;
    public static ProductoresBotonesJ producBotonesJ;
    public static ProductoresPinesJ producPins;
    public static ProductoresCamarasJ producCamsJ;
    public static ProductoresPantallasJ producPantJ;
    public static ReadFile txtAction = new ReadFile();
    
    ArrayList dataList = new ArrayList();

   
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here

        JSONArray data = txtAction.readJson("src\\Files\\DataPlantas.json");
        Map<String, Object> map = (Map<String, Object>) data.get(0);
        for (String key : map.keySet())
            switch(key){
                case "tiempoDia": 
                    tiempoDia = (Integer)map.get(key);
                    break;
                case "despachoDias":
                    despachoDias = (Integer)map.get(key);
                    break;
                case "almacenBotonesPlanta1":
                    almcenMaxBotonesJ = (Integer)map.get(key);
                    break;
                case "almacenPantsPlanta1":
                    almcenMaxPantJ = (Integer)map.get(key);
                    break;
                case "almacenCamsPlanta1":
                    almcenMaxCamsJ = (Integer)map.get(key);
                    break;
                case "ensambladoresPlanta1":
                    despachoDias = (Integer)map.get(key);
                    break;
                case "almacenBotonesPlanta2":
                    despachoDias = (Integer)map.get(key);
                    break;
                case "almacenPantsPlanta2":
                    despachoDias = (Integer)map.get(key);
                    break;
                case "almacenCamsPlanta2":
                    despachoDias = (Integer)map.get(key);
                    break;
                case "ensambladoresPlanta2":
                    despachoDias = (Integer)map.get(key);
                    break;
            }
            

        InterfazGrafica.setVisible(true);
        
        //Threads Rubin
//        for (int i = 0; i < InterfazGrafica.numEnsamJ; i++) {
//            ensamblador = new EnsambladoresJ(InterfazGrafica.numEnsamJ);
//            ensamblador.start();
//        }
//        
//        for (int i = 1; i < 3; i++) {
//            producBotonesJ = new ProductoresBotonesJ(i);
//            producBotonesJ.start();
//        }
//        
//        for (int i = 1; i < 4; i++) {
//            producPantJ = new ProductoresPantallasJ(i);
//            producPantJ.start();
//        }
//        
//        for (int i = 1; i < 5; i++) {
//            producCamsJ = new ProductoresCamarasJ(i);
//            producCamsJ.start();
//        }
//        
//        for (int i = 1; i < 4; i++) {
//            producPins = new ProductoresPinesJ(i);
//            producPins.start();
//        }
//        
//        gerenteJ = new GerenteJ();
//        jefeJ = new JefeJ();
        
//        for (int i = 1; i < numProductoresBotones; i++) {
//            
// 
//            ThreadBotones = new ProductoresBotonesM(i,semBotones, almacenBotonesM);
//            ThreadBotones.start();
//
//            
//        }
//        for (int i = 0; i < numProductoresPantallas; i++) {
//            
// 
//            ThreadPantallas = new ProductoresPantallasM(i,semPantallas, almacenPantallasM);
//            ThreadPantallas.start();
//
//            
//        }
//        
//        for (int i = 0; i < numProductoresCamaras; i++) {
//            
// 
//            ThreadCamaras = new ProductoresCamarasM(i,semCamaras, almacenCamarasM);
//            ThreadCamaras.start();
//
//            
//        }
//        
//        
//        for (int i = 0; i < numProductoresPines; i++) {
//            
// 
//            ThreadPines = new ProductoresPinesM(i,semPines, almacenPinesM);
//            ThreadPines.start();
//
//            
//        }

    

    }

    
    
}
