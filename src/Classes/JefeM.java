/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import static Classes.Main.tiempoDia;
import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author massimo
 */
public class JefeM extends Thread {
    public boolean stop;
    public int diaActual = 0;
    
    
    private int threadNumber;

    public JefeM (int threadNumber){
        //this.mutexPinesM = mutexPinesM;
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
            
            
            
            if (Main.contadorMassimo > 0) {
                
            
//            mutex.acquire();

            Main.mutexContadorM.acquire();

            Thread.sleep(tiempoDia*208,3);
            
            
            Main.contadorMassimo--;
            diaActual++;
            
            InterfazPlantas.countdownJOSE.setText(Integer.toString(Main.contadorMassimo));       
            //Cuantos ganancia de telefonos  al dia
            int gastosPlantaM = (Main.numEnsambladoresM*diaActual*6)+(Main.numGerenteM*diaActual*180)+(Main.numJefeM*diaActual*7)+(Main.numProductoresPantallas*diaActual*3)+(Main.numProductoresBotones*diaActual*4)+(Main.numProductoresCamaras*diaActual*5)+(Main.numProductoresPines*diaActual*5)-Main.descuentoJefeM;
            int ingresoTelefonos = Main.almacenTelefonosM*1199;
            
            InterfazPlantas.UltimoLote2.setText(Integer.toString(ingresoTelefonos));  
            
            InterfazPlantas.GastosSalario2.setText(Integer.toString(gastosPlantaM));
            
            InterfazPlantas.GananciasTotales2.setText(Integer.toString(ingresoTelefonos-gastosPlantaM));             
            
            
            Main.mutexContadorM.release();
            
            for (int i = 0; i < 29; i++) {
                Main.stadoJefeM = "Jugando";
                InterfazPlantas.TextJefePlanta3.setText(Main.stadoJefeM); 
                Thread.sleep(tiempoDia*13,2);
                Main.stadoJefeM = "Haciendo papeleo";
                InterfazPlantas.TextJefePlanta3.setText(Main.stadoJefeM); 
                Thread.sleep(tiempoDia*13,2);
                
                
                
            }
            
            }else{
                
                this.stopToggle();
            }

    
            
        } catch (InterruptedException ex) {
            Logger.getLogger(JefeM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }    
}
