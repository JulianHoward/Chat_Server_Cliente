import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerFrame extends JFrame implements ActionListener {


    private final static Logger logger = (Logger) LogManager.getRootLogger();
    private ImagenObjeto modelo;
    private JLabel chatLabel = new JLabel("Chat");
    private JLabel participaLabel = new JLabel("Participantes");
    private JPanel chatPanel = new JPanel();
    private JPanel participaPanel = new JPanel();
    private JPanel loginPanel = new JPanel();
    private JButton next = new JButton("Siguiente");
    private JButton back = new JButton("Anterior");


    public ServerFrame() {
        setTitle("Chat");
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        next.addActionListener(this);
        back.addActionListener(this);
        initLog();
    }


    private void initServer() {

        chatPanel.setBackground(Color.DARK_GRAY);
        chatPanel.setBounds(30, 60, 500, 500);

        participaPanel.setBackground(Color.DARK_GRAY);
        participaPanel.setBounds(550, 60, 300, 500);

        chatLabel.setBounds(250, 0, 100, 100);
        chatLabel.setFont(new Font("Italic", 4, 24));

        participaLabel.setBounds(630, 0, 140, 100);
        participaLabel.setFont(new Font("Italic", 4, 24));

        add(chatPanel, null);
        add(participaPanel, null);
        add(chatLabel, null);
        add(participaLabel, null);

    }

    public void initLog() {
        modelo = new ImagenObjeto(900, 900);
        panelImagen fondo = new panelImagen(modelo);
        modelo.addObserver(fondo);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(fondo, BorderLayout.CENTER);

        Login log = new Login(modelo);
        log.hacer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
