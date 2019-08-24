package clases.constantes;

public enum Moneda
{
    CERO(0),
    QUINIENTOS(500),
    SEISSIENTOS(600),
    EURO(3500),
    DOLAR(3000),
    YEN(1500);

    private int mon;

    Moneda(int mon) {
        this.mon = mon;
    }

    public int getMon() {
        return mon;
    }
}
