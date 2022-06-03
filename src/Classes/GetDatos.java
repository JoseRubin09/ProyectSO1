/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.Main.almacenBotonesM;
import static Classes.Main.almacenCamarasM;
import static Classes.Main.almacenPantallasM;
import static Classes.Main.almcenMaxBotonesJ;
import static Classes.Main.numMaxPantsM;
import static Classes.Main.almcenMaxPantJ;
import static Classes.Main.contadorMassimo;
import static Classes.Main.countdownPlantaJ;
import static Classes.Main.numEnsamblador;
import static Classes.Main.numEnsambladoresM;
import static Classes.Main.tiempoDia;
import static Classes.Main.numMaxPantsJ;
import static Classes.Main.numMaxBotM;
import static Classes.Main.numMaxBotJ;
import static Classes.Main.numMaxCamsM;
import static Classes.Main.numMaxCamsJ;
import static Classes.Main.numMaxPinsM;
import static Classes.Main.numMaxPinsJ;
import static Classes.Main.numEnsamM;
import static Classes.Main.numProductoresBotones;
import static Classes.Main.numProductoresCamaras;
import static Classes.Main.numProductoresPantallas;
import static Classes.Main.numProductoresPines;
import static Classes.Main.producNumBotonesJ;
import static Classes.Main.producNumCamsJ;
import static Classes.Main.producNumPantJ;
import static Classes.Main.producNumPinesJ;
import static Classes.Main.txtAction;
import static Interfaces.InterfazPlantas.Ensambladores1;
import static Interfaces.InterfazPlantas.Ensambladores2;
import static Classes.Main.promedioGastos1;
import static Classes.Main.promedioGastos2;
import static Classes.Main.promedioGanancias1;
import static Classes.Main.promedioGanancias2;
import static Classes.Main.promedioTelefGanancias1;
import static Classes.Main.promedioTelefGanancias2;
import static Classes.Main.promedioNumTotalTelef1;
import static Classes.Main.promedioNumTotalTelef2;
import static Classes.Main.promedioPerdidaJefes1;
import static Classes.Main.promedioPerdidaJefes2;
import static Interfaces.InterfazPlantas.ProductoresB1;
import static Interfaces.InterfazPlantas.ProductoresB2;
import static Interfaces.InterfazPlantas.ProductoresCams1;
import static Interfaces.InterfazPlantas.ProductoresCams2;
import static Interfaces.InterfazPlantas.ProductoresPant1;
import static Interfaces.InterfazPlantas.ProductoresPant2;
import static Interfaces.InterfazPlantas.ProductoresPines1;
import static Interfaces.InterfazPlantas.ProductoresPines2;
import static Interfaces.InterfazPlantas.countdownJOSE;
import static Interfaces.InterfazPlantas.countdownMASSIMO;
import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONArray;

    //Arrays para sacar el promedio de los datos que queramos en el dashboard


/**
 *
 * @author Jose Rubin
 */
public class GetDatos {
    
    ArrayList dataGastos1 = new ArrayList();
    ArrayList dataGastos2 = new ArrayList();
    ArrayList dataGanancia1 = new ArrayList();
    ArrayList dataGanancia2 = new ArrayList();
    ArrayList telefGanancia1 = new ArrayList();
    ArrayList telefGanancia2 = new ArrayList();
    ArrayList telefTotal1 = new ArrayList();
    ArrayList telefTotal2 = new ArrayList();
    ArrayList perdidaJefe1 = new ArrayList();
    ArrayList perdidaJefe2 = new ArrayList();
    
    public static int totalGastosSalario1;
    public static int totalGastosSalario2;
    public static int totalGananciaNeta1;
    public static int totalGananciaNeta2;
    public static int totalTelefonosGan1;
    public static int totalTelefonosGan2;
    public static int totalnumTelefonos1;
    public static int totalnumTelefonos2;
    public static int totalperdidaJefe1;
    public static int totalperdidaJefe2;
    
