/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.laboratorio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jpere
 */
public class ColaCocina extends Thread {

    public static List<Plato> atencion = new ArrayList<>();
    public static boolean cocinaAbierta = true;

    @Override
    public void run() {
        while (cocinaAbierta) {
            try {

                System.out.println("---- SE ESTAN PROCESANDO LOS SIGUIENTES PLATOS");
                atencion.stream().forEach(System.out::println);
                sleep(3000);
                Iterator<Plato> itera=atencion.iterator();
                while (itera.hasNext()) {
                    Plato plato=itera.next();
                    plato.setContador(plato.getContador() + 1);
                    if (plato.getContador() == plato.getDuracion()) {
                        System.out.println("SE PREPARO: " + plato.getNombre());
                        itera.remove();
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("OCURRIO UN ERROR GRAVE");
            }
        }

    }

}
