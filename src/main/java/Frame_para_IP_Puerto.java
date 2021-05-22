import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame_para_IP_Puerto extends JFrame implements KeyListener {

    private final static Logger logger = (Logger) LogManager.getRootLogger();
    private ImagenObjeto modelo;


    public Frame_para_IP_Puerto(){
        setTitle("Chats");
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        initServerLogIn();
        addKeyListener(this);
        setVisible(true);
    }

    private void initServerLogIn() {
        modelo = new ImagenObjeto(900, 900);
        panelImagen fondo = new panelImagen(modelo);
        modelo.addObserver(fondo);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(fondo, BorderLayout.CENTER);

        Pintar_LogIn_Imagen login = new Pintar_LogIn_Imagen(modelo);
        login.hacer();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            Frame_Chats chats = new Frame_Chats();
            setVisible(false);
        }
    }
}
