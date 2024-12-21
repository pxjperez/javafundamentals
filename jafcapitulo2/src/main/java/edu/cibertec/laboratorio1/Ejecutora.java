/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.laboratorio1;

/**
 *
 * @author jpere
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
        System.out.println("La multiplicacion es: "+objetoCalculadora.multiplicar(numero1, numero2));
        System.out.println("La division es: "+objetoCalculadora.dividir(numero1, numero2));
        System.out.println("La division con decimales: "+objetoCalculadora.dividirConDecimales(numero1, numero2));
        System.out.println("El modulo es: "+objetoCalculadora.modulo(numero1, numero2));
    }
}
