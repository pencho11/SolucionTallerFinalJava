package clases.constantes;

public enum FabricaDouble
{
    CERO_PUNTO_DIEZ(0.10),
    CERO_PUNTO_QUINCE(0.15);
    private double fb;

    FabricaDouble(double fb) {
        this.fb = fb;
    }

    public double getFb() {
        return fb;
    }
}
