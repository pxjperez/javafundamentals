/**
 * 
 * @author : JUAN CARLOS PEREZ GIL
 * @descripción : Objeto Calaculadora (Esta clase permite hacer las operaciones basicas de una calculadora)
 * @fecha_de_creación : 02-04-2023
 * @fecha_de_ultima_actualización : 02-04-2023
 */

package edu.cibertec.laboratorio3.logica;

/**
 * 
 Objeto Calaculadora (Esta clase permite hacer las operaciones basicas de una calculadora)
 * @author Juan Pérez
 * @version 1.0
 * @since 2021-09-01
// * @deprecated Esta clase será eliminada en la próxima versión del sistema.
 */

public class Calaculadora {
    
    /**
     Este metodo se utiliza para sumar dos numeros de manera estatica
     * @param numero1
     * @param numero2
     * @return int
     */
    public  static int sumarEstatico(int numero1, int numero2){
        return numero1+numero2;
    }
    
    /**
     Este metodo se utiliza para sumar dos numeros
     * @param numero1
     * @param numero2
     * @return Long
     */
    
    public  Long sumar(Integer numero1, Integer numero2){
        return numero1.longValue()+numero2.longValue();
    }
    
    /**
     Este metodo se utiliza para restar dos numeros
     * @param numero1
     * @param numero2
     * @return Integer
     */
    public Integer restar(Integer numero1, Integer numero2){
        return numero1-numero2;
    }
    
    /**
     Este metodo se utiliza para multiplicar dos numeros
     * @param numero1
     * @param numero2
     * @return Long
     */
    public Long multiplicar(Long numero1, Long numero2){
        return numero1*numero2;
    }
    
    /**
     Este metodo se utiliza para dividir dos numeros
     * @param numero1
     * @param numero2
     * @return Double
     */
    public Double dividir(Integer numero1, Integer numero2){
        return numero1.doubleValue()/numero2.doubleValue();
    }
    
    /**
     Este metodo se utiliza para dividir con decimales dos numeros
     * @param numero1
     * @param numero2
     * @return Double
     */
    public Double dividirConDecimales(int numero1, int numero2){
        return  (double)numero1/(double)numero2;
    }
    
    /**
     Este metodo se utiliza para sacar el modulo dos numeros
     * @param numero1
     * @param numero2
     * @return int
     */
    public int modulo(int numero1, int numero2){
        return numero1%numero2;
    }
}
