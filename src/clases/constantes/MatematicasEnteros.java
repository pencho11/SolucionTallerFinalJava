package clases.constantes;

public enum MatematicasEnteros {
    CERO(0),
    QUINIENTOS(500),
    SEISSIENTOS(600);

    private int valor;

     MatematicasEnteros(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
