/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.cibertec.capitulo7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpere
 */
public class Ejecutora {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("=========USANDO LA CLASE THREAD========");
        Proceso hilo1=new Proceso("Proceso1");
        Proceso hilo2=new Proceso("Proceso2");
        hilo1.start();
        hilo2.start();        
        Long valor=new Long (1);
        try {
            hilo2.sleep(valor);
            hilo1.stop();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejecutora.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        System.out.println("=========USANDO LA INTERFACE RUNNABLE========");
        //ProcesoRun procesoRun=new ProcesoRun();
        ProcesoRun procesoRun1=new ProcesoRun("Proceso Run1");
        Thread thread1=new Thread(procesoRun1);
        thread1.start();
        ProcesoRun procesoRun2=new ProcesoRun("Proceso Run2");
        Thread thread2=new Thread(procesoRun2);
        thread2.start();
        
        new Thread (()-> EscribeTrazas.escribirsync("Ejecutando Thread")).start(); 
        EscribeTrazas.escribirsync("Main Thread:");
        
    }
}
