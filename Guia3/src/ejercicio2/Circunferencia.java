package ejercicio2;

public class Circunferencia {
    //atributos

    private double radio;

    //constructor vacio y con parametros
    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //getters  y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos de area y perimetro
    public double getArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double getPerimetro() {
        double perimetro = (2 * Math.PI * radio);
        return perimetro;
    }

}
