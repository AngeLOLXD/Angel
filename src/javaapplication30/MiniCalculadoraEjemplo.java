
package javaapplication30;
/**
 * Clase Calculadora
 * @author: Angel
 * @version: version_1.0
 */
public class MiniCalculadoraEjemplo {

    /**
     * hace el numero absoluto de un numero que recibe
     * @param num Este numero es el que recibe el metodo para hacer el numero absoluto 
     * @return Devuelve el valor absoluto del numero
     */
    public static double valorAbsoluto(double num) {
        Math.abs(num);
        return num;
    }
    public static double Suma(double num1, double num2) {
        return num1+num2;
    }
    /**
     * Hace la raiz de un numero que recibe
     * @param num Este numero es el que recibe el metodo para hacer la raiz cuadrada 
     * @return Devuelve la raiz cuadrada del numero
     */
    public static double raizCuadrada(double num) {
        Math.sqrt(num);
        return num;
    }
    public String hola(){
        return "Hola";
    }
    
}
