/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Jose Rubin
 */
public class GerenteJ extends Thread{
    
    public Semaphore semMain;
    public Semaphore mutex;
    public boolean stop;
    public GerenteJ (Semaphore semMain){
        this.semMain = semMain;
        this.stop = true;
        
    }
    
    @Override
    public void run(){
        System.out.println("A");
    }
}
