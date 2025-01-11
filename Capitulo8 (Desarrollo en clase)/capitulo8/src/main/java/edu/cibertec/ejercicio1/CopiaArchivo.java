/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author jpere
 */
public class CopiaArchivo {
    public static void main(String[] args) {
        
        try {
//            FileReader file1 = new FileReader ("src/main/resource/propiedades.properties");
//            FileWriter file2 = new FileWriter("src/main/resource/copia.properties");
            //FORMA 1
//            int valor = file1.read();
//            String datos="";
//            while (valor != -1) {
//                datos=datos+((char) valor);
//                valor = file1.read();
//            }
//            file1.close();
//            file2.write(datos);
//            file2.close();
            //FORMA 2
//            BufferedReader br = new BufferedReader(file1);
//            String linea="";
//            while(linea!=null){
//                linea=br.readLine();
//                file2.write(linea+"\n");
//            }
//            file1.close();
//            file2.close();
            //FORMA 3
            File file1 = new File ("src/main/resource/propiedades.properties");
            File file2 = new File("src/main/resource/copia.properties");
            FileUtils.copyFile(file1, file2);      
           FileReader fileRead = new FileReader("src/main/resource/copia.properties");
            int valor = fileRead.read();
            String datos="";
            while (valor != -1) {
                datos=datos+((char) valor);
                valor = fileRead.read();
            }
            System.out.println(datos);
            fileRead.close();
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
