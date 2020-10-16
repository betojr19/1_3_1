import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

/**
 *
 * @author Beto Jr
 */
public class VentanaBotonEscuchar extends JFrame implements ActionListener{
    JPanel panelBoton;
    JLabel etiqueta;
    JButton boton;
    
    public VentanaBotonEscuchar (){
    etiqueta = new JLabel();
    panelBoton = new JPanel();
    boton = new JButton();
    panelBoton.add(boton);
    this.getContentPane().setLayout(new BorderLayout());
    this.getContentPane().add(etiqueta, "North");
    this.getContentPane().add(panelBoton, "South");
    boton.addActionListener(this);
    this.setSize(300,100);
    this.setTitle("Ejemplo de un boton con Evento 2");
    this.show();
}
    
    @Override
    public void actionPerformed(ActionEvent e){
        etiqueta.setText("Boton pulsado: " + new Date());
    }
    
    public static void main(String[] args){
        new VentanaBotonEscuchar();
    }
            
}