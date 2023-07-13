package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un valor para calcular el radio y el perimetro");
        double num = scan.nextInt();

        Circunferencia circle = new Circunferencia(num);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("El radio es: " + circle.getArea());
        System.out.println("El perimetro es: " + circle.getPerimetro());
        System.out.println("----------------------------------------------------------------------------");

    }

}
