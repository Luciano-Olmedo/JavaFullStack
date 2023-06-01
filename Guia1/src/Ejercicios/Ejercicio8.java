
package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los grados celsius"); 
        double celsius= s.nextDouble();
        
        
        double kelvin = celsius +(273.15);
        System.out.println("Los grados kelvin son :" + kelvin);
        double fahrenheit = celsius *(1.8);
        System.out.println("Los grados fahrenheit son :" + fahrenheit);
    }    
}
