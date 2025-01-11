/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.laboratorio1;

import java.util.Scanner;

/**
 *
 * @author jpere
 */
public class Pedido {

    public static void main(String[] args) throws InterruptedException {
        ColaCocina cola = new ColaCocina();
        cola.start();
        System.out.println("INGRESE LOS PLATOS A PREPARA");
        System.out.println("1.- LOMO SALTADO");
        System.out.println("2.- AJI DE GALLINA");
        System.out.println("3.- FREJOL CON SECO");

        int numPlato = 1;

        while (numPlato > 0) {
            Scanner consola = new Scanner(System.in);
            numPlato = consola.nextInt();
            switch (numPlato) {
                case 1:
                    cola.atencion.add(new Plato("LOMO SALTADO", 5));
                    break;
                case 2:
                    cola.atencion.add(new Plato("AJI DE GALLINA", 5));
                    break;
                case 3:
                    cola.atencion.add(new Plato("FREJOL CON SECO", 5));
                    break;

            }

        }
        System.out.println("YA NO SE RECIBEN MAS PEDIDO¡¡¡¡¡");
        Thread.sleep(2000);
        ColaCocina.cocinaAbierta = false;
    }
}
