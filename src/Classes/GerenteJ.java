/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import static Classes.Main.tiempoDia;
import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Rubin
 */
public class GerenteJ extends Thread{
    
    public boolean stop;
    
    
    private int threadNumber;
    private int MinutosEnUnDia = 1440;
    private int PeriodoTrabajoJ = 0;

    public GerenteJ (){
        //this.mutexPinesM = mutexPinesM;
        this.stop = true;
        
    }
    public void stopToggle(){
        this.stop = !this.stop;
    }
    
    @Override
    public void run(){
        while (this.stop){
            
            
        try {
            
            int MinutosDia = MinutosEnUnDia;

            Main.mutexCont.acquire();
            Main.estadoGerenteJ = "Esperando contador";
            
            InterfazPlantas.TextGerentePlanta1.setText(Main.estadoGerenteJ);
            
            if (Main.countdownPlantaJ> 0) {
            Main.estadoGerenteJ = "trabajando";
            InterfazPlantas.TextGerentePlanta1.setText(Main.estadoGerenteJ);
            
            Main.mutexCont.release();
                
            PeriodoTrabajoJ = (int) (Math.random() * (1080 + 60 - 720)) + 720;
            MinutosDia = MinutosDia-PeriodoTrabajoJ;

                
                while (MinutosDia>90){
                    System.out.println(MinutosDia);
                    
                    
                    
                    int n = (int) (Math.random() * (90 + 1 - 30)) + 30;
                    MinutosDia = MinutosDia-n;
                    
                    if (Main.estadoJefeJ.equalsIgnoreCase("Jugando")) {
                        Main.descuentoJefeJ = Main.descuentoJefeJ+2;
                        
                        
                        InterfazPlantas.JefePerdido1.setText(Integer.toString(Main.descuentoJefeJ));
                        
                    }
                    
                    Thread.sleep(tiempoDia*n);
                }
                
            }else{
                Main.mutexCont.release();
                Main.numTelef =0;
                
            }
            
            Main.estadoGerenteJ = "Casa";
            InterfazPlantas.TextGerentePlanta1.setText(Main.estadoGerenteJ);
            Thread.sleep(tiempoDia*(MinutosEnUnDia-PeriodoTrabajoJ));
            
        } catch (InterruptedException ex) {
            Logger.getLogger(GerenteJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    } 
}
