/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.capitulo7;

/**
 *
 * @author jpere
 */
public class Proceso extends Thread {

    public Proceso(String nombreThread) {
        super(nombreThread);
    }

    @Override
    public void run() {
        for(int i=0; i<=20; i++){
            System.out.println(this.getName()+" - "+i);
        }        
    }
    
    
    
}
