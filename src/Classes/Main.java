package Classes;
import Interfaces.InterfazPlantas;

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
    public static int countdown;
    
    //Productor Pantalla
    public static Semaphore semPantallas = new Semaphore(40);
    public static ProductoresPantallasM ThreadPantallas;
    public static Semaphore mutexPantallas = new Semaphore(1);
    public static volatile int almacenPantallasM =0;
    public static int numProductoresPantallas=2;
    
    //Productor Botones yaaa
    public static Semaphore semBotones = new Semaphore(8);
    public static ProductoresBotonesM ThreadBotones;
    public static Semaphore mutexBotones = new Semaphore(1);
    public static volatile int almacenBotonesM = 0;
    public static int numProductoresBotones=2;
    
    //Productor Camaras yaaaaa
    public static Semaphore semCamaras = new Semaphore(8);
    public static ProductoresCamarasM ThreadCamaras;
    public static Semaphore mutexCamaras = new Semaphore(1);
    public static volatile int almacenCamarasM = 0;
    public static int numProductoresCamaras=2;
    
    //Productor Pin
    public static Semaphore semPines = new Semaphore(6);
    public static ProductoresPinesM ThreadPines;
    public static Semaphore mutexPines = new Semaphore(1);
    public static volatile int almacenPinesM = 0;
    public static int numProductoresPines=2;
    
    //Ensambladores Massimo
    public static Semaphore semEnsamblador = new Semaphore(4);
    public static EnsambladoresM ThreadEnsamblador;
    
    public static volatile int almacenTelefonosM = 0;
    public static int numEnsambladoresM=2;
    //aaaaaaaa
    public static Semaphore mutexEnsambladorM = new Semaphore(1);
    
    //JEFE MASSIMO
    //public static Semaphore semJefe = new Semaphore(1);
    public static JefeM ThreadJefeM;
    public static volatile int contadorMassimo = 30;
    public static int numJefeM=1;
    public static Semaphore mutexContadorM = new Semaphore(1);
    public static String stadoJefeM="";
    
    //GERENTE MASSIMO
    public static GerenteM ThreadGerenteM;
    public static int numGerenteM=1;
    public static int descuentoJefeM=0;
    public static String stadoGerenteM="";
    
    
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
    
    //Rubin Numero de productores
    public static volatile int producNumBotonesJ;
    public static volatile int producNumCamsJ;
    public static volatile int producNumPantJ;
    public static volatile int producNumPinesJ;

    //Massimo Numero de productores
    public static volatile int producNumBotonesM;
    public static volatile int producNumCamsM;
    public static volatile int producNumPantM;
    
    public static volatile int numTelef = 0;
    public static volatile int almcenMaxBotonesJ;
    public static volatile int almcenMaxPantJ;
    public static volatile int almcenMaxCamsJ;

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
                    tiempoDia = Integer.valueOf((String)map.get(key));
                    break;
                case "countdown":
                    countdown = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenBotonesPlanta1":
                    almcenMaxBotonesJ = Integer.valueOf((String)map.get(key));
                    break;
                case "producBotonesPlanta1":
                    almcenMaxBotonesJ = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenPantsPlanta1":
                    almcenMaxPantJ = Integer.valueOf((String)map.get(key));
                    break;
                case "producPantsPlanta1":
                    almcenMaxPantJ = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenCamsPlanta1":
                    almcenMaxCamsJ = Integer.valueOf((String)map.get(key));
                    break;
                case "producCamsPlanta1":
                    almcenMaxCamsJ = Integer.valueOf((String)map.get(key));
                    break;
//                case "ensambladoresPlanta1":
//                    ensambladores = Integer.valueOf((String)map.get(key));
//                    break;
//                case "almacenBotonesPlanta2":
//                    almacenCamarasM = Integer.valueOf((String)map.get(key));
//                    break;
//                case "almacenPantsPlanta2":
//                    despachoDias = Integer.valueOf((String)map.get(key));
//                    break;
//                case "almacenCamsPlanta2":
//                    almacenCamarasM = Integer.valueOf((String)map.get(key));
//                    break;
//                case "ensambladoresPlanta2":
//                    despachoDias = Integer.valueOf((String)map.get(key));
//                    break;
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
