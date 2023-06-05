package Ejercicios;

import java.util.Scanner;
/*

Escribir un programa que lea una palabra por teclado y determine si
es un palíndromo.
Tip: los palíndromos son palabras que se leen igual de izquierda a
derecha y viceversa. Por ejemplo, reconocer.

 */

public class Ejercicio2 {

    public static void main(String[] args) {
        int der = 0;
        int izq = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la palabra ");
        String palabra = s.nextLine();         
        palabra= palabra.toLowerCase();        
        der = palabra.length() - 1;
        while (palabra.charAt(izq) == palabra.charAt(der) && izq <= der) {
            izq= izq + 1;
            der = der - 1;
        }
        if (izq >= der) {
            System.out.println("la palabra " + " " + palabra + " " + "es un palindromo");
        } else {
            System.out.println("la palabra " + " " + palabra + " " + "no es un palindromo");
        }

    }
}
