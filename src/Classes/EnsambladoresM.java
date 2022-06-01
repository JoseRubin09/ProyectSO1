/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import Interfaces.InterfazPlantas;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author massimo
 */
public class EnsambladoresM extends Thread{
    
    
    public Semaphore semMain;
    
    public boolean stop;
   
    private int threadNumber;
    
    
    public EnsambladoresM (int threadNumber){
        //this.mutexEnsambladorM = mutexEnsambladorM;
        this.stop = true;
        this.threadNumber = threadNumber;
        
    }
    
    
    public void stopToggle(){
        this.stop = !this.stop;
    }
    
    public void run(){
        
        while (this.stop ){
            

            //System.out.println("cccc");
                
            
            try {
                
                //System.out.println("AAAAAAA");
                
                
                Main.mutexEnsambladorM.acquire();
                
                
                if (Main.almacenPantallasM>=1 && Main.almacenCamarasM>=4 && Main.almacenBotonesM>= 3 && Main.almacenPinesM>=1 ) {
                
                System.out.println("bbbb");
                Main.semEnsamblador.acquire();
                
                //Saca 1 pantalla del almacen
                Main.mutexPantallas.acquire();
                
                Main.almacenPantallasM--;
                InterfazPlantas.AlmacenPantallasP2.setText(Integer.toString(Main.almacenPantallasM));
                Main.semPantallas.release();
                
                Main.mutexPantallas.release();
                
                //Saca 4 camaras del almacen
                Main.mutexCamaras.acquire();
                
                Main.almacenCamarasM = Main.almacenCamarasM-4;
                InterfazPlantas.AlmacenCamsP2.setText(Integer.toString(Main.almacenCamarasM));
                Main.semCamaras.release(4);
          
        
                Main.mutexCamaras.release();
                
                //Saca 3 botones del almacen
                Main.mutexBotones.acquire();
                
                Main.almacenBotonesM = Main.almacenBotonesM -3;
                InterfazPlantas.AlmacenBotonesP2.setText(Integer.toString(Main.almacenBotonesM)); 
                Main.semBotones.release(3);
            
                
                Main.mutexBotones.release();
                
                //Saca 1 pin del almacen
                Main.mutexPines.acquire();
                
                Main.almacenPinesM--;
                InterfazPlantas.AlmacenPinesP2.setText(Integer.toString(Main.almacenPinesM));
                Main.semPines.release();
                
                Main.mutexPines.release();
                
                //agrega 1 telefono
                
                
                
                Main.almacenTelefonosM++;
                
                InterfazPlantas.TelefonosPlanta2.setText(Integer.toString(Main.almacenTelefonosM));        
                
                System.out.println("Ensamblador " + threadNumber + " produjo telefono " + Main.almacenTelefonosM +"\n");
    
                
                
                
                Main.mutexEnsambladorM.release();

                Thread.sleep(2000);
                
                
                }else{
                    Main.mutexEnsambladorM.release();
                    
                
                }
                    
            } catch (InterruptedException ex) {
                Logger.getLogger(EnsambladoresM.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

            
        }
    }
    

