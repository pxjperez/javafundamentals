/**
 * @author : JUAN CARLOS PEREZ GIL
 * @descripción : Objeto Ejecutora (Esta clase permite hacer la ejecucion)
 * @fecha_de_creación : 02-04-2023
 * @fecha_de_ultima_actualización : 02-04-2023
 */

package edu.cibertec.laboratorio3.controlador;

import edu.cibertec.laboratorio3.logica.Calaculadora;


/**
 * 
 Objeto Ejecutora (Esta clase permite hacer las operaciones basicas de una calculadora)
 * @author Juan Pérez
 * @version 1.0
 * @since 2021-09-01
// * @deprecated Esta clase será eliminada en la próxima versión del sistema.
 */


public class Ejecutora {
    public static void main(String[] args) {
        int numero1=7;
        int numero2=3;
        Calaculadora objetoCalculadora= new Calaculadora();
        System.out.println("La suma desde un metodo estatico es: "+Calaculadora.sumarEstatico(numero1, numero2));
        
        System.out.println("MI CALCULADORA");
        System.out.println("La suma es: "+objetoCalculadora.sumar(numero1, numero2));
        System.out.println("La resta es: "+objetoCalculadora.restar(numero1, numero2));
        System.out.println("La multiplicacion es: "+objetoCalculadora.multiplicar(Long.parseLong(numero1+""), (long)numero2));
        System.out.println("La division es: "+objetoCalculadora.dividir(numero1, numero2));
        System.out.println("La division con decimales: "+objetoCalculadora.dividirConDecimales(numero1, numero2));
        System.out.println("El modulo es: "+objetoCalculadora.modulo(numero1, numero2));
    }
}
