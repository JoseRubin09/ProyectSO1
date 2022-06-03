/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.Main.txtAction;
import static Interfaces.InterfazPlantas.GananciasTotales1;
import static Interfaces.InterfazPlantas.GananciasTotales2;
import static Interfaces.InterfazPlantas.GastosSalario1;
import static Interfaces.InterfazPlantas.GastosSalario2;
import static Interfaces.InterfazPlantas.JefePerdido1;
import static Interfaces.InterfazPlantas.JefePerdido2;
import static Interfaces.InterfazPlantas.TelefonosPlanta1;
import static Interfaces.InterfazPlantas.TelefonosPlanta2;
import static Interfaces.InterfazPlantas.UltimoLote1;
import static Interfaces.InterfazPlantas.UltimoLote2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



/**
 *
 * @author Jose Rubin
 */
public class WriteFile {
    
    ArrayList newdataGastos1 = new ArrayList();
    ArrayList newdataGastos2 = new ArrayList();
    ArrayList newdataGanancia1 = new ArrayList();
    ArrayList newdataGanancia2 = new ArrayList();
    ArrayList newtelefGanancia1 = new ArrayList();
    ArrayList newtelefGanancia2 = new ArrayList();
    ArrayList newtelefTotal1 = new ArrayList();
    ArrayList newtelefTotal2 = new ArrayList();
    ArrayList newperdidaJefe1 = new ArrayList();
    ArrayList newperdidaJefe2 = new ArrayList();
    Path currentRelativePath = Paths.get("");
    String s = currentRelativePath.toAbsolutePath().toString();

    public void writeData(){
        JSONArray data3 = txtAction.readJson("DataHistorica.json");
        Map<String, Object> map2 = (Map<String, Object>) data3.get(0);
        JSONObject obj = new JSONObject();
        JSONArray newJson = new JSONArray();
        for (String key2 : map2.keySet())
            switch(key2){
                case "GastosSalario1": 
                    newdataGastos1 = (JSONArray) map2.get(key2);
                    newdataGastos1.add(GastosSalario1.getText());
                    obj.put(key2, newdataGastos1);
                    break;
                case "GastosSalario2":
                    newdataGastos2 = (JSONArray) map2.get(key2);
                    newdataGastos2.add(GastosSalario2.getText());
                    obj.put(key2, newdataGastos2);
                    break;
                case "GananciaNeta1":
                    newdataGanancia1 = (JSONArray) map2.get(key2);
                    newdataGanancia1.add(GananciasTotales1.getText());
                    obj.put(key2, newdataGanancia1);
                    break;
                case "GananciaNeta2":
                    newdataGanancia2 = (JSONArray) map2.get(key2);
                    newdataGanancia2.add(GananciasTotales2.getText());
                    obj.put(key2, newdataGanancia2);
                    break;
                case "TelefonosGanancia1":
                    newtelefGanancia1 = (JSONArray) map2.get(key2);
                    newtelefGanancia1.add(UltimoLote1.getText());
                    obj.put(key2, newtelefGanancia1);
                    break;
                case "TelefonosGanancia2":
                    newtelefGanancia2 = (JSONArray) map2.get(key2);
                    newtelefGanancia2.add(UltimoLote2.getText());
                    obj.put(key2, newtelefGanancia2);
                    break;
                case "numTelefonosTotal1":
                    newtelefTotal1 = (JSONArray) map2.get(key2);
                    newtelefTotal1.add(TelefonosPlanta1.getText());
                    obj.put(key2, newtelefTotal1);
                    break;
                case "numTelefonosTotal2":
                    newtelefTotal2 = (JSONArray) map2.get(key2);
                    newtelefTotal2.add(TelefonosPlanta2.getText());
                    obj.put(key2, newtelefTotal2);
                    break;
                case "perdidaJefe1":
                    newperdidaJefe1 = (JSONArray) map2.get(key2);
                    newperdidaJefe1.add(JefePerdido1.getText());
                    obj.put(key2, newperdidaJefe1);
                    break;
                case "perdidaJefe2":
                    newperdidaJefe2 = (JSONArray) map2.get(key2);
                    newperdidaJefe2.add(JefePerdido2.getText());
                    obj.put(key2, newperdidaJefe2);
                    break;
            }
        newJson.add(obj);
        
        try {
            FileWriter file = new FileWriter(new File(System.getProperty("user.dir"), "DataHistorica.json"));            
            file.write(newJson.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newJson.toJSONString());
        
    }
}
