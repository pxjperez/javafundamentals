/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.laboratorio1;

/**
 *
 * @author jpere
 */
public class Calaculadora {
    public  static int sumarEstatico(int numero1, int numero2){
        return numero1+numero2;
    }
    public  int sumar(int numero1, int numero2){
        return numero1+numero2;
    }
    public int restar(int numero1, int numero2){
        return numero1-numero2;
    }
    public int multiplicar(int numero1, int numero2){
        return numero1*numero2;
    }
    public int dividir(int numero1, int numero2){
        return numero1/numero2;
    }
    
     public double dividirConDecimales(int numero1, int numero2){
        String numeroComoCadena=numero1+"";
        return  (double)numero1/(double)numero2;
    }
    
    public int modulo(int numero1, int numero2){
        return numero1%numero2;
    }
}
