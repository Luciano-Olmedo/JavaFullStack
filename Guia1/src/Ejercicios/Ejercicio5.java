
package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor de la circunferencia a calcular");
        double valorCircunferencia = s.nextDouble();
        double radio = (double)valorCircunferencia/2;
        
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * (Math.PI * radio) ;
        System.out.println("El valor del area es :" + area );
        System.out.println("El valor del perimetro es :" + perimetro );
    }    
}
