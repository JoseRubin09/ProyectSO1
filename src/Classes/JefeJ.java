/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.Main.numEnsamblador;
import static Classes.Main.pilaEnsambladoresJ;
import static Classes.Main.pilaProductoresBotonesJ;
import static Classes.Main.pilaProductoresCamarasJ;
import static Classes.Main.pilaProductoresPantallasJ;
import static Classes.Main.pilaProductoresPinesJ;
import static Classes.Main.tiempoDia;
import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Rubin
 */
public class JefeJ extends Thread{
    
    public boolean stop;
    public int diaActual = 0;
    private int threadNumber;
    
    public JefeJ (int threadNumber){
        this.stop = true;
        this.threadNumber = threadNumber;
        
    }

    public void stopToggle(){
        this.stop = !this.stop;
    }

    @Override
    public void run(){
        while (this.stop){
        try {
            
            if (Main.countdownPlantaJ > 0) {
                
            Main.mutexCont.acquire();

            Thread.sleep(tiempoDia*208,3);
            
            Main.countdownPlantaJ--;
            diaActual++;
            
            InterfazPlantas.countdownMASSIMO.setText(Integer.toString(Main.countdownPlantaJ));       
            //Cuantos ganancia de telefonos  al dia
            int gastosPlantaJ = (Main.numEnsamblador*diaActual*6)+(1*diaActual*180)+(1*diaActual*7)+(Main.producNumPantJ*diaActual*3)+(Main.producNumBotonesJ*diaActual*4)+(Main.producNumCamsJ*diaActual*5)+(Main.producNumPinesJ*diaActual*5)-Main.descuentoJefeJ;
            int ingresoTelefonos = Main.numTelef*600;
            
            InterfazPlantas.UltimoLote1.setText(Integer.toString(ingresoTelefonos));  
            
            InterfazPlantas.GastosSalario1.setText(Integer.toString(gastosPlantaJ));
            
            InterfazPlantas.GananciasTotales1.setText(Integer.toString(ingresoTelefonos-gastosPlantaJ));             
            
            
            Main.mutexCont.release();
            
            for (int i = 0; i < 29; i++) {
                Main.estadoJefeJ = "Jugando";
                InterfazPlantas.TextJefePlanta1.setText(Main.estadoJefeJ); 
                Thread.sleep(tiempoDia*13,2);
                Main.estadoJefeJ = "Haciendo papeleo";
                InterfazPlantas.TextJefePlanta1.setText(Main.estadoJefeJ); 
                Thread.sleep(tiempoDia*13,2);
            }
            
            }else{
                
                //SE MATAN TODOS LOS THREADS
                while(!pilaProductoresPantallasJ.isEmpty()){
                    pilaProductoresPantallasJ.peek().stopToggle();
                    pilaProductoresPantallasJ.pop();
                
                }
        
                while(!pilaProductoresBotonesJ.isEmpty()){
                    pilaProductoresBotonesJ.peek().stopToggle();
                    pilaProductoresBotonesJ.pop();
            
                }
        
                while(!pilaProductoresCamarasJ.isEmpty()){
                    pilaProductoresCamarasJ.peek().stopToggle();
                  pilaProductoresCamarasJ.pop();
            
                }
        
                while(!pilaProductoresPinesJ.isEmpty()){
                   pilaProductoresPinesJ.peek().stopToggle();
                   pilaProductoresPinesJ.pop();
            
                }   
                while(!pilaEnsambladoresJ.isEmpty()){
                 pilaEnsambladoresJ.peek().stopToggle();
                 pilaEnsambladoresJ.pop();
            
                }  
        
        
                //mato los threads gerente y jefe
                Classes.Main.gerenteJ.stopToggle();
                Classes.Main.jefeJ.stopToggle();

            }

    
            
        } catch (InterruptedException ex) {
            Logger.getLogger(JefeJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }   
}
