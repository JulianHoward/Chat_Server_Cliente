import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main_Server extends JFrame implements ActionListener{


    private final static Logger logger = (Logger) LogManager.getRootLogger();
    private ImagenObjeto modelo;


    private JButton mostrarLogIn = new JButton("Next");
    private JButton mostrarChats = new JButton("Siguiente");


    public Main_Server() {
        setTitle("Bienvenido a Whatsapp 2.0");
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        mostrarLogIn.addActionListener(this);
        mostrarChats.addActionListener(this);
        caratula();
        setVisible(true);
    }




    public void caratula() {
        modelo = new ImagenObjeto(900, 900);
        panelImagen fondo = new panelImagen(modelo);
        modelo.addObserver(fondo);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(fondo, BorderLayout.CENTER);

        Pintar_Caratula_Imagen caratula = new Pintar_Caratula_Imagen(modelo);
        caratula.hacer();

        ImageIcon iconoNext = new ImageIcon("next.jpg");
        mostrarLogIn = new JButton("", iconoNext);
        mostrarLogIn.addActionListener(this);
        mostrarLogIn.setLocation(670,600);
        mostrarLogIn.setSize(160,45);
        mostrarLogIn.setFont(new Font("Italic", 4, 18));
        fondo.add(mostrarLogIn);
    }


    public static void main(String[] args) {
        new Main_Server();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if(clicked.equals(mostrarLogIn)){
            Frame_para_IP_Puerto ipPuerto = new Frame_para_IP_Puerto();
            setVisible(false);
        }
    }
}
