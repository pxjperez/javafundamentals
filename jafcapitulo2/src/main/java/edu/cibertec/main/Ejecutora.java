/**
 * @author : JUAN CARLOS PEREZ GIL
 * @descripción : Objeto AuthenticatorController
 * @fecha_de_creación : 02-04-2023
 * @fecha_de_ultima_actualización : 02-04-2023
 */

package edu.cibertec.main;

import java.util.Scanner;

/*
    Esta es una clase de prueba
 */
public class Ejecutora {

    public static void main(String[] args) {
        //TIPOS DE DATOS PRIMITIVOS
        boolean clase=true;
        int numero=2147483647;
        long resultado=(long)numero+(long)1;
        char caracter='e';
        double decimal=5.6;
        System.out.println("Resultado de un numero entero (int): " + numero);
        System.out.println("Resultado de un numero entero (long): " + resultado);
        System.out.println("Resultado de un caracter: " + caracter);
        System.out.println("Resultado de un decimal: " + decimal);
        
        //OPERADORES ARITMETICOS
        int numero1=8;
        int numero2=4;
        int resultadoSuma=numero1+numero2;
        int resultadoResta=numero1-numero2;
        int resultadoMultiplicacion=numero1*numero2;
        int resultadoDivision=numero1/numero2;
        int resultadoModulo=numero1%numero2;
//        numero1++;
//        int resultadoIncremento=numero1;
        int resultadoIncremento=++numero1;
//        numero1--;
//        int resultadoDecremento=numero1;
        int resultadoDecremento=--numero1;
        System.out.println("resultadoSuma:" + resultadoSuma);
        System.out.println("resultadoResta:" + resultadoResta);
        System.out.println("resultadoMultiplicacion:" + resultadoMultiplicacion);
        System.out.println("resultadoDivision:" + resultadoDivision);
        System.out.println("resultadoModulo:" + resultadoModulo);
        System.out.println("resultadoIncremento:" + resultadoIncremento);
        System.out.println("resultadoDecremento:" + resultadoDecremento);
        
        //OPERADORES DE RELACION
        boolean resp1=numero1==numero2;
        boolean resp2=numero1!=numero2;
        boolean resp3=numero1<numero2;
        boolean resp4=numero1<=numero2;
        boolean resp5=numero1>numero2;
        boolean resp6=numero1>=numero2;
        
        System.out.println("El numero numero1 es: "+numero1+" el numero2 es: "+numero2);
        System.out.println("resp1: "+resp1);
        System.out.println("resp2: "+resp2);
        System.out.println("resp3: "+resp3);
        System.out.println("resp4: "+resp4);
        System.out.println("resp5: "+resp5);
        System.out.println("resp6: "+resp6);
        
        //OPERADORES LOGICOS
        boolean respl1=resp1&&resp2;
        System.out.println(respl1);
        boolean respl2=resp2&&resp2;
        System.out.println(respl2);
        
        boolean respl3=resp1||resp2;
        System.out.println(respl3);
        
        boolean respl4=!resp1;
        System.out.println(respl4);
        
         //OPERADORES ASIGNACION         
         int numerobase=1;
         numerobase+=5;         
         System.out.println(numerobase);
         numerobase-=5;         
         System.out.println(numerobase);
         numerobase*=6;         
         System.out.println(numerobase);
         numerobase/=2;         
         System.out.println(numerobase);
        
         //OPERADOR TERNARIO
         int valor=!resp1?5:6;
         System.out.println(valor);
         
         //MANEJO DE CADENAS
         String cadena="mama";
         cadena=cadena+" "+cadena;         
         System.out.println(cadena);
         
         StringBuffer cadenaBuffer=new StringBuffer("mama");
         cadenaBuffer.append(" "+cadenaBuffer);
         System.out.println(cadenaBuffer);
         
         StringBuilder cadenaBuilder=new StringBuilder("mama");
         cadenaBuilder.append(" "+cadenaBuilder);
         System.out.println(cadenaBuffer);
         
        //TIPOS DE DATOS CLASE WRAPPE
        int numeroEntero=4;
        Integer miNumeroEntero=numeroEntero;
        
        Double  miNumerDouble=miNumeroEntero.doubleValue();
        
        System.out.println(miNumerDouble.toString());
        
        float numeroFloat=2;
        Float miNumeroFloat=null;
         
        System.out.println(miNumeroFloat);
        
        
        //DEPURACION
        System.out.println("INGRESE UN NUMERO:");
        Scanner datoConsola= new Scanner(System.in);
        
        Integer numeroConsola=datoConsola.nextInt();
        
        Double resultadoConsola= numeroConsola.doubleValue()+5;
        System.out.println(resultadoConsola);
        
    }
}
