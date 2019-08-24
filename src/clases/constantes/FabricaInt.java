package clases.constantes;

public enum FabricaInt
{
    CERO(0),
    QUINIENTOS(500),
    SEISSIENTOS(600),
    TREINTA_Y_CINCO_MIL(35000),
    CINCUENTA_MIL(50000);
    private int fab;

    FabricaInt(int fab) {
        this.fab = fab;
    }

    public int getFab() {
        return fab;
    }
}
