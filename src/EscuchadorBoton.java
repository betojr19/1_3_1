import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

/**
 *
 * @author Beto Jr
 */
class EscucharBoton implements ActionListener{
    JLabel etiqueta;
    
    public EscucharBoton (JLabel etiq){ 
        this.etiqueta = etiq;
    }
    
    public void actionPerfomed (ActionEvent e){
        etiqueta.setText("Boton pulzado: " + new Date());
    }
}

public class VentanaBoton extends JFrame{
    JPanel panelBoton;
    JLabel etiqueta;
    JButton boton;
    
    public VentanaBoton(){
        etiqueta = new JLabel();
        panelBoton =new JPanel();
        boton = new JButton("Pulsa aqui");
        panelBoton.add(boton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(etiqueta,"North");
        this.getContentPane().add(panelBoton,"South");
        EscucharBoton escuchar = new EscucharBoton(etiqueta);
        boton.addActionListener(escuchar);
        this.setSize(300,100);
        this.setTitle("Ejemplo de un boton con Evento");
        this.show();
    }
    
    public static void main(String[] args ){
        new VentanaBoton();
    }
}
