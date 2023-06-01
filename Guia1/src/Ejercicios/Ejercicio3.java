package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {      
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = s.nextInt();
        
        int suma = (num1 + num2);
        System.out.println("la suma de los numeros es : " + suma);
        int resta = (num1 - num2);
        System.out.println("la resta de los numeros es : " + resta);
        int multiplicacion = (num1 * num2);
        System.out.println("la multiplicacion de los numeros es : " + multiplicacion);   
        double division = (double)num1 / num2;
        System.out.println("la division de los numeros es : " + division);  
               
    }
}
