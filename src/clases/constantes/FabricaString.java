package clases.constantes;

public enum FabricaString
{
    TITULO("Ver salarios."),
    NOMBRE("Saludos\nIngresar su nombre: "),
    DIURNO("--DIURNO--"),
    HOLA("\n Hola "),
    SALARIO_DIURNO("\n\nSalario diurno: $"),
    SALARIO_FESTIVO("\nSalario festivo(s): $"),
    NOCTURNO("--NOCTURNO--"),
    SALARIO_NOCTURNO("\n\nSalario nocturno: $"),
    TOTAL_COBRAR("\nTotal a cobrar: $" );

    private String fms;

    FabricaString(String fms) {
        this.fms = fms;
    }

    public String getFms() {
        return fms;
    }
}
