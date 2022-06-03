/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Classes.Main.tiempoDia;
import Interfaces.InterfazPlantas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author massimo
 */
public class GerenteM extends Thread{

    public boolean stop;
    
    
    private int threadNumber;
    private int MinutosEnUnDia = 1440;
    private int PeriodoTrabajoM = 0;

    public GerenteM (int threadNumber){
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
            
            
            
            
//            mutex.acquire();
            int MinutosDia = MinutosEnUnDia;

            Main.mutexContadorM.acquire();
            Main.stadoGerenteM = "Esperando contador";
            
            InterfazPlantas.TextGerentePlanta3.setText(Main.stadoGerenteM);
            
            if (Main.contadorMassimo> 0) {
            Main.stadoGerenteM = "trabajando";
            InterfazPlantas.TextGerentePlanta3.setText(Main.stadoGerenteM);
            
            Main.mutexContadorM.release();
                
            PeriodoTrabajoM = (int) (Math.random() * (1080 + 60 - 720)) + 720;
            MinutosDia = MinutosDia-PeriodoTrabajoM;

                
                while (MinutosDia>90){
                    System.out.println(MinutosDia);
                    
                    
                    
                    int n = (int) (Math.random() * (90 + 1 - 30)) + 30;
                    MinutosDia = MinutosDia-n;
                    
                    if (Main.stadoJefeM.equalsIgnoreCase("Jugando")) {
                        Main.descuentoJefeM = Main.descuentoJefeM+2;
                        
                        
                        InterfazPlantas.JefePerdido2.setText(Integer.toString(Main.descuentoJefeM));
                        
                        
                    }
                    
                    Thread.sleep(tiempoDia*n);
                }
                
                
                
                
            }else{
                Main.mutexContadorM.release();
                Main.almacenTelefonosM =0;
                
            }
            
            Main.stadoGerenteM = "Casa";
            InterfazPlantas.TextGerentePlanta3.setText(Main.stadoGerenteM);
            Thread.sleep(tiempoDia*(MinutosEnUnDia-PeriodoTrabajoM));
            
            
      

    
            
        } catch (InterruptedException ex) {
            Logger.getLogger(GerenteM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    } 
}
