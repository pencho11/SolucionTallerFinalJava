package opciones;

import clases.conversion.ConversionLogico;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

import java.text.DecimalFormat ;
import java.text.DecimalFormatSymbols ;

import static clases.constantes.Moneda.SEISSIENTOS;
import static clases.constantes.MonedaString.FORMULA;
import static clases.constantes.Moneda.QUINIENTOS;

public class ConvertirMoneda extends Frame
{

    private static ConversionLogico conversionLogico = new ConversionLogico();

    private JTextField txtEuro;
    private JPanel conversionmonedaform;

    private JButton btnConvertir;
    private JButton btnSallir;

    private JLabel lblEuro;
    private JLabel lblDolar;
    private JLabel lblYen;
    private JTextField txtDolar;
    private JTextField txtYen;

    public ConvertirMoneda() {

        DecimalFormatSymbols simbolo = new DecimalFormatSymbols() ;
        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.') ;

        DecimalFormat formateador = new DecimalFormat( FORMULA.getTexto(), simbolo ) ;

        add(conversionmonedaform);
        setTitle("Conversión moneda.");
        setSize(QUINIENTOS.getMon(), SEISSIENTOS.getMon());

        btnSallir.addActionListener(e ->
        {
            menu.Menu menu= new Menu();
            menu.setVisible(true);
            esconderVentana();
        });

        btnConvertir.addActionListener(e ->
        {
            dato(txtEuro.getText(), txtDolar.getText(), txtYen.getText());

            lblEuro.setText(String.valueOf(formateador.format(conversionLogico.euro())));
            lblDolar.setText(String.valueOf(formateador.format(conversionLogico.dolar())));
            lblYen.setText(String.valueOf(formateador.format(conversionLogico.yen())));
        });
    }

    private void esconderVentana(){
        this.dispose();
    }

    private void dato(String valor1, String valor2, String valor3)
    {
        conversionLogico.setEuro(Double.parseDouble(valor1));
        conversionLogico.setDolar(Double.parseDouble(valor2));
        conversionLogico.setYen(Double.parseDouble(valor3));
        lblEuro.setVisible(true);
        lblDolar.setVisible(true);
        lblYen.setVisible(true);
    }
}