    public void getData(){
    
        JSONArray data = txtAction.readJson("C:\\Users\\Jose Rubin\\Desktop\\Projects\\ProyectSO1\\src\\Files\\DataPlantas.json");
        Map<String, Object> map = (Map<String, Object>) data.get(0);
        for (String key : map.keySet())
            switch(key){
                case "tiempoDia": 
                    tiempoDia = Integer.valueOf((String)map.get(key));
                    break;
                case "countdown":
                    countdownPlantaJ = Integer.valueOf((String)map.get(key));
                    contadorMassimo = Integer.valueOf((String)map.get(key));
                    countdownJOSE.setText(Integer.toString(countdownPlantaJ));
                    countdownMASSIMO.setText(Integer.toString(countdownPlantaJ));
                    break;
                case "almacenBotonesPlanta1":
                    numMaxBotJ = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenPantsPlanta1":
                    numMaxPantsJ = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenCamsPlanta1":
                    numMaxCamsJ = Integer.valueOf((String)map.get(key));
                    break;
                case "ensambladoresPlanta1":
                    numEnsamblador = Integer.valueOf((String)map.get(key));
                    Ensambladores1.setText(Integer.toString(numEnsamblador));
                    break;
                case "almacenBotonesPlanta2":
                    numMaxBotM = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenPantsPlanta2":
                    numMaxCamsM = Integer.valueOf((String)map.get(key));
                    break;
                case "almacenCamsPlanta2":
                    numMaxCamsJ = Integer.valueOf((String)map.get(key));
                    break;
                case "ensambladoresPlanta2":
                    numEnsambladoresM = Integer.valueOf((String)map.get(key));
                    Ensambladores2.setText(Integer.toString(numEnsambladoresM));
                    break;
                case "producBotones1":
                    producNumBotonesJ = Integer.valueOf((String)map.get(key));
                    ProductoresB1.setText(Integer.toString(producNumBotonesJ));
                    break;
                case "producBotones2":
                    numProductoresBotones = Integer.valueOf((String)map.get(key));
                    ProductoresB2.setText(Integer.toString(numProductoresBotones));
                    break;
                case "producCamaras1":
                    producNumCamsJ = Integer.valueOf((String)map.get(key));
                    ProductoresCams1.setText(Integer.toString(producNumCamsJ));
                    break;
                case "producCamaras2":
                    numProductoresCamaras = Integer.valueOf((String)map.get(key));
                    ProductoresCams2.setText(Integer.toString(numProductoresCamaras));
                    break;
                case "producPantallas1":
                    producNumPantJ = Integer.valueOf((String)map.get(key));
                    ProductoresPant1.setText(Integer.toString(producNumPantJ));
                    break;
                case "producPantallas2":
                    numProductoresPantallas = Integer.valueOf((String)map.get(key));
                    ProductoresPant2.setText(Integer.toString(numProductoresPantallas));
                    break;
                case "producPines1":
                    producNumPinesJ = Integer.valueOf((String)map.get(key));
                    ProductoresPines1.setText(Integer.toString(producNumPinesJ));
                    break;
                case "producPines2":
                    numProductoresPines = Integer.valueOf((String)map.get(key));
                    ProductoresPines2.setText(Integer.toString(numProductoresPines));
                    break;
            }
    }
    
    public void getDataforDashboard(){
        
        JSONArray data2 = txtAction.readJson("C:\\Users\\Jose Rubin\\Desktop\\Projects\\ProyectSO1\\src\\Files\\DataHistorica.json");
        Map<String, Object> map2 = (Map<String, Object>) data2.get(0);
        for (String key2 : map2.keySet())
            switch(key2){
                case "GastosSalario1": 
                    dataGastos1 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<dataGastos1.size(); i++){
                        totalGastosSalario1 = totalGastosSalario1 + Integer.valueOf((String)dataGastos1.get(i));
                    }
                    promedioGastos1 = totalGastosSalario1/dataGastos1.size();
                    break;
                case "GastosSalario2":
                    dataGastos2 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<dataGastos2.size(); i++){
                        totalGastosSalario2 = totalGastosSalario2 + Integer.valueOf((String)dataGastos2.get(i));
                    }
                    promedioGastos2 = totalGastosSalario2/dataGastos2.size();
                    break;
                case "GananciaNeta1":
                    dataGanancia1 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<dataGanancia1.size(); i++){
                        totalGananciaNeta1 = totalGananciaNeta1 + Integer.valueOf((String)dataGanancia1.get(i));
                    }
                    promedioGanancias1 = totalGananciaNeta1/dataGanancia1.size();
                    break;
                case "GananciaNeta2":
                    dataGanancia2 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<dataGanancia2.size(); i++){
                        totalGananciaNeta2 = totalGananciaNeta2 + Integer.valueOf((String)dataGanancia2.get(i));
                    }
                    promedioGanancias2 = totalGananciaNeta2/dataGanancia2.size();
                    break;
                case "TelefonosGanancia1":
                    telefGanancia1 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<telefGanancia1.size(); i++){
                        totalTelefonosGan1 = totalTelefonosGan1 + Integer.valueOf((String)telefGanancia1.get(i));
                    }
                    promedioTelefGanancias1 = totalTelefonosGan1/telefGanancia1.size();
                    break;
                case "TelefonosGanancia2":
                    telefGanancia2 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<telefGanancia2.size(); i++){
                        totalTelefonosGan2 = totalTelefonosGan2 + Integer.valueOf((String)telefGanancia2.get(i));
                    }
                    promedioTelefGanancias2 = totalTelefonosGan2/telefGanancia2.size();
                    break;
                case "numTelefonosTotal1":
                    telefTotal1 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<telefTotal1.size(); i++){
                        totalnumTelefonos1 = totalnumTelefonos1 + Integer.valueOf((String)telefTotal1.get(i));
                    }
                    promedioNumTotalTelef1 = totalnumTelefonos1/telefTotal1.size();
                    break;
                case "numTelefonosTotal2":
                    telefTotal2 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<telefTotal2.size(); i++){
                        totalnumTelefonos2 = totalnumTelefonos2 + Integer.valueOf((String)telefTotal2.get(i));
                    }
                    promedioNumTotalTelef2 = totalnumTelefonos2/telefTotal2.size();
                    break;
                case "perdidaJefe1":
                    perdidaJefe1 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<perdidaJefe1.size(); i++){
                        totalperdidaJefe1 = totalperdidaJefe1 + Integer.valueOf((String)perdidaJefe1.get(i));
                    }
                    promedioPerdidaJefes1 = totalperdidaJefe1/perdidaJefe1.size();
                    break;
                case "perdidaJefe2":
                    perdidaJefe2 = (ArrayList) map2.get(key2);
                    for (int i = 0; i<perdidaJefe2.size(); i++){
                        totalperdidaJefe2 = totalperdidaJefe2 + Integer.valueOf((String)perdidaJefe2.get(i));
                    }
                    promedioPerdidaJefes2 = totalperdidaJefe2/perdidaJefe2.size();
                    break;
        }
    }    
}
