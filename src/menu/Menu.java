package menu;

import static clases.constantes.MatematicasString.TITULO;

import opciones.ConvertirMoneda;
import opciones.SalarioFabrica;
import opciones.OperacionesMatematicas;

import javax.swing.*;
import java.awt.*;

public class Menu extends Frame {
    private JPanel menuprincipal;
    private JButton btnOperaciones;
    private JButton btnSalarios;
    private JButton btnConvertir;
    private JButton btnSalir;

    public Menu(){
        add(menuprincipal);
        setTitle(TITULO.getTexto());
        setSize(500,600);

        btnOperaciones.addActionListener(e -> {
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderVentana();
        });

        btnSalarios.addActionListener(e -> {
            SalarioFabrica salarioFabrica = new SalarioFabrica();
            salarioFabrica.setVisible(true);
            esconderVentana();
        });

        btnConvertir.addActionListener(e ->
        {
            ConvertirMoneda convertirMoneda = new ConvertirMoneda();
            convertirMoneda.setVisible(true);
            esconderVentana();
        });

        btnSalir.addActionListener(e ->
        {
            JFrame frame = new JFrame("titulo");
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            System.exit(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }

    private void esconderVentana(){
        this.dispose();
    }


}
