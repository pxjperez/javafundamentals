/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpere
 */
public class CreaArchivo {
    public static void main(String[] args) {
        try { 
            ObjectOutputStream objOutput= new ObjectOutputStream(new FileOutputStream ("src/main/resource/producto.txt"));
            Producto  productoOutput = new Producto(1,"Arroz",15.5);
            objOutput.writeObject(productoOutput);
            
            ObjectInputStream objInput= new ObjectInputStream(new FileInputStream ("src/main/resource/producto.txt"));
            Producto  productoInput = (Producto) objInput.readObject();
            System.out.println(productoInput.toString());
            
//        FileWriter fw=new FileWriter("src/main/resource/producto.txt"); 
//        Producto  producto = new Producto(1,"Arroz",15.5);
//        fw.write(producto.toString());
//        fw.close();
            
        } catch (Exception ex) {
            Logger.getLogger(CreaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
