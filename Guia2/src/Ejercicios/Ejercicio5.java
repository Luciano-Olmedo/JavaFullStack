package Ejercicios;

import java.util.Scanner;

/*

Escribir un algoritmo que lea un valor n por teclado y muestre los
primeros n términos de la sucesión de Fibonacci.
Tip: la sucesión de Fibonacci comienza con 0, luego 1 y a partir de allí
cada nuevo número es la suma de los dos anteriores.

 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver la sucesion de fibonacci");

        int numero = scan.nextInt();

        int resultado = 0;
        int sucesion = 1;
        int resultadoAnterior;

        for (int i = 0; i < numero; i++) {

            resultadoAnterior = resultado;
            resultado = resultadoAnterior + sucesion;
            sucesion = resultadoAnterior;

            System.out.println(sucesion);
        }

    }
}
