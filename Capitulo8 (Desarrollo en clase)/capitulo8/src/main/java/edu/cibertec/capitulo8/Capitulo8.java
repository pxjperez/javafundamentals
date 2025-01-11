/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.cibertec.capitulo8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author jpere
 */
public class Capitulo8 {

    public static void main(String[] args) throws IOException {
//        FileWriter fw=new FileWriter("D:\\prueba.xml"); 
//        fw.write("CLASE DE JAVA BASICO");
//        fw.close();
//        FileReader fr=new FileReader("D:\\prueba.docx");
//        int valor = fr.read();
//        System.out.println(valor);
//        while(valor!=-1){
//            System.out.print((char)valor);
//            valor=fr.read();
//        }
//        fr.close();
          File file1 = new File("D:\\prueba.docx");
          File file2 = new File("D:\\tmp\\prueba.docx");
          if(file1.exists()){
           System.out.println("SE COPIO EL ARCHIVO");
           FileUtils.copyFile(file1, file2);
           file1.delete();     
          }else{
             file1.createNewFile();
             System.out.println("CREO EL ARCHIVO");
          }
          

    }
}
