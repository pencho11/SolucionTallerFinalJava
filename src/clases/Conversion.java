package clases;

import static clases.constantes.Moneda.CERO;

public class Conversion
{
    private double euro;

    private double dolar;

    private double yen;

    public Conversion(double euro, double dolar, double yen) {
        this.euro = euro;
        this.dolar = dolar;
        this.yen = yen;
    }

    public Conversion() {
        this.euro = CERO.getMon();
        this.dolar = CERO.getMon();
        this.yen = CERO.getMon();
    }

    public double getEuro() {
        return euro;
    }


    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getYen() {
        return yen;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }
}
