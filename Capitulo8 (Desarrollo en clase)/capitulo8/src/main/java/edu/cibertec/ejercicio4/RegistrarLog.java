/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpere
 */
public class RegistrarLog {
      public static void main(String[] args) {
        try { 

            FileWriter fw=new FileWriter("src/main/resource/producto.log"); 
            Producto  producto = new Producto(1,"Arroz",15.5);
            fw.write("El usuario inserto un producto: "+producto.toString());
            fw.close();
            
        } catch (Exception ex) {
            
        }
       
    }
}
