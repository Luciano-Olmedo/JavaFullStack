
package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el monto en pesos a calcular");
        double pesos = s.nextDouble();
        
        double dolar = pesos / (231.68);
        double euro = pesos / (250.69);
        double guaranies = pesos / (31);
        double reales = pesos / (46.81);
        
        System.out.println("El equivalente en dolares es:" + dolar);
        System.out.println("El equivalente en euros es:" + euro);
        System.out.println("El equivalente en guaranies es:" + guaranies);
        System.out.println("El equivalente en reales es:" + reales);
        
        
        
        
        
    }    
}
