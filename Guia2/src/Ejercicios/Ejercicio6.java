package Ejercicios;

/*

Escribir un algoritmo que imprima el listado de los números primos
menores que 200. Aclaración: el número 1 no es primo.

Tip: un número es primo si es divisible únicamente por 1 y por sí
mismo.
Por ejemplo, el 7 es primo porque sólo es divisible por 1 y por 7.
El 6 no es primo porque es divisible por 1, por 2, por 3 y por 6.

 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int divisibles = 0;
        

        for (int i = 200; i > 0; i--) {
            divisibles = 0;
            for (int f = i; f > 0; f--) {
                if ((i % f) == 0) {
                    divisibles = divisibles + 1;
                }
            }
            if (divisibles == 2) {
                System.out.println(i + " "+ "es un numero primo");
            }
        }

    }

}
