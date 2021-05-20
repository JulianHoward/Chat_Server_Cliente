import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;

public class ServerFrame extends JFrame {


    private final static Logger logger = (Logger) LogManager.getRootLogger();
    private JLabel chatLabel = new JLabel("Chat");
    private JLabel participaLabel = new JLabel("Participantes");
    private JPanel chatPanel = new JPanel();
    private JPanel participaPanel = new JPanel();


    /*private ServerPanelChat serverPanelChat;
    private ServerPanelParticipa serverPanelParticipa;*/

    public ServerFrame() {
        setTitle("Chat");
        setSize(900,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        init();
    }

    private void init() {

        chatPanel.setBackground(Color.DARK_GRAY);
        chatPanel.setBounds(30,60,500,500);

        participaPanel.setBackground(Color.DARK_GRAY);
        participaPanel.setBounds(550,60,300,500);

        chatLabel.setBounds(250,0,100,100);
        chatLabel.setFont(new Font("Italic", 4, 24));

        participaLabel.setBounds(630,0,140,100);
        participaLabel.setFont(new Font("Italic", 4, 24));

        add(chatPanel, null);
        add(participaPanel, null);
        add(chatLabel, null);
        add(participaLabel, null);




        /*serverPanelChat = new ServerPanelChat();
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(serverPanelChat, BorderLayout.WEST);
        serverPanelChat.setLocation(300,500);
        logger.debug("Pone panel chat al west");

        serverPanelParticipa = new ServerPanelParticipa();
        this.getContentPane().add(serverPanelParticipa, BorderLayout.EAST);
        serverPanelParticipa.setLocation(100,200);
        logger.debug("pone panel participa al east");*/
    }
}
