package clases;

import static clases.constantes.FabricaInt.CERO;

public class Fabrica
{
    private String nombre;

    private double valor;

    private double valor2;

    public Fabrica() {
        this.valor = CERO.getFab();
        this.valor2 = CERO.getFab();
    }

    public Fabrica(double val1, double val2) {
        this.valor = val1;
        this.valor2 = val2;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
