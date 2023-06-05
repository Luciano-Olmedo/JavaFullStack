package Ejercicios;

import java.util.Scanner;

/*
Escribir un programa que reciba un número entero por teclado. A
continuación, mostrar la tabla de multiplicar de ese número.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(i * numero);
            i++;
        }
    }

}
