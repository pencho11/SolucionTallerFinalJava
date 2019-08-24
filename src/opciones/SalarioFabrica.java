package opciones;

import clases.fabrica.FabricaLogico;
import menu.Menu;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static clases.constantes.FabricaInt.QUINIENTOS;
import static clases.constantes.FabricaInt.SEISSIENTOS;
import static clases.constantes.FabricaString.*;
import static clases.constantes.MonedaString.FORMULA;

public class SalarioFabrica extends Frame {

    private static FabricaLogico fabricaLogico = new FabricaLogico();

    private JTextField txtDiurno;
    private JTextField txtDiurnoF;
    private JTextField txtNocturno;
    private JTextField txtNocturnoF;
    private JButton btnResultado;
    private JLabel lblTotal;
    private JPanel salariofabricaform;
    private JButton btnSalir;
    private JLabel lblTotal2;
    private JButton btnResultado2;

    public SalarioFabrica()
    {
        add(salariofabricaform);
        setTitle(TITULO.getFms());
        setSize(QUINIENTOS.getFab(), SEISSIENTOS.getFab());

        DecimalFormatSymbols simbolo = new DecimalFormatSymbols() ;
        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.') ;

        DecimalFormat formateador = new DecimalFormat( FORMULA.getTexto(), simbolo ) ;

        fabricaLogico.setNombre(JOptionPane.showInputDialog(null, NOMBRE.getFms() ));

        btnSalir.addActionListener(e ->
        {
            Menu menu= new Menu();
            menu.setVisible(true);
            esconderVentana();
        });

        btnResultado.addActionListener(e ->
        {
            dato(txtDiurno.getText(), txtDiurnoF.getText());

            lblTotal.setText(String.valueOf(formateador.format(fabricaLogico.totalDiurna())));
            lblTotal2.setText(String.valueOf(formateador.format(fabricaLogico.festivoDiurna())));

            JOptionPane.showMessageDialog(null, DIURNO.getFms()+HOLA.getFms()+ fabricaLogico.getNombre()  +SALARIO_DIURNO.getFms()+
                    formateador.format(fabricaLogico.totalDiurna())+SALARIO_FESTIVO.getFms()+formateador.format(fabricaLogico.festivoDiurna())
                    + TOTAL_COBRAR.getFms() + formateador.format(fabricaLogico.totalDiurna() + fabricaLogico.festivoDiurna()));
        });

        btnResultado2.addActionListener(e ->
        {
            dato(txtNocturno.getText(), txtNocturnoF.getText());

            lblTotal.setText(String.valueOf(formateador.format(fabricaLogico.totalNocturno())));
            lblTotal2.setText(String.valueOf(formateador.format(fabricaLogico.festivoNocturno())));

            JOptionPane.showMessageDialog(null, NOCTURNO.getFms()+HOLA.getFms()+ fabricaLogico.getNombre()+SALARIO_NOCTURNO.getFms()+
                    formateador.format(fabricaLogico.totalNocturno())+SALARIO_FESTIVO.getFms()+formateador.format(fabricaLogico.festivoNocturno())
                    + TOTAL_COBRAR.getFms() + formateador.format(fabricaLogico.totalNocturno() + fabricaLogico.festivoNocturno()));
        });
    }

    private void esconderVentana(){
        this.dispose();
    }

    private void dato(String valor1, String valor2)
    {
        fabricaLogico.setValor(Double.parseDouble(valor1));
        fabricaLogico.setValor2(Double.parseDouble(valor2));
        lblTotal.setVisible(true);
        lblTotal2.setVisible(true);
    }
}