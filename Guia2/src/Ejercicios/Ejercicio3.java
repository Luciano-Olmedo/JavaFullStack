package Ejercicios;

import java.util.Scanner;
import java.util.Arrays;

/*

Escribir un programa que ordene un arreglo de números enteros de
manera ascendente

 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ordenar");
        int nums = scan.nextInt();
        System.out.println("Ingrese " + nums + " numeros:");

        int[] numeros = new int[nums];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();
        }
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}
