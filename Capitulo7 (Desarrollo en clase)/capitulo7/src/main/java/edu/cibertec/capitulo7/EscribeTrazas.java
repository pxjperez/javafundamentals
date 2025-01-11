/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.capitulo7;

/**
 *
 * @author jpere
 */
public class EscribeTrazas {
    public static void escribir (String Text){
        for(int i=0;i<100;i++ ){
            System.out.println(Text+" - "+i);
        }
    }
    public static synchronized void escribirsync (String Text){
        for(int i=0;i<100;i++ ){
            System.out.println(Text+" - "+i);
        }
    }
}
