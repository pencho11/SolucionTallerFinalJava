package clases.fabrica;

import clases.Fabrica;

import static clases.constantes.FabricaDouble.*;
import static clases.constantes.FabricaInt.CINCUENTA_MIL;
import static clases.constantes.FabricaInt.TREINTA_Y_CINCO_MIL;

public class FabricaLogico extends Fabrica
{
    public double totalDiurna()
    {
        return (this.getValor() * TREINTA_Y_CINCO_MIL.getFab());
    }

    public double festivoDiurna()
    {
        return ((this.getValor2() + CERO_PUNTO_DIEZ.getFb()) * (this.getValor2() * TREINTA_Y_CINCO_MIL.getFab()));
    }

    public double totalNocturno()
    {
        return (this.getValor() * CINCUENTA_MIL.getFab());
    }

    public double festivoNocturno()
    {
        return ((this.getValor2() + CERO_PUNTO_QUINCE.getFb()) * (this.getValor2() * CINCUENTA_MIL.getFab()));
    }

}
