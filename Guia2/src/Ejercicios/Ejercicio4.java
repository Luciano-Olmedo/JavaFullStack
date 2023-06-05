package Ejercicios;

import java.util.Scanner;

/*

Escribir un algoritmo que calcule el factorial de un número ingresado
por teclado.
Tip: el factorial de un número n es el resultado de multiplicar todos
los números enteros desde 1 hasta n.
Por ejemplo, el factorial de 5 es 1 × 2 × 3 × 4 × 5 = 120.

 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero para calcular su factorial:");
        int numero = scan.nextInt();
        int numeroCalculado = numero;

        int factorial = 1;

        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println("El factorial del numero"+" "+ numeroCalculado +" "+ "es:" + factorial);
    }

}


