/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.laboratorio2;



/**
 *
 * @author jpere
 */
public class Calaculadora {
    public  static int sumarEstatico(int numero1, int numero2){
        return numero1+numero2;
    }
    public  Long sumar(Integer numero1, Integer numero2){
        return numero1.longValue()+numero2.longValue();
    }
    public Integer restar(Integer numero1, Integer numero2){
        return numero1-numero2;
    }
    public Long multiplicar(Long numero1, Long numero2){
        return numero1*numero2;
    }
    public Double dividir(Integer numero1, Integer numero2){
        return numero1.doubleValue()/numero2.doubleValue();
    }
    
     public Double dividirConDecimales(int numero1, int numero2){
        return  (double)numero1/(double)numero2;
    }
    
    public int modulo(int numero1, int numero2){
        return numero1%numero2;
    }
}
