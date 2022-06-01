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
    
    public Semaphore mutex = new Semaphore(1);
    public boolean stop;
    public GerenteJ (){
        this.stop = true;
        
    }
    
    @Override
    public void run(){
        System.out.println("A");
    }
}
