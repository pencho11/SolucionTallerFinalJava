package clases.constantes;

public enum MatematicasString {
    TITULO("Menu principal"),
    TITULO_OPCIONES("Opcion de operaciones Matematicas.");

    MatematicasString(String texto) {
        this.texto = texto;
    }

    private String texto;

    public String getTexto() {
        return texto;
    }
}
