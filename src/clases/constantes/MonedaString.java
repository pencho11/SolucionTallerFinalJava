package clases.constantes;

public enum MonedaString
{
    FORMULA("###,###.##"),;

    private String texto;

    public String getTexto() {
        return texto;
    }

    MonedaString(String texto) {
        this.texto = texto;
    }
}
