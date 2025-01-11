/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author jpere
 */
public class PruebaNio2 {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resource/","propiedades.properties");
        System.out.println("Nombre: "+path.getFileName());
        System.out.println("Primera Carpeta: "+path.getName(0));
        System.out.println("Numero de nombres: "+path.getNameCount());
        System.out.println("Ruta completa: "+path.toAbsolutePath());
        
        try {
            // IMPRIMIR TODOS LOS ATRIBUTOS DEL ARCHIV
            Map <String, Object> files=Files.readAttributes(path,"*");
            files.forEach((k,v)-> System.out.println("LLAVE: "+k+" VALOR: "+v));
            //MOSTRAR LOS ARCHIVOS DE LA CARPETA
            Path DirectorioPath = Paths.get("src/main/resource/","");
            Stream<Path> paths=Files.list(DirectorioPath);
            //paths.map(p->p.toString()).forEach(p->System.out.println(p));
            paths.map(String::valueOf).forEach(System.out::println);
        } catch (Exception ex) {
            Logger.getLogger(PruebaNio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
