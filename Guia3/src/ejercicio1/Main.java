package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Ingrese el ISBN del libro");
        String isbn = scan.nextLine();
        System.out.println("Ingrese el Titulo del libro");
        String titulo = scan.nextLine();
        System.out.println("Ingrese el Autor del libro");
        String autor = scan.nextLine();
        System.out.println("Ingrese el numero de paginas");
        int numPag = scan1.nextInt();

        Libro librito = new Libro(isbn, titulo, autor, numPag);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("El ISBN del libro es: " + librito.getIsbn());
        System.out.println("El Titulo del libro es " + librito.getTitulo());
        System.out.println("El Autor del libro es " + librito.getAutor());
        System.out.println("Contiene" + librito.getNumPag() + " " + "Paginas en total");
        System.out.println("----------------------------------------------------------------------");
    }

}
