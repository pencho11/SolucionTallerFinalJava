package clases.conversion;

import clases.Conversion;

import static clases.constantes.Moneda.*;

public class ConversionLogico extends Conversion
{
    public double euro(){
        return (this.getEuro() * EURO.getMon());
    }

    public double dolar(){
        return (this.getDolar() * DOLAR.getMon());
    }

    public double yen(){
        return (this.getYen() * YEN.getMon());
    }
}
