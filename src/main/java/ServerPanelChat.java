import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ServerPanelChat extends JPanel {

    private JTextArea areaChat;
    private final static Logger logger = (Logger) LogManager.getRootLogger();

    public ServerPanelChat() {
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        logger.debug("Pinta panel azul");
    }


    public Dimension getPreferredSize() {
        return new Dimension(600, 1000);
    }


}
