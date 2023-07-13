package ejercicio3;

public class cuentaBancaria {

    private int numero;
    private long dni;
    private double saldo;

    public cuentaBancaria() {
    }

    public cuentaBancaria(int numero, long dni, double saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

    }

    public void Ingresar(double ingreso) {
        this.saldo += ingreso;

    }

    public void ExtraccionRapida() {
        if (saldo > 0) {
            double retirado = this.saldo * 0.2;
        }
    }

}
