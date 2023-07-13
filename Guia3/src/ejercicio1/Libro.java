package ejercicio1;

public class Libro {

    //atributos del libro
    private String isbn;
    private String titulo;
    private String autor;
    private int numPag;

    //constructor vacio y constructor con parámetros
    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numPag) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }

    //getters y setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

}
