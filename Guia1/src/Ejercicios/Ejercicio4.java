
package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la altura de la primer persona"); 
        double altura1= s.nextDouble();
         System.out.println("Ingrese la altura de la segunda persona"); 
        double altura2= s.nextDouble();
         System.out.println("Ingrese la altura de la tercer persona"); 
        double altura3= s.nextDouble();
        
        double promedioAltura = (altura1 + altura2 + altura3 )/3;
        System.out.println("El promedio de las alturas es :"+ promedioAltura);
        
        
    }    
}
