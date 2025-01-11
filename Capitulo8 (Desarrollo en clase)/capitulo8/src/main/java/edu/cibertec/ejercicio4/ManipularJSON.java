/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio4;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpere
 */
public class ManipularJSON {
    public static void main(String[] args) {
        try {

            Producto poducto = new Producto(1,"FIDEOS",15.5);
            File file = new File("src/main/resource/Producto.json");
            ObjectMapper obm= new ObjectMapper();
            obm.writeValue(file, poducto);           
            
        } catch (Exception ex) {
            Logger.getLogger(ManipularJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
