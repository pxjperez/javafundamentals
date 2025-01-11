/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.ejercicio4;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author jpere
 */
public class ManipularXML {
    public static void main(String[] args) {
        try {
            //JAXB
            JAXBContext jaxB= JAXBContext.newInstance(Producto.class);
            Marshaller jaxM = jaxB.createMarshaller();
            jaxM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            Producto poducto = new Producto(1,"FIDEOS",15.5);
            File file = new File("src/main/resource/Producto.xml");
            jaxM.marshal(poducto, file);
        } catch (Exception ex) {
            Logger.getLogger(ManipularXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
