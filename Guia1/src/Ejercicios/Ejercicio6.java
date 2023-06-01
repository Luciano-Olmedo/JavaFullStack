package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto");
        double precio = s.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = s.nextDouble();
       
        double totalAPagar = (double)((precio)-(precio * descuento)/100);
        System.out.println("El total a pagar es:" + totalAPagar);
        
    }
}
