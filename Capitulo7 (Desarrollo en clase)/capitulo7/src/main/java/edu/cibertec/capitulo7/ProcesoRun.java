/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.capitulo7;

/**
 *
 * @author jpere
 */
public class ProcesoRun implements Runnable {

//    Thread hilo;
//
//    public ProcesoRun() {
//        hilo=new Thread(this,"Proceso Run");
//        hilo.start();
//    }
    private String nombre; 

    public ProcesoRun(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        Persona person=new Persona("Juan", "juano@pg");
        //EscribeTrazas.escribirsync("JUAN THREAD");
        for(int i=0; i<=20; i++){
            System.out.println(this.nombre+" - "+i+" - "+person.getNombre());
            
        }  
    }
    
}
