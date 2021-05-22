import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;

public class Frame_Chats extends JFrame {

    private final static Logger logger = (Logger) LogManager.getRootLogger();
    private JLabel chatLabel = new JLabel("Chat");
    private JLabel participaLabel = new JLabel("Participantes");
    private JPanel chatPanel = new JPanel();
    private JPanel participaPanel = new JPanel();

    public Frame_Chats(){
        setTitle("Chats");
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        initServerChat();
        setVisible(true);
    }

    private void initServerChat() {

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
}
