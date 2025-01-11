/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio1;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpere
 */
public class ModificaArchivo {

    public static void main(String[] args) {

        try {
            RandomAccessFile file1 = new RandomAccessFile("src/main/resource/propiedades.properties", "rw");
            Long d = Math.round(Math.random());
            System.out.println(d);
            System.out.println(file1.length());
            file1.seek(d);
            file1.writeUTF("version = 3.2");
            file1.close();
            RandomAccessFile file2 = new RandomAccessFile("src/main/resource/propiedades.properties", "r");
            int valor = file2.read();
            System.out.println(valor);
            while (valor != -1) {
                System.out.print((char) valor);
                valor = file2.read();
            }
        } catch (Exception ex) {
            Logger.getLogger(ModificaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
