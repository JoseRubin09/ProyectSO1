package Classes;
import Interfaces.InterfazPlantas;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.InterfazPlantas;
import static Interfaces.InterfazPlantas.Ensambladores2;
import static Interfaces.InterfazPlantas.ProductoresB2;
import static Interfaces.InterfazPlantas.ProductoresCams2;
import static Interfaces.InterfazPlantas.ProductoresPant2;
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
    public static volatile int countdownPlantaJ=30;
    public static volatile int countdownPlantaM=30;
    
    //Productor Pantalla yaaaa
    public static Semaphore semPantallas = new Semaphore(40);
    //Productor Pantalla
    public static ProductoresPantallasM ThreadPantallas;
    public static Semaphore mutexPantallas = new Semaphore(1);
    public static volatile int almacenPantallasM =0;
    public static int numProductoresPantallas=1;
    
    //Productor Botones yaaa
    public static Semaphore semBotones = new Semaphore(45);
    public static ProductoresBotonesM ThreadBotones;
    public static Semaphore mutexBotones = new Semaphore(1);
    public static volatile int almacenBotonesM = 0;
    public static int numProductoresBotones=1;
    
    //Productor Camaras yaaaaa
    public static Semaphore semCamaras = new Semaphore(20);
    public static ProductoresCamarasM ThreadCamaras;
    public static Semaphore mutexCamaras = new Semaphore(1);
    public static volatile int almacenCamarasM = 0;
    public static int numProductoresCamaras=1;
    
    //Productor Pin
    public static Semaphore semPines = new Semaphore(15);
    public static ProductoresPinesM ThreadPines;
    public static Semaphore mutexPines = new Semaphore(1);
    public static volatile int almacenPinesM = 0;
    public static int numProductoresPines=1;
    
    //Ensambladores Massimo
    public static Semaphore semEnsamblador = new Semaphore(1000);
    public static EnsambladoresM ThreadEnsamblador;
    
    public static volatile int almacenTelefonosM = 0;
    public static int numEnsambladoresM=1;
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
    public static volatile int numEnsamblador;
    
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
        JSONArray data = txtAction.readJson("/Users/massimo/SO/PROYECTO/ProyectSO1/src/Files/DataPlantas.json");
        Map<String, Object> map = (Map<String, Object>) data.get(0);
        for (String key : map.keySet())
            switch(key){
                case "tiempoDia": 
                    tiempoDia = Integer.valueOf((String)map.get(key));
                    break;
                case "countdown":
                    countdownPlantaJ = Integer.valueOf((String)map.get(key));
                    countdownPlantaM = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenBotonesPlanta1":
                    almcenMaxBotonesJ = Integer.valueOf((String)map.get(key));
                    break;
                case "producBotonesPlanta2":
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
                case "ensambladoresPlanta1":
                    numEnsamblador = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenBotonesPlanta2":
                    almacenBotonesM = Integer.valueOf((String)map.get(key));
                    
                    break;
                case "almacenPantsPlanta2":
                    almacenPantallasM = Integer.valueOf((String)map.get(key));
                    
                    break;
                case "almacenCamsPlanta2":
                    almacenCamarasM = Integer.valueOf((String)map.get(key));
                    
                    break;
                case "ensambladoresPlanta2":
                    numEnsambladoresM = Integer.valueOf((String)map.get(key));
                    System.out.println(numEnsambladoresM);
                    Ensambladores2.setText(Integer.toString(numEnsambladoresM));
                    break;
            }
            
        InterfazGrafica.setVisible(true);
    }
}
