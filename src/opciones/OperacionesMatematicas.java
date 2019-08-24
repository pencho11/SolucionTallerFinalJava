package opciones;

import clases.operaciones.MatematicasLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

import static clases.constantes.MatematicasEnteros.SEISSIENTOS;
import static clases.constantes.MatematicasString.TITULO_OPCIONES;
import static clases.constantes.MatematicasEnteros.QUINIENTOS;

public class OperacionesMatematicas extends Frame {

    private static MatematicasLogica matematicasLogica = new MatematicasLogica();

    protected JPanel operacionesmatematicasform;
    protected JTextField txtNumero2;
    protected JTextField txtNumero1;
    protected JButton btnSuma;
    protected JButton btnResta;
    protected JButton btnMultiplica;
    protected JButton btnDivide;
    protected JButton btnSalir;
    protected JLabel lblResultado;

    public OperacionesMatematicas(){

        add(operacionesmatematicasform);
        setTitle(TITULO_OPCIONES.getTexto());
        setSize(QUINIENTOS.getValor(),SEISSIENTOS.getValor());

        btnSalir.addActionListener(e -> {
                Menu menu= new Menu();
                menu.setVisible(true);
                esconderVentana();
        });

        btnSuma.addActionListener(e -> {
        datos(txtNumero1.getText(),txtNumero2.getText());
            lblResultado.setText(String.valueOf(matematicasLogica.calcularSuma()));
        });

        btnResta.addActionListener(e -> {
        datos(txtNumero1.getText(),txtNumero2.getText());
            lblResultado.setText(String.valueOf(matematicasLogica.calcularResta()));
        });

        btnMultiplica.addActionListener(e -> {
        datos(txtNumero1.getText(),txtNumero2.getText());
            lblResultado.setText(String.valueOf(matematicasLogica.calcularMultiplicacion()));
        });

        btnDivide.addActionListener(e -> {
        datos(txtNumero1.getText(),txtNumero2.getText());
            lblResultado.setText(String.valueOf(matematicasLogica.calcularDivision()));
        });

    }

    private void esconderVentana(){
        this.dispose();
    }

    private void datos(String valor1, String valor2){
        matematicasLogica.setNumero1(Double.parseDouble(valor1));
        matematicasLogica.setNumero2(Double.parseDouble(valor2));
        lblResultado.setVisible(true);
    }
}
